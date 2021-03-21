package EnrolmentSystem;


import java.util.ArrayList;
import java.util.List;

public class StudentEnrolment implements StudentEnrolmentManager {
    Student student;
    Course course;
    private String semester;
    private ArrayList<StudentEnrolment> studentEnrolmentList = new ArrayList<>();

    public StudentEnrolment(Student student, Course course, String semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }


    @Override
    public String toString() {
        return "StudentEnrolment{" +
                "student=" + student +
                ", course=" + course +
                ", semester='" + semester + '\'' +
                '}';
    }

    @Override
    public boolean addEnrolment(String studentId, String courseId, String semester) {
        return false;
    }

    @Override
    public boolean updateEnrolment(String studentId) {
        return false;
    }

    @Override
    public boolean deleteEnrolment(String studentId) {
        return false;
    }

    @Override
    public List<StudentEnrolment> getEnrolments() {
        return null;
    }

    @Override
    public List<StudentEnrolment> getEnrolmentsByCourseId(String courseId) {
        return null;
    }

    @Override
    public List<StudentEnrolment> getEnrolmentsByStudentId(String studentId) {
        return null;
    }

    @Override
    public List<Course> getCoursesInSemester(String semester) {
        return null;
    }

    @Override
    public List<Course> getCoursesOfStudentInSemseter(String studentId, String semester) {
        return null;
    }

    @Override
    public List<Student> getStudentsInCourseInSemester(String courseId, String semester) {
        return null;
    }

    @Override
    public List<String> getSemesters() {
        return null;
    }
}



