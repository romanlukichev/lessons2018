public class app {
    public static void main(String[] args) {
        Direction d1 = Direction.NORTH_EAST;
        System.out.println(d1);

        switch (d1){
            case NORTH:
                System.out.println("cold!...");
                break;
            case SOUTH:
                System.out.println("warm!...");
                break;
            default:
                System.out.println("So so...");
                break;
        }

        Direction d2 = Direction.valueOf("SOUTH_WEST");
        System.out.println(d2); // SOUTH_WEST
        System.out.println(d2.ordinal()); // 5
        System.out.println(d2.hashCode()); //1956725890
        System.out.println(d2.toString()); // SOUTH_WEST
//        System.out.println(d2.ordinal());
//        System.out.println(d2.ordinal());
        Direction d3 = Direction.EAST;
        System.out.println(d3.ordinal()); // 5
        System.out.println(d3.hashCode()); // 356573597
        System.out.println(d3.toString());  // EAST
        System.out.println(d3.equals(d2)); // false
        System.out.println(d3.compareTo(d2)); // -3
        System.out.println(d3.compareTo(Direction.NORTH)); // 2
        System.out.println(d3.compareTo(Direction.SOUTH_EAST)); // -1
        System.out.println(d3.compareTo(Direction.NORTH_EAST)); //  1

        Direction[] allDirections = Direction.values();

        for(int i=0; i<allDirections.length; i++){
            System.out.println(allDirections[i] + " " + allDirections[i].ordinal()  + " i="
                    + allDirections[i].getIntencity()  + " t=" + allDirections[i].countTemperature(10.0d));
        }
        // let-s do the same using for-each loop.
        for(Direction d : allDirections){
            System.out.println(d + " " + d.ordinal()  + " i="
                    + d.getIntencity()  + " t=" + d.countTemperature(10.0d));
        }

//        NORTH 0
//        NORTH_EAST 1
//        EAST 2
//        SOUTH_EAST 3
//        SOUTH 4
//        SOUTH_WEST 5
//        WEST 6
//        NORTH_WEST 7
        System.out.println(allDirections[4]); // SOUTH
        System.out.println(allDirections[4].getDeclaringClass()); // class Direction
        System.out.println(Enum.valueOf(Direction.class, "NORTH_WEST")); // ???? ne ponimaju eto
        //Returns the enum constant of the specified enum type with the specified name.

        Size[] sizes = Size.values();
        for(Size aSize : sizes){
            System.out.println(aSize.name()); // L   S    M  XL
        }
        System.out.println(Size.L.getDeclaringClass()); // class Size
        System.out.println(Direction.NORTH.getMessage()); //Going to cold North...
        System.out.println(Direction.EAST.getMessage()); //Going other directions...

    }
}
