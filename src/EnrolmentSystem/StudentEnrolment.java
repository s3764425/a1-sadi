package EnrolmentSystem;


import java.util.ArrayList;

public class StudentEnrolment implements StudentEnrolmentManager {
    private static ArrayList<Student> studentList;
    private static ArrayList<Course> courseList;
    private static String semester;


    public StudentEnrolment() {
        studentList = new ArrayList<Student>();
        courseList = new ArrayList<Course>();
    }


    Student isStudentIncluded(String studentID) {
        for (Student student : studentList) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }


    
    public static void addCourse(Course course) {
        courseList.add(course);
    }

    public static void addStudent(Student student){
        studentList.add(student);
    }

    public void deleteStudent(Student student) {

    }

    public void getOneStudent(String studentID) {

    }

    public void getAllStudents() {

    }

    public static void setSemester(String semester) {
        StudentEnrolment.semester = semester;
    }

    public String getSemester() {
        return semester;
    }

    @Override
    public String toString() {
        return "Student Enrolled!" + "\n" + studentList + ',' + courseList + ',' + semester + ".";
    }
}


