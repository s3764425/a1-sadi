package EnrolmentSystem;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {

        System.out.println("Welcome to the Enrolment System. Please type in the number:");
        System.out.println("1. Add Student.");
        System.out.println("2. Edit Student.");
        System.out.println("3. Delete Student.");
        System.out.println("4. Exit Student.");

        Scanner option = new Scanner(System.in);
        int choice = option.nextInt();

        switch (choice) {
                case 1 -> {
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

                        // Summary
                        StudentEnrolment studentEnrolment = new StudentEnrolment();
                        StudentEnrolmentManager.addStudent(student);
                        StudentEnrolmentManager.addCourse(course);
                        StudentEnrolmentManager.setSemester(semester);
                        System.out.println(studentEnrolment);
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                        System.out.println("Now Exit");
                }
                default -> throw new IllegalStateException("Wrong number: " + choice);
        }
        }
}
}