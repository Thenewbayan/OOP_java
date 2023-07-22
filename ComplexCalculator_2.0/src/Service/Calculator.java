package Service;

import java.util.Date;

import Domen.ComplexNumber;


public class Calculator {
    private ComplexNumber first;
    private ComplexNumber second;
    
    /** класс совершения действия над числами
     * @param first первое КЧ
     * @param second второе КЧ
     */
    public Calculator(ComplexNumber first, ComplexNumber second) {
        this.first = first;
        this.second = second;
    }
    

    public ComplexNumber getFirst() {
        return first;
    }

    public void setFirst(ComplexNumber first) {
        this.first = first;
    }

    public ComplexNumber getSecond() {
        return second;
    }

    public void setSecond(ComplexNumber second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return this.first.toString()+this.second.toString();
    }

    
    /** сложение КЧ
     * @return экземпляр ComplexNumber в котором хранится результат действия
     */
    public ComplexNumber add() {
        ComplexNumber result=this.first.add(this.second);
        Logger logger = new Logger();
        logger.log(new Date(), "Addiction", first, second, result);
        return result;
    }

    
    /** деление КЧ
     * @return экземпляр ComplexNumber в котором хранится результат действия
     */
    public ComplexNumber divide() {
        ComplexNumber result=this.first.divide(this.second);
        Logger logger = new Logger();
        logger.log(new Date(), "Division", first, second, result);
        return result;
    }

   
    /** умножение
     * @return экземпляр ComplexNumber в котором хранится результат действия
     */
    public ComplexNumber multiply() {
        ComplexNumber result=this.first.multiply(this.second);
        Logger logger = new Logger();
        logger.log(new Date(), "Multyplication", first, second, result);
        return result;
    }

    
    /** вычитание КЧ
     * @return экземпляр ComplexNumber в котором хранится результат действия
     */
    public ComplexNumber substraction() {
        ComplexNumber result=this.first.substraction(this.second);
        Logger logger = new Logger();
        logger.log(new Date(), "Substraction", first, second, result);
        return result;
    }
    
}
