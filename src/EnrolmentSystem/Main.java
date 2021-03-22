package EnrolmentSystem;

import java.util.Scanner;

public class Main {

public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String studentID = scanner.nextLine();
        System.out.println("Enter the student ID:");
        String studentName = scanner.nextLine();  // Read user input
        System.out.println("Enter the student name: ");
        String studentDOB = scanner.nextLine();  // Read user input
        System.out.println("Enter the student birthdate: ");
        Student student = new Student(studentID, studentName, studentDOB);

        student.setStudentID("S3764425");
        student.setStudentName("Tran Trong Vy");
        student.setBirthdate("13/11/2000");

        Course course = new Course("COSC2456", "Marketers", 12);
        course.setCourseID("COSC2456");
        course.setCourseName("Marketers");
        course.setCredit(12);

        StudentEnrolmentManager.addSemester("2021A");

        StudentEnrolment studentEnrolment = new StudentEnrolment();

        //Add Student & Course
        StudentEnrolmentManager.addCourse(course);
        StudentEnrolmentManager.addStudent(student);

        System.out.println(studentEnrolment);
        }
}
