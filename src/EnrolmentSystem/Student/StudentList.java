package EnrolmentSystem.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static final List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public Student getStudentID(String name) {
        for(Student student: studentList) {
            if(student.getStudentID().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    public Object getAllStudents() {
        ArrayList<String> students = new ArrayList<>();
        for(Student student: studentList) {
            students.add("ID: " + student.getStudentID() + " " + "Name: " + student.getStudentName());
        }
        return students;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
