package EnrolmentSystem;


import java.util.ArrayList;
import java.util.List;

public class StudentEnrolment implements StudentEnrolmentManager {
    private Student student;
    private Course course;
    private String semester;
    protected static final List<StudentEnrolment> studentEnrolmentList = new ArrayList<StudentEnrolment>();

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

    /* Functions without interface */
    public void getEnrolment(String studentID) {
        if (studentEnrolmentList.size() == 0) {
            System.out.println("No enrolment found!");
        }
        else {
            for (StudentEnrolment studentEnrolment: studentEnrolmentList) {
                String student = String.valueOf(getStudent().getStudentID());
                if(student.equalsIgnoreCase(studentID)) {
                    System.out.println(studentEnrolment.toString());
                }
            }
        }
    }
    public void getAllCoursesForStudentInSemester(String studentId, String semester) {
        for (StudentEnrolment studentEnrolment : studentEnrolmentList) {
            if (getStudent().getStudentID().equalsIgnoreCase(studentId)
                    && studentEnrolment.getSemester().equalsIgnoreCase(semester)) {
                System.out.println(getCourse().getCourseName());
            }
        }
    }

    public void getAllStudentsInCourseInSemester(String courseID, String semester) {
        for (StudentEnrolment studentEnrolment : studentEnrolmentList) {
            if (getCourse().getCourseID().equalsIgnoreCase(courseID)
                    && studentEnrolment.getSemester().equalsIgnoreCase(semester)) {
                System.out.println(getStudent().getStudentName());
            }
        }
    }

    public void getAllCoursesInSemester(String semester) {
        for(StudentEnrolment studentEnrolment: studentEnrolmentList) {
            if (studentEnrolment.getSemester().equalsIgnoreCase(semester)) {
                System.out.println(getCourse().getCourseName());
            }
        }
    }

    /* Get Enrolment to String */
    @Override
    public String toString() {
        return "\n" + student + ',' + course + ',' + semester + ".";
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
        for (int i = 0; i < studentEnrolmentList.size(); i++) {
            if(getStudent().getStudentID().equalsIgnoreCase(studentID)
                    && getCourse().getCourseID().equalsIgnoreCase(courseID)) {
                System.out.println(studentEnrolmentList.remove(i));
                System.out.println("Enrolment Deleted!");
            }
        }
    }

    @Override
    public void getOne(String studentID) {
        if (studentEnrolmentList.size() == 0) {
            System.out.println("No enrolment found!");
        } else {
            for (StudentEnrolment studentEnrolment : studentEnrolmentList) {
                String student = String.valueOf(getStudent().getStudentID());
                if (student.equalsIgnoreCase(studentID)) {
                    System.out.println(studentEnrolment.toString());
                        }
                    }
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


