package Controller;

import java.util.ArrayList;
import java.util.List;


import Model.Student;



public class Controller {

    private iGetModel model;
    private iGetView viewEng;
    private List<Student> students = new ArrayList<>();

    public Controller(iGetModel model, iGetView viewEng) {
        this.model = model;
        this.viewEng = viewEng;
    }

    private boolean testData(List<Student> students) {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
    // public void update(){

    // //MVP
    // students=model.getAllStudents();
    // if (testData(students)){
    // view.printAllStudents(students);
    // }
    // else {
    // System.out.println("List is empty");
    // }

    // MVC
    // view.printAllStudents(model.getAllStudents());

    // public void runRus() {
    //     CommandRu com = CommandRu.СТАРТ;
    //     boolean getNewIteration = true;
    //     while (getNewIteration) {
    //         String command = view.prompt("Введите команду:");
    //         com = CommandRu.valueOf(command.toUpperCase());
    //         switch (com) {
    //             case ВЫЙТИ:
    //                 getNewIteration = false;
    //                 System.out.println("Выход из программы!");
    //                 break;
    //             case СПИСОК:
    //                 view.printAllStudents(model.getAllStudents());
    //                 break;
    //         }

    //     }
    

    public void runEng() {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = viewEng.prompt("Enter a command:");
            com = Command.valueOf(command.toUpperCase()); 
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Exit from programm");
                    break;
                case LIST:
                    viewEng.printAllStudents(model.getAllStudents());
                    break;
            }

        }
    }
}


