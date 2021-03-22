package EnrolmentSystem;

import java.util.Scanner;

public class Main {

public static void main(String[] args){
        Student student = new Student("S3764425", "Tran Trong Vy", "13/11/2000");
        student.setStudentID(id);
        student.setStudentName(name);
        student.setBirthdate(birthdate);

        Course course = new Course("COSC2456", "Marketers", 12);
        course.setCourseID(courseId);
        course.setCourseName(courseName);
        course.setCredit(credit);

        StudentEnrolment studentEnrolment = new StudentEnrolment(student, course, "2021A");
        System.out.print(studentEnrolment);
        }
}
