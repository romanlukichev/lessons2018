import java.math.BigInteger;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] array1 = { 1 , 3 , 5 , 5 , 6 };  //, 7 , 15
        int[] array2 = { 0 , 3 , 5 , 8 , 10 , 15 , 18 , 20 , 25 , 30 };

        int[] array3 = mergeArrays(array1,array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }

    /**
     * Merges two given sorted arrays into one
     *
     * @param m1 first sorted array
     * @param m2 second sorted array
     * @return new array containing all elements from m1 and m2, sorted
     */
    public static int[] mergeArrays(int[] m1, int[] m2) {
        int[] m3 = new int[ m1.length + m2.length ];
        int m3index = 0;
        int m1index = 0;
        int m2index = 0;
        while( m1index < m1.length && m2index < m2.length){
            if ( m1[m1index] <= m2[m2index] ){
                m3[m3index++] = m1[m1index++];
            } else {
                m3[m3index++] = m2[m2index++];
            }
        }
        while( m2index < m2.length){   // if m2 array is longer
           m3[m3index++] = m2[m2index++];
        }
        while( m1index < m1.length){  // if m1 array is longer
                m3[m3index++] = m1[m1index++];
        }
        return m3;
    }

}
