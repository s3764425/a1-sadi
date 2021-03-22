package EnrolmentSystem;


import java.util.ArrayList;
import java.util.List;

public class StudentEnrolment implements StudentEnrolmentManager {
    private static ArrayList<Student> studentList;
    private static ArrayList<Course> courseList;
    private String semester;

    protected StudentEnrolment() {
        studentList = new ArrayList<Student>();
        courseList = new ArrayList<Course>();
        this.semester = null;
    }

    Student isStudentIncluded(String studentID) {
        for (Student student : studentList) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Student Enrolled!:" +studentList + '-' + courseList + '-' + semester;
    }

    @Override
    public void displayStudentInfo(String studentID) {
        Student student = isStudentIncluded(studentID);
        if (student != null) {
            System.out.println(studentID);
            return;
        }
        System.out.println("No student found with the ID: " + studentID);
    }

    @Override
    public void displayAllStudents() {
        for (Student student:studentList)
            System.out.println(student);
    }
}

