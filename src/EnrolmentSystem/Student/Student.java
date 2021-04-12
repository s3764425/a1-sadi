package EnrolmentSystem.Student;

public class Student {
    private String studentName;
    private String studentID;
    private String birthdate;

    public Student(String studentID, String studentName, String birthdate) {
        super();
        this.studentID = studentID;
        this.studentName = studentName;
        this.birthdate = birthdate;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return studentID;
    }
}
