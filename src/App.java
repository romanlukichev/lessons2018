import java.util.function.DoubleUnaryOperator;

public class App {

    public static void main(String[] args) {

         functionCalculator myCalculator = new functionCalculator();

        System.out.println(integrate(myCalculator, 1, 5));

    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {

        double sum = 0;

        double x = a;
        while ( x < b ){
            //System.out.print(x + " ");
            sum += f.applyAsDouble(x) * ( (x + 1e-6) - x );
            //System.out.println(  sum );
            x = x + 1e-6;
        }

        return sum;
    }




}