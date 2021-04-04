package EnrolmentSystem;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseID;
    private String courseName;
    private int credit;
    private static final List<Course> courseList = new ArrayList<>();

    public Course(String courseID, String courseName, int credit) {
        super();
        this.courseName = courseName;
        this.courseID = courseID;
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

    public static void addCourse(Course course) {
        courseList.add(course);
    }

    public static Course getCourseID(String name) {
        for(Course course: courseList) {
            if(course.getCourseID().equalsIgnoreCase(name)) {
                return course;
            }
        }
        return null;
    }

    public static Object getAllCourses() {
        List<String> totalInfoCourse = new ArrayList<>();
        for(Course course: courseList) {
            totalInfoCourse.add("ID: " + course.getCourseID() + " " + "Name: " + course.getCourseName());
        }
        return totalInfoCourse;
    }

    public static List<Course> getCourseList() {
        return courseList;
    }

    @Override
    public String toString() {
        return courseID;
    }
}
