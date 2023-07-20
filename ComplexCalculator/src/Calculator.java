// Класс для работы с калькулятором комплексных чисел

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Calculator {
    private ComplexNumber firstNumber;
    private ComplexNumber secondNumber;

    public Calculator(ComplexNumber firstNumber, ComplexNumber secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    // Сложение комплексных чисел
    public ComplexNumber add() {
        ComplexNumber result = this.firstNumber.add(this.secondNumber);
        log("Addition", result);
        return result;
    }

    // Умножение комплексных чисел
    public ComplexNumber multiply() {
        ComplexNumber result = this.firstNumber.multiply(this.secondNumber);
        log("Multiplication", result);
        return result;
    }

    // Деление комплексных чисел
    public ComplexNumber divide() {
        ComplexNumber result = this.firstNumber.divide(this.secondNumber);
        log("Division", result);
        return result;
    }

    // Логирование операции калькулятора
    private void log(String operation, ComplexNumber result) {
        try {
            File file = new File("log.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(operation + ": " + this.firstNumber.toString() + " and " + this.secondNumber.toString() + " = " + result.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
