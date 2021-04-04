package EnrolmentSystem;


import java.util.ArrayList;
import java.util.List;

public class StudentEnrolment implements StudentEnrolmentManager {
    private static Student student;
    private static Course course;
    private String semester;
    private static final List<StudentEnrolment> studentEnrolmentList = new ArrayList<StudentEnrolment>();

    public StudentEnrolment(Student student, Course course, String semester) {
    StudentEnrolment.student = student;
    StudentEnrolment.course = course;
    this.semester = semester;
    }

    public static Student getStudent(){
        return student;
    }

    public static void setStudent(Student student) {
        StudentEnrolment.student = student;
    }

    public static Course getCourse() {
        return course;
    }

    public static void setCourse(Course course) {
        StudentEnrolment.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student Enrolled!" + "\n" + student + ',' + course + ',' + semester + ".";
    }

    @Override
    public void add(StudentEnrolment studentEnrolment) {
        studentEnrolmentList.add(studentEnrolment);
    }

    @Override
    public void update(String studentID) {

    }

    @Override
    public void delete(String studentID, String courseID) {

    }

    @Override
    public void getOne(String studentID) {

    }

    @Override
    public void getAll() {

    }
}
