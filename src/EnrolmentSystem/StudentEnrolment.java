package EnrolmentSystem;


import java.util.ArrayList;
import java.util.List;

public class StudentEnrolment implements StudentEnrolmentManager {
    private static ArrayList<Student> studentList;
    private static ArrayList<Course> courseList;
    private String semester;


    public StudentEnrolment() {
        studentList = new ArrayList<Student>();
        courseList = new ArrayList<Course>();
    }

    public static void addCourse(Course course){
        courseList.add(course);
    }

    public static void addStudent(Student student) {
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
                "semester='" + studentList + '\'' + courseList +
                '}';
    }
}

