package EnrolmentSystem;


import java.util.ArrayList;

public class StudentEnrolment implements StudentEnrolmentManager {
    protected static ArrayList<Student> studentList;
    private static ArrayList<Course> courseList;
    private static String semester;


    public StudentEnrolment() {
        studentList = new ArrayList<Student>();
        courseList = new ArrayList<Course>();
    }

    static String isStudentIncluded(String studentID) {
        for (Student student : studentList)
            if (studentID.equals(Student.getStudentID())) {
                ArrayList<Course> courseList = StudentEnrolment.getCourseList();
                System.out.println(courseList);
            }
            else
                System.out.println("No Student Found!");
            return null;
    }

    public static void addCourse(Course course) {
        courseList.add(course);
    }

    public static void addStudent(Student student){
        studentList.add(student);
    }

    public static void setSemester(String semester) {
        StudentEnrolment.semester = semester;
    }
    public void getAllStudents() {

    }

    public static ArrayList<Course> getCourseList() {
        return courseList;
    }

    public static void setCourseList(ArrayList<Course> courseList) {
        StudentEnrolment.courseList = courseList;
    }

    public String getSemester() {
        return semester;
    }


    @Override
    public String toString() {
        return "Student Enrolled!" + "\n" + studentList + ',' + courseList + ',' + semester + ".";
    }

    @Override
    public void add(Student student, Course course, String semester) {
        StudentEnrolment.addStudent(student);
        StudentEnrolment.addCourse(course);
        StudentEnrolment.setSemester(semester);
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void getOne() {

    }

    @Override
    public void getAll() {

    }
}


