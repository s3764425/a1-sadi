package EnrolmentSystem;

import java.util.Scanner;

public class Main {

public static void main(String[] args){

        // Student Addition
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the student ID:");
        String studentID = scanner.nextLine();  // Read user input
        System.out.println("Enter the student name: ");
        String studentName = scanner.nextLine();  // Read user input
        System.out.println("Enter the student birthdate: ");
        String studentDOB = scanner.nextLine();
        Student student = new Student(studentID, studentName, studentDOB);

        // Course Addition
        System.out.println("Enter the course ID:");
        String courseID = scanner.nextLine();  // Read user input
        System.out.println("Enter the course name: ");
        String courseName = scanner.nextLine();  // Read user input
        System.out.println("Enter the course credit: ");
        int courseCredit = Integer.parseInt(scanner.nextLine());
        Course course = new Course(courseID, courseName, courseCredit);

        System.out.println(course);

        System.out.println("Enter the semester:");
        String semester = scanner.nextLine();

        StudentEnrolment studentEnrolment = new StudentEnrolment();
        StudentEnrolmentManager.addStudent(student);
        StudentEnrolmentManager.addCourse(course);
        StudentEnrolmentManager.setSemester(semester);

        // Summary
        System.out.println(studentEnrolment);
        }
}
