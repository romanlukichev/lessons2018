import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        ComplexNumber a = new ComplexNumber(345.452, 234.345234);
        ComplexNumber b = new ComplexNumber(345.452, 234.345234);
        System.out.println( a.equals(b) );  // must return true
        System.out.println( a.hashCode() == b.hashCode() );  // must return true
        System.out.println( b.equals(a) );  // must return true
        System.out.println( b.hashCode() == a.hashCode() );  // must return true

        System.out.println("==============================================");
        ComplexNumber m1 = new ComplexNumber(1.7976931348623157E308, 4.9E-324);
        ComplexNumber m2 = new ComplexNumber(1.7976931348623157E308, 4.9E-324);
        System.out.println( m1.equals(m2) );  // must return true
        System.out.println( m1.hashCode() == m2.hashCode() );  // must return true
        System.out.println( m2.equals(m1) );  // must return true
        System.out.println( m2.hashCode() == m1.hashCode() );  // must return true

        System.out.println("==============================================");
        ComplexNumber m3 = new ComplexNumber(1.7976931348623157E308, 4.9E-324);
        ComplexNumber m4 = new ComplexNumber(1.7976931348623157E308, 4.9E-324);
        System.out.println( m3.equals(m4) );  // must return true
        System.out.println( m3.hashCode() == m4.hashCode() );  // must return true
        System.out.println( m4.equals(m3) );  // must return true
        System.out.println( m4.hashCode() == m3.hashCode() );  // must return true

        System.out.println("==============================================");
        ComplexNumber h3 = new ComplexNumber(1.7976931348623156E308, 4.9E-324);  // slightly different
        ComplexNumber h4 = new ComplexNumber(1.7976931348623157E308, 4.9E-324);
        System.out.println( h3.equals(m4) );  // must return true
        System.out.println( h3.hashCode() == h4.hashCode() );  // must return true
        System.out.println( h4.equals(h3) );  // must return true
        System.out.println( h4.hashCode() == h3.hashCode() );  // must return true





    }



}