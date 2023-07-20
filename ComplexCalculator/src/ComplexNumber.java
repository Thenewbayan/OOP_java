


public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    /**
     * @param realPart действительная часть числа
     * @param imaginaryPart мнимая часть числа
     */
    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    // Сложение комплексных чисел
    public ComplexNumber add(ComplexNumber number) {
        double newRealPart = this.realPart + number.getRealPart();
        double newImaginaryPart = this.imaginaryPart + number.getImaginaryPart();
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    // Умножение комплексных чисел
    public ComplexNumber multiply(ComplexNumber number) {
        double newRealPart = this.realPart * number.getRealPart() - this.imaginaryPart * number.getImaginaryPart();
        double newImaginaryPart = this.realPart * number.getImaginaryPart() + this.imaginaryPart * number.getRealPart();
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    // Деление комплексных чисел
    public ComplexNumber divide(ComplexNumber number) {
        double denominator = Math.pow(number.getRealPart(), 2) + Math.pow(number.getImaginaryPart(), 2);
        double newRealPart = (this.realPart * number.getRealPart() + this.imaginaryPart * number.getImaginaryPart()) / denominator;
        double newImaginaryPart = (this.imaginaryPart * number.getRealPart() - this.realPart * number.getImaginaryPart()) / denominator;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    @Override
    public String toString() {
        if (this.imaginaryPart < 0) {
            return this.realPart + " - " + Math.abs(this.imaginaryPart) + "i";
        } else {
            return this.realPart + " + " + this.imaginaryPart + "i";
        }
    }
}

