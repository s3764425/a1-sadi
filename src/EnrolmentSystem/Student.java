package EnrolmentSystem;

import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String studentName;
    private String studentID;
    private String birthdate;
    private ArrayList<Course> courseList;

    public Student(String studentName, String studentID, String birthdate) {
            super();
            this.studentName = studentName;
            this.studentID = studentID;
            this.birthdate = birthdate;
            courseList = new ArrayList<Course>();}

            public ArrayList<Course> getCourseList() {return courseList;}

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

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
            public String toString() {return studentID;}}