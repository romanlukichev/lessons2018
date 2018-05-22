import java.lang.CharSequence;
import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    private final byte[] byteArray;

    public int length(){
        return byteArray.length;
    }

    public char charAt(int index){
        return (char)byteArray[index];
    }

    public AsciiCharSequence subSequence(int start, int end){   // returns AsciiCharSequence - CharSequence is base class
        byte[] bytes = Arrays.copyOfRange(byteArray, start, end);
        AsciiCharSequence sequence = new AsciiCharSequence(bytes);
        return sequence;
    }

    public String toString(){
        return new String(byteArray);
    }

    public AsciiCharSequence(byte[] byteArray) {
        this.byteArray = byteArray;
    }

    public void tryToChange(){ // works fine
        byte temp = this.byteArray[byteArray.length-1];
        this.byteArray[byteArray.length-1] = this.byteArray[0];
        this.byteArray[0] = temp;
    }

//    public void tryToChange2(byte[] anotherByteArray){
//        this.byteArray = byteArray; // Cannot assign a value to final variable 'byteArray'
//    }

}
