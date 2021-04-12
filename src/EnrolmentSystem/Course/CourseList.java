package EnrolmentSystem.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseList {
    private static final List<Course> courseList = new ArrayList<>();

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public Course getCourseID(String name) {
        for(Course course: courseList) {
            if(course.getCourseID().equalsIgnoreCase(name)) {
                return course;
            }
        }
        return null;
    }

    public Object getAllCourses() {
        List<String> courses = new ArrayList<>();
        for(Course course: courseList) {
            courses.add("ID: " + course.getCourseID() + " " + "Name: " + course.getCourseName());
        }
        return courses;
    }

    public List<Course> getCourseArrayList() {
        return courseList;
    }
}