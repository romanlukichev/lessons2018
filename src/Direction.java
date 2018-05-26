public enum Direction {
    NORTH(6.897e+43){public double countTemperature(double ratio){return getIntencity() * ratio * 4;}},
    NORTH_EAST(4.065e+21){public double countTemperature(double ratio){return getIntencity() * ratio;}},
    EAST(5.985e+54){public double countTemperature(double ratio){return getIntencity() * ratio;}},
    SOUTH_EAST(4.871e+90){public double countTemperature(double ratio){return getIntencity() * ratio;}},
    SOUTH(9.099e+54){public double countTemperature(double ratio){return getIntencity() * ratio * 7;}},
    SOUTH_WEST(1.000e+65){public double countTemperature(double ratio){return getIntencity() * ratio;}},
    WEST(7.765e+55){public double countTemperature(double ratio){return getIntencity() * ratio;}},
    NORTH_WEST(3.982e+65){public double countTemperature(double ratio){return getIntencity() * ratio;}};

    Direction(double intecity){
        this.intencity = intecity;
    }
    private final double intencity;

    public double getIntencity() {
        return intencity;
    }

    public double countTemperature(double ratio){
        return getIntencity() + 8.4;
    }

    String getMessage(){
        switch(this){
            case SOUTH:{
                return "Going to warm South...";
            }
            case NORTH:{
                return "Going to cold North...";
            }
            default:{
                return "Going other directions...";
            }
        }
    }
}
