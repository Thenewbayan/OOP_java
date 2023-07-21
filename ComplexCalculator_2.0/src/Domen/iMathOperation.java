package Domen;

public interface iMathOperation {
    /**
     * @param other число для сложения
     * @return новый экземпляр ComplexNumber
     */
    ComplexNumber add(ComplexNumber second);
    /**
     * @param other число для умножения - множитель
     * @return возвращаем новый экземпляр ComplexNumber
     */
    ComplexNumber multiply(ComplexNumber second);
    /**
     * @param other делитель 
     * @return возвращаем новый экземпляр ComplexNumber
     */
    ComplexNumber divide(ComplexNumber second);
    /**
     * @param other вычитаемое
     * @return возвращаем новый экземпляр ComplexNumber
     */
    ComplexNumber substraction(ComplexNumber second);
    
}
