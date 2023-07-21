package Service;

import java.util.Date;

import Domen.ComplexNumber;


public class Calculator {
    private ComplexNumber first;
    private ComplexNumber second;
    
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

    
    public ComplexNumber add() {
        ComplexNumber result=this.first.add(this.second);
        Logger logger = new Logger();
        logger.log(new Date(), "Addiction", first, second, result);
        return result;
    }

    
    public ComplexNumber divide() {
        ComplexNumber result=this.first.divide(this.second);
        Logger logger = new Logger();
        logger.log(new Date(), "Division", first, second, result);
        return result;
    }

   
    public ComplexNumber multiply() {
        ComplexNumber result=this.first.multiply(this.second);
        Logger logger = new Logger();
        logger.log(new Date(), "Multyplication", first, second, result);
        return result;
    }

    
    public ComplexNumber substraction() {
        ComplexNumber result=this.first.substraction(this.second);
        Logger logger = new Logger();
        logger.log(new Date(), "Substraction", first, second, result);
        return result;
    }
    
}
