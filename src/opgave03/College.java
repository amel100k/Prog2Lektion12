package opgave03;

import java.util.ArrayList;
import java.util.List;

public class College {
    private String name;
    private List<Student> students = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void addStudent(Student student){
        if (!students.contains(student)){
            students.add(student);
        }
    }
    public void removeStudent(Student student){
        if (students.contains(student)){
            students.add(student);
        }
    }
    public double calcAverage(){
        double averageGrade = 0;
        for (int i = 0; i < students.size(); i++) {
            for (Integer grade : students.get(i).getGrades()) {
                averageGrade += grade;
            }
        }
        return averageGrade;
    }
}
