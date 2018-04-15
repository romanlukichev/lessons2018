public class Robot {

    private int x;
    private int y;
    private Direction dir;

    public int getY(){
        return y;
    }

    public int getX(){
        return x;
    }

    public Direction getDirection(){
        return dir;
    }

    public void turnRight(){
        if( dir == Direction.RIGHT ){
            this.dir = Direction.DOWN;
            return;
        }
        if( dir == Direction.DOWN ){
            this.dir = Direction.LEFT;
            return;
        }
        if( dir == Direction.LEFT ){
            this.dir = Direction.UP;
            return;
        }
        if( dir == Direction.UP ){
            this.dir = Direction.RIGHT;
            return;
        }
    }

    public void turnLeft(){
        if( dir == Direction.UP ){
            this.dir = Direction.LEFT;
            return;
        }
        if( dir == Direction.LEFT ){
            this.dir = Direction.DOWN;
            return;
        }
        if( dir == Direction.DOWN ){
            this.dir = Direction.RIGHT;
            return;
        }
        if( dir == Direction.RIGHT ){
            this.dir = Direction.UP;
            return;
        }
    }

    public void stepForward(){
        if( dir == Direction.UP ){
            this.y++;
            return;
        }
        if( dir == Direction.DOWN ){
            this.y--;
            return;
        }
        if( dir == Direction.LEFT ){
            this.x--;
            return;
        }
        if( dir == Direction.RIGHT ){
            this.x++;
            return;
        }
    }

    public Robot(int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }
}
