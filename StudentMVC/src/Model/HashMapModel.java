package Model;

import java.util.HashMap;

import Controller.iGetHMModel;

public class HashMapModel implements iGetHMModel{

    private HashMap<Long, Student> studentsHM;

    public HashMapModel(HashMap<Long, Student> studentsHM) {
        this.studentsHM = studentsHM;
    }

    @Override
    public HashMap<Long, Student> getAllStudents() {
        return studentsHM;
    }

    public HashMap<Long, Student> getStudentsHM() {
        return studentsHM;
    }

    public void setStudentsHM(HashMap<Long, Student> studentsHM) {
        this.studentsHM = studentsHM;
    }

    /**
     * @param count количество добавляемых студентов
     * @return HashMap студентов где ключ это числовое значение, а студенты заполняются по шаблону из конструктора
     */
    public HashMap<Long, Student> addStudent(int count) {
        HashMap<Long, Student> studentsHM = new HashMap<Long, Student>();
        Long id = 0L;
    
        for (int i = 0; i < count; i++) {
            Student student = new Student(null, i, i);
            studentsHM.put(id++, student);
        }
    
        return studentsHM;
    } 
}
