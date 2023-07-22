package Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import Domen.ComplexNumber;

public class Logger {

    /**
     * класс логирования, для каждого типа операций: успешное вычисление, ошибка ввода (не числовые значения),
     * старт программы вносятся изменения в лог-файл
     */ 
    public Logger() {
    }

    /** логизатор совершения операции с числами
     * @param date дата совершения операции
     * @param operation сообщение о типе операции
     * @param first первое КЧ
     * @param second второе КЧ
     * @param result результат
     */
    public void log(Date date, String operation, ComplexNumber first, ComplexNumber second, ComplexNumber result) {
        try {
            File file = new File("D:\\lesson_GB\\OOP\\OOP_java\\ComplexCalculator_2.0\\log.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file, true);
            writer.write(date + " " + operation + ": " + first.toString() + " and " + second.toString() + " = " + result.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /** логизатор ошибок ввода
     * @param date  дата совершения операции
     * @param operation сообщение об ошибке
     * @param typeFail тип ошибки
     */
    public void logFailure(Date date, String operation, String typeFail){
        try {
            File file = new File("D:\\lesson_GB\\OOP\\OOP_java\\ComplexCalculator_2.0\\log.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file, true);
            writer.write(date + " " + operation + typeFail  + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**логизатор начала работы программы
     * @param date дата совершения операции
     * @param operation сообщение
     */
    public void logStart (Date date, String operation){
        try {
            File file = new File("D:\\lesson_GB\\OOP\\OOP_java\\ComplexCalculator_2.0\\log.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file, true);
            writer.write(date + " " + operation +"\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
    /** логизатор очистки рабочих полей
     * @param date дата совершения операции
     * @param operation сообщение
     */
    public void logClear(Date date, String operation){
        try {
            File file = new File("D:\\lesson_GB\\OOP\\OOP_java\\ComplexCalculator_2.0\\log.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file, true);
            writer.write(date + " " + operation +"\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
}

    
    

