import java.lang.CharSequence;

public class AsciiCharSequence implements CharSequence {
    private byte[] byteArray;

    public int length(){
        return byteArray.length;
    }

    public char charAt(int index){
        return (char)byteArray[index];
    }

    public AsciiCharSequence subSequence(int start, int end){   // returns AsciiCharSequence - CharSequence is base class
        byte[] bytes = new byte[end - start];
        int positionInBytes = 0;
        int positionInByteAraay = start;
        while(positionInByteAraay < end){
            bytes[ positionInBytes ] = byteArray[ positionInByteAraay ];
            positionInBytes++;
            positionInByteAraay++;
        }
        AsciiCharSequence sequence = new AsciiCharSequence(bytes);
        return sequence;
    }

    public String toString(){
        return new String(byteArray);
    }

    public AsciiCharSequence(byte[] byteArray) {
        this.byteArray = byteArray;
    }

}
