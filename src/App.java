import java.math.BigInteger;

public class App {

    public static void main(String[] args) {
        System.out.println(factorial(15).toString(10));
        System.out.println(factorial(15).doubleValue());
    }

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value ) {

        Integer myInteger = new Integer(value);
        BigInteger myBig = new BigInteger(myInteger.toString());

        if(value==1){
            return BigInteger.ONE;
        }
        else
        return factorial( value - 1 ).multiply(myBig) ;
        //factorial( value - 1 ) * value;
    }

}
