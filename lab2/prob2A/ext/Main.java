package lab2.prob2A.ext;

import lab2.prob2A.GradeReport;
import lab2.prob2A.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("adis", "12345");
        GradeReport gradeReport = student.getGradeReport();
        gradeReport.setGrade(95.0);
        System.out.println(gradeReport);

    }
}