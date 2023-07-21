package Domen;

public class ComplexNumber implements iMathOperation {
    double realPart;
    double imagPart;

    /**
     * @param realPart real part of complex number
     * @param imagPart imagine part of comlex number
     *                 a+bi - a is real, bi is imagine part
     */
    public ComplexNumber(double realPart, double imagPart) {
        this.realPart = realPart;
        this.imagPart = imagPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImagPart() {
        return imagPart;
    }

    public void setImagPart(double imagPart) {
        this.imagPart = imagPart;
    }

    @Override
    public String toString() {
        if (this.imagPart < 0) {
            return this.realPart + " - " + Math.abs(this.imagPart) + "i";// берем модуль иначе будет запись --
        } else {
            return this.realPart + " + " + this.imagPart + "i";
        }
    }

    @Override
    public ComplexNumber add(ComplexNumber second) {
        double newrealPart = this.realPart + second.getRealPart();
        double newimagPart = this.imagPart + second.getImagPart();
        return new ComplexNumber(newrealPart, newimagPart);
    }

       

    @Override
    public ComplexNumber divide(ComplexNumber second) {
        double denominator = Math.pow(second.getRealPart(), 2) + Math.pow(second.getImagPart(), 2);
        double newRealPart = (this.realPart * second.getRealPart() + this.getImagPart() * second.getImagPart()) / denominator;
        double newImaginaryPart = (this.getImagPart() * second.getRealPart() - this.realPart * second.getImagPart()) / denominator;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    
    }

    @Override
    public ComplexNumber multiply(ComplexNumber second) {
        double newRealPart = this.realPart * second.getRealPart() - this.getImagPart() * second.getImagPart();
        double newImaginaryPart = this.realPart * second.getImagPart() + this.getImagPart() * second.getRealPart();
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    @Override
    public ComplexNumber substraction(ComplexNumber second) {
        double newRealPart = this.realPart - second.getRealPart();
        double newImaginaryPart = this.imagPart - second.getImagPart();
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

}
