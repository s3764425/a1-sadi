package EnrolmentSystem;

import java.util.Scanner;

public class Main {

public static void main(String[] args){
        Student student = new Student("S3764425", "Tran Trong Vy", "13/11/2000");
        student.setStudentID("S3764425");
        student.setStudentName("Tran Trong Vy");
        student.setBirthdate("13/11/2000");

        Course course = new Course("COSC2456", "Marketers", 12);
        course.setCourseID("COSC2456");
        course.setCourseName("Marketers");
        course.setCredit(12);

        StudentEnrolment studentEnrolment = new StudentEnrolment(student, course, "2021A");
        System.out.print(studentEnrolment);
        }
}
