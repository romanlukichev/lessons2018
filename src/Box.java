import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Box implements Comparable<Box>{
    private double a;
    private double b;
    private double c;

    public Box(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public boolean equals(Object otherObject){
        if(this == otherObject){
            return true;
        }
        if(!(otherObject instanceof Box)){
            return false;
        }
        Box otherBox = (Box)otherObject;
        if(( Math.abs(this.a - otherBox.a) < 0.001 ) &&
                ( Math.abs(this.b - otherBox.b) < 0.001 ) &&
                ( Math.abs(this.c - otherBox.c) < 0.001 ) ) {
            return true;
        }
        else return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(round(a, 2), round(b, 2), round(c, 2));
    }

    @Override
    public int compareTo(Box otherBox) {

        if(( Math.abs(this.a - otherBox.a) < 0.001 ) &&
                ( Math.abs(this.b - otherBox.b) < 0.001 ) &&
                ( Math.abs(this.c - otherBox.c) < 0.001 ) ) {
            return 0;
        }
        else if(this.a * this.b * this.c < otherBox.a * otherBox.b * otherBox.c){
            return -50;         // why not otherBox.get(a) ? - a is private and its in other object.
        }
        return 50;
    }

    @Override
    public String toString(){
        return Double.toString(a) + " " + Double.toString(b) + " " + Double.toString(c);
        // is concatenation of String slower?
    }

    public double getVolume(){
        return a * b * c;
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value)); // using BigDecimal(String) constructor
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
