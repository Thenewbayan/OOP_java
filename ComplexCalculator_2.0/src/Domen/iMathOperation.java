package Domen;

public interface iMathOperation {
    /**
     * @param second число для сложения
     * @return новый экземпляр ComplexNumber
     */
    ComplexNumber add(ComplexNumber second);
    /**
     * @param second число для умножения - множитель
     * @return возвращаем новый экземпляр ComplexNumber
     */
    ComplexNumber multiply(ComplexNumber second);
    /**
     * @param second делитель 
     * @return возвращаем новый экземпляр ComplexNumber
     */
    ComplexNumber divide(ComplexNumber second);
    /**
     * @param second вычитаемое
     * @return возвращаем новый экземпляр ComplexNumber
     */
    ComplexNumber substraction(ComplexNumber second);
    
}
