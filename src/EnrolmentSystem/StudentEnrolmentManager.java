package EnrolmentSystem;

import java.util.List;
public interface StudentEnrolmentManager {
    static void addCourse(Course course) {
        StudentEnrolment.addCourse(course);
    }
    static void addStudent(Student student) {
        StudentEnrolment.addStudent(student);
    }

    static void setSemester(String semester) {
        StudentEnrolment.setSemester(semester);
    }

    void deleteStudent(Student student);

    void getOneStudent(String studentID);
    void getAllStudents();
}
