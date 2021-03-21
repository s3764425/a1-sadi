package EnrolmentSystem;

import java.util.ArrayList;

public class Course {
    private String courseID;
    private String courseName;
    private int credit;
    private ArrayList<Student> studentList;

    public Course(String courseID, String courseName, int credit) {
        super();
        this.courseName = courseName;
        this.courseID = courseID;
        studentList = new ArrayList<Student>();
        this.credit = credit;

    }
    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return " " + courseName + "course code=" + " " + courseID + " " + "Credits:" + " " + credit;
    }
}
