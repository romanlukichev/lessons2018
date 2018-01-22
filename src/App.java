import java.security.MessageDigest;

public class App {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(2097152));



    }


    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        boolean powerOfTwo = false;
        int intNumber1 = 0b0000_0000_0000_0000_0000_0000_0000_0001;  // this is 1
        if(Math.abs(value) == intNumber1){
            powerOfTwo = true;
        }
        // System.out.println(intNumber1);
        for(int i=0; i<30; i++){
            intNumber1 = intNumber1 << 1;  // this is multiplication by 2
            //System.out.println(intNumber1);
            if(Math.abs(value) == intNumber1){
                powerOfTwo = true;
                return powerOfTwo;
            }
        }
        return powerOfTwo; // you implementation here
    }
}
