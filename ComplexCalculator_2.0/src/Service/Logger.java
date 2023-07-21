package Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import Domen.ComplexNumber;

public class Logger {

    public Logger() {
    }

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
}

    
    

