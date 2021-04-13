package EnrolmentSystem.StudentEnrolment;

import EnrolmentSystem.Course.Course;
import EnrolmentSystem.Course.CourseList;
import EnrolmentSystem.Student.Student;
import EnrolmentSystem.Student.StudentList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class StudentEnrolmentManagerTestUnit extends StudentEnrolmentList {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAdd() {
        Student s1 = new Student("s3764425", "Tran Trong Vy", "13/11/2000");
        Student s2 = new Student("s3653314", "Travis Tran", "12/10/1999");

        StudentList studentList = new StudentList();
        studentList.addStudent(s1);
        studentList.addStudent(s2);

        Course c1 = new Course("COSC2041", "C++ Programming", 12);
        Course c2 = new Course("COSC2021", "Introduction to Cloud", 12);

        CourseList courseList = new CourseList();
        courseList.addCourse(c1);
        courseList.addCourse(c2);

        String semester = "2021A";

        StudentEnrolment studentEnrolment = new StudentEnrolment(s1, c1, semester);
        StudentEnrolmentList enrolmentList = new StudentEnrolmentList();

        // Create new Enrolment object
        enrolmentList.add(studentEnrolment);
        System.out.println("Student Enrolled!: " + studentEnrolment.toString());

    }

    @Test
    void testUpdate() {

    }

    @Test
    void testDelete() {
    }

    @Test
    void testGetOne() {

    }

    @Test
    void testGetAll() {
    }

}