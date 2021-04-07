package EnrolmentSystem;

import java.util.ArrayList;
import java.util.List;

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
    class StudentList {
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