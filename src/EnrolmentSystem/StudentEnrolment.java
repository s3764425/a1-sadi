package EnrolmentSystem;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentEnrolment{
    private Student student;
    private Course course;
    private String semester;

    public StudentEnrolment(Student student, Course course, String semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
    }

    /* Getters and Setters */
    public Student getStudent(){
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
        return student + ", " + course + ", " + semester + '.';
    }
}

class StudentEnrolmentList implements StudentEnrolmentManager {
    private static final List<StudentEnrolment> studentEnrolmentList = new ArrayList<StudentEnrolment>();

    public void printAllCoursesForStudentInSemester(String studentId, String semester) {
        for (StudentEnrolment studentEnrolmentList : studentEnrolmentList) {
            if (studentEnrolmentList.getStudent().getStudentID().equalsIgnoreCase(studentId)
                    && studentEnrolmentList.getSemester().equalsIgnoreCase(semester)) {
                System.out.println(studentEnrolmentList.getCourse().getCourseName());
            }
        }
    }

    public void printAllStudentsInCourseInSemester(String courseId, String semester) {
        for (StudentEnrolment studentEnrolmentList : studentEnrolmentList) {
            if (studentEnrolmentList.getCourse().getCourseID().equalsIgnoreCase(courseId)
                    && studentEnrolmentList.getSemester().equalsIgnoreCase(semester)) {
                System.out.println(studentEnrolmentList.getStudent().getStudentName());
            }
        }
    }

    public void printAllCoursesInSemester(String semester) {
        for(StudentEnrolment studentEnrolmentList: studentEnrolmentList) {
            if (studentEnrolmentList.getSemester().equalsIgnoreCase(semester)) {
                System.out.println(studentEnrolmentList.getCourse().getCourseName());
            }
        }
    }

    @Override
    public void add(StudentEnrolment studentEnrolment) {
        studentEnrolmentList.add(studentEnrolment);
    }

    @Override
    public void update(String studentID) {
        if (studentEnrolmentList.size() == 0) {
            System.out.println("No enrolment found!");
        }
        else {
            for (StudentEnrolment studentEnrolmentList: studentEnrolmentList) {
                String student = String.valueOf(studentEnrolmentList.getStudent().getStudentID());
                System.out.println("Enter ID to modify:");
                Scanner input = new Scanner(System.in);
                String newCourseId = input.nextLine();
            }
        }

    }

    @Override
    public void delete(String studentID, String courseID) {
        for (int i = 0; i < studentEnrolmentList.size(); i++) {
            if(studentEnrolmentList.get(i).getStudent().getStudentID().equalsIgnoreCase(studentID)
                    && studentEnrolmentList.get(i).getCourse().getCourseID().equalsIgnoreCase(courseID)) {
                System.out.println(studentEnrolmentList.remove(i));
                System.out.println("Enrolment deleted!");
            }

        }
    }

    @Override
    public void getOne(String studentID) {
        if (studentEnrolmentList.size() != 0) {
            for (StudentEnrolment studentEnrolment : studentEnrolmentList) {
                String student = String.valueOf(studentEnrolment.getStudent().getStudentID());
                if (student.equalsIgnoreCase(studentID))
                    System.out.println(studentEnrolment.toString());
            }

            System.out.println("No enrolment found!");
        }
    }
    @Override
    public void getAll() {
        if (studentEnrolmentList.size() == 0) {
            System.out.println("No enrolment found!");
        }
        else {
            for (StudentEnrolment studentEnrolment: studentEnrolmentList) {
                System.out.println(studentEnrolment.toString());
            }
        }
    }

    }


