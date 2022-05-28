package pw3.n5;

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
    public int hashCode() {
//        return (int) Double.doubleToLongBits(re * 31 + im);
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(re);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(im);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object object) {
        ComplexNumber complexNumber = (ComplexNumber) object;
        return this.im == ((ComplexNumber) object).im &&
                this.re == ((ComplexNumber) object).re;
    }
}
