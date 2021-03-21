package EnrolmentSystem;

import java.util.Scanner;

public class Main {

public static void main(String[] args){
        Scanner studentInput = new Scanner(System.in);
        System.out.println("Enter student id:");
        String id = studentInput.nextLine();
        System.out.println("Enter student's name:");
        String name = studentInput.nextLine();
        System.out.println("Enter student's birthdate:");
        String birthdate = studentInput.nextLine();

        Student student = new Student(id, name, birthdate);
        student.setStudentID(id);
        student.setStudentName(name);
        student.setBirthdate(birthdate);

        Scanner courseInput = new Scanner(System.in);
        System.out.println("Enter the course id:");
        String courseId = courseInput.nextLine();
        System.out.println("Enter the course name:");
        String courseName = courseInput.nextLine();
        System.out.println("Enter course credit:");
        int credit = Integer.parseInt(courseInput.nextLine());

        Course course = new Course(courseId, courseName, credit);
        course.setCourseID(courseId);
        course.setCourseName(courseName);
        course.setCredit(credit);

        StudentEnrolment studentEnrolment = new StudentEnrolment(student, course, "2021A");
        System.out.print(studentEnrolment);
        }
}
