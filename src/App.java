public class App {
    public static void main(String[] args) {
        byte[] bytes = {82, 90 , 100, 40, 33 , 97, 101, 74, }; //{ R, Z, d, (, !, A, e, J }
        AsciiCharSequence mySequence = new AsciiCharSequence(bytes);
        System.out.println(mySequence.toString());
        System.out.println(mySequence.charAt(2));
        System.out.println(mySequence.subSequence(1,4));
        System.out.println();

        System.out.println(mySequence.toString());
        mySequence.tryToChange();
        // we shall try to change "private final byte[] byteArray;" inside the class
        System.out.println(mySequence.toString());

    }
}