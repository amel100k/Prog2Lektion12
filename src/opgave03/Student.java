package opgave03;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int StudentNo;
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(int studentNo, String name) {
        this.StudentNo = studentNo;
        this.name = name;
    }

    public int getStudentNo() {
        return StudentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return grades;
    }
    public void addGrade(int grade){
        if (!grades.contains(grade)){
         grades.add(grade);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentNo=" + StudentNo +
                ", name='" + name + '\'' +
                '}';
    }
}
