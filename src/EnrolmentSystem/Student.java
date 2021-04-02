package EnrolmentSystem;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private static String studentID;
    private String birthdate;
    private ArrayList<Course> courseList;

    public Student( String studentID, String studentName, String birthdate) {
            super();
            this.studentID = studentID;
            this.studentName = studentName;
            this.birthdate = birthdate;
            courseList = new ArrayList<Course>();}


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static String getStudentID() {
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

    public ArrayList<Course> getCourseList() {return courseList;}

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
            public String toString() {return studentID;}}