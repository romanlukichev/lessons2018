import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Robot myRobot1 = new Robot( 0, 0, Direction.RIGHT );
        System.out.println();
        showPosition(myRobot1);
        moveRobot(myRobot1,10 , 10);
        System.out.println();
        showPosition(myRobot1);
        System.out.println();

        Robot myRobot2 = new Robot( 0, 0, Direction.RIGHT );
        System.out.println();
        showPosition( myRobot2 );
        moveRobot( myRobot2,0 , 10 );
        System.out.println();
        showPosition( myRobot2 );
        System.out.println();

        Robot myRobot3 = new Robot( 0, 0, Direction.RIGHT );
        System.out.println();
        showPosition( myRobot3 );
        moveRobot( myRobot3,10 , 0);
        System.out.println();
        showPosition( myRobot3 );
        System.out.println();

    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        while( ( robot.getX() != toX ) || ( robot.getY() != toY ) ){

            if( robot.getX() < toX ){
                // if robot is at the left from toX then he must move right
                // we must change robot's direction first
                if( robot.getDirection() == Direction.UP ){
                    robot.turnRight();
                }
                else if( robot.getDirection() == Direction.DOWN ){
                    robot.turnLeft();
                }
                else if( robot.getDirection() == Direction.LEFT ){
                    robot.turnRight(); // turn 180 degrees
                    robot.turnRight();
                }
                // we do not need to write code for condition if( robot.getDirection() == RIGHT )
                robot.stepForward();
                System.out.println("step right,");
            }
            else if( robot.getX() > toX ){
                // if robot is at the right from toX then he must move left
                // we must change robot's direction first
                if( robot.getDirection() == Direction.UP ){
                    robot.turnLeft();
                }
                else if( robot.getDirection() == Direction.DOWN ){
                    robot.turnRight();
                }
                else if( robot.getDirection() == Direction.RIGHT ){
                    robot.turnRight();  // turn 180 degrees
                    robot.turnRight();
                }
                // we do not need to write code for condition if( robot.getDirection() == LEFT )
                robot.stepForward();
                System.out.println("step left,");
            }

            if( robot.getY() < toY ){
                // if robot is below toY then he must move up
                if( robot.getDirection() == Direction.RIGHT ){
                    robot.turnLeft();
                }
                else if( robot.getDirection() == Direction.DOWN ){
                    robot.turnRight();  // turn 180 degrees
                    robot.turnRight();
                }
                else if( robot.getDirection() == Direction.LEFT ){
                    robot.turnRight();
                }
                // we do not need to write code for condition if( robot.getDirection() == UP )
                robot.stepForward();
                System.out.println("step up,");
            }
            else if( robot.getY() > toY ){
                // if robot is above toY then he must move down
                if( robot.getDirection() == Direction.RIGHT ){
                    robot.turnRight();
                }
                else if( robot.getDirection() == Direction.UP ){
                    robot.turnRight();  // turn 180 degrees
                    robot.turnRight();
                }
                else if( robot.getDirection() == Direction.LEFT ){
                    robot.turnLeft();
                }
                // we do not need to write code for condition if( robot.getDirection() == DOWN )
                robot.stepForward();
                System.out.println("step down,");
            }

        }
    }


    public static void showPosition( Robot robot ){
        System.out.print(" ( x , y ) = ( " + robot.getX() + " , " + robot.getY() + " ) " );
        System.out.print(" direction = " + robot.getDirection().toString() );
    }



}