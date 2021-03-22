package EnrolmentSystem;


import java.util.ArrayList;
import java.util.List;

public class StudentEnrolment implements StudentEnrolmentManager {
    private ArrayList<Student> studentList;
    private ArrayList<Course> courseList;
    private String semester;


    public StudentEnrolment() {
        studentList = new ArrayList<Student>();
        courseList = new ArrayList<Course>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }
    private Student isStudentIncluded(String studentID) {
        for (Student student:studentList) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }

    public void displayStudentInfo(String studentID) {
        Student student = isStudentIncluded(studentID);
        if (student != null) {
            System.out.println(student);
            return;
        }
        System.out.println("No student with the ID: " + studentID);
    }

    public void displayAllStudents() {
        for (Student student:studentList) {
            System.out.println(student);
        }
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



