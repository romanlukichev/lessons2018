import java.math.BigInteger;

public class App {

    public static void main(String[] args) {
        System.out.println(factorial(8));
    }

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static int factorial(int value) {


        if(value==1){
            return 1;
        }
        else
        return factorial( value - 1 ) * value; // your implementation here
    }

}
