package opgave03;

public class Test {
    public static void main(String[] args) {
        College college = new College("EAAA");
        Student emil = new Student(1,"Emil");
        Student william = new Student(2,"William");
        emil.addGrade(12);
        emil.addGrade(12);
        emil.addGrade(10);
        emil.addGrade(7);
        william.addGrade(2);
        william.addGrade(4);
        william.addGrade(4);
        william.addGrade(10);
        college.addStudent(emil);
        college.addStudent(william);
        System.out.println("college.calcAverage() = " + college.calcAverage());

    }
}
