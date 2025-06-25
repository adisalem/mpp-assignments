package lab2.prob2A;

public class Student {
    private String studentName;
    private String studentId;
    private GradeReport gradeReport;

    public Student(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.gradeReport = new GradeReport(this);
    }

    public String getStudentName() {
        return studentName;
    }
    public String getStudentId() {
        return studentId;
    }
    public GradeReport getGradeReport() {
        return gradeReport;
    }
    @Override
    public String toString() {
        return "{" +
                "studentName='" + studentName + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
    
}
