package EnrolmentSystem;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {


        Scanner input;
        input = new Scanner(System.in);
        boolean mainloop = true;
        int choice;

        while(true) {
                System.out.println("Welcome to the Enrolment System. Please type in the number:");
                System.out.println("1. Add Student.");
                System.out.println("2. Edit Student.");
                System.out.println("3. Delete Student.");
                System.out.println("4. Exit Student.");
                System.out.println("Enter your choice:");

                choice = input.nextInt();


        switch (choice) {
                case 1 -> {
                        // Student Addition
                        System.out.println("Enter the student ID:");
                        String studentID = input.nextLine();  // Read user input
                        System.out.println("Enter the student name: ");
                        String studentName = input.nextLine();  // Read user input
                        System.out.println("Enter the student birthdate: ");
                        String studentDOB = input.nextLine();
                        Student student = new Student(studentID, studentName, studentDOB);

                        // Course Addition
                        System.out.println("Enter the course ID:");
                        String courseID = input.nextLine();  // Read user input
                        System.out.println("Enter the course name: ");
                        String courseName = input.nextLine();  // Read user input
                        System.out.println("Enter the course credit: ");
                        int courseCredit = Integer.parseInt(input.nextLine());
                        Course course = new Course(courseID, courseName, courseCredit);
                        System.out.println(course);
                        System.out.println("Enter the semester:");
                        String semester = input.nextLine();

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

                default -> {
                        System.out.println("Wrong Number! Now we will redirect to the Main Menu");
                        break;
                }
        }
        }
}
}