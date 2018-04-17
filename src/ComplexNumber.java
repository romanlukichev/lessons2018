public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj){  // function must receive Object as a parameter
       ComplexNumber inComplex = (ComplexNumber) obj; // convert Object to the ComplexNumber
       return ( this.re == inComplex.getRe() ) && ( this.im == inComplex.getIm() );
    }

    @Override
    public int hashCode(){
        Double realPart = new Double(re);
        Double imaginaryPart = new Double(im);
        return realPart.hashCode() + imaginaryPart.hashCode();
    }



}