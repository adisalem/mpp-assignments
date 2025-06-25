package lab2.prob2A;

public class GradeReport {
    private Student student;
    private double grade;

    GradeReport(Student student) {
        this.student = student;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "GradeReport{" +
                "student=" + student +
                ", grade=" + grade +
                '}';
    }

}
