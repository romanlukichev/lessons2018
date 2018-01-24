import java.security.MessageDigest;

public class App {

    public static void main(String[] args) {

        String s1 = "A" + ('\t' + '\u0003'); // String + int
        String s2 =  "A" + 12;  // String + int
        String s3 = 'A' + "12"; // char + string
        String s4 = 'A' + '1' + "2"; // (int) + "2"

        System.out.println( s1 );
        System.out.println( s2 );
        System.out.println( s3 );
        System.out.println( s4 );
        System.out.println( "=======================" );
        int a1 =  '\t';  // int a1 = 9;
        int a2 = '\u0003'; // int a2 =
        System.out.println( a1 );
        System.out.println( a2 );
        System.out.println( "=======================" );
        int a3 =  'A';
        int a4 = '1';
        System.out.println( a3 + a4 );





    }


}
