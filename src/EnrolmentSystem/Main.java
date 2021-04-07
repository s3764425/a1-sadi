package EnrolmentSystem;

import java.util.Scanner;

import static EnrolmentSystem.StudentEnrolment.*;

public class Main {

        public static void main(String[] args) {

                StudentList studentList = new StudentList();
                CourseList courseList = new CourseList();

                Student s1 = new Student("s3764425", "Tran Trong Vy", "13/11/2000");
                Student s2 = new Student("s3653314", "Travis Tran", "12/10/1999");
                studentList.addStudent(s1);
                studentList.addStudent(s2);

                Course c1 = new Course("COSC2041","C++ Programming", 12);
                Course c2 = new Course("COSC2021","Introduction to Cloud", 12);
                Course.addCourse(c1);
                Course.addCourse(c2);

                StudentEnrolment studentEnrolment1 = new StudentEnrolment(s1, c1, "2021A");
                StudentEnrolment studentEnrolment2 = new StudentEnrolment(s2, c1, "2021A");
                StudentEnrolment studentEnrolment3 = new StudentEnrolment(s1, c2, "2021A");
                StudentEnrolment studentEnrolment4 = new StudentEnrolment(s2, c2, "2021A");

                StudentEnrolmentManager e1 = studentEnrolment1;
                StudentEnrolmentManager e2 = studentEnrolment2;
                StudentEnrolmentManager e3 = studentEnrolment3;
                StudentEnrolmentManager e4 = studentEnrolment4;

                e1.add(studentEnrolment1);
                e2.add(studentEnrolment2);
                e3.add(studentEnrolment3);
                e4.add(studentEnrolment4);

        // Create Scanner object.
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        int choice;

        // While Loop for wrong input
        while(true) {

                /* Main Menu */
                System.out.println("Welcome to the Enrolment System. Please type in the number:");
                System.out.println("1. Add Enrolment.");
                System.out.println("2. List All Enrolment.");
                System.out.println("2. Print Enrolments.");
                System.out.println("4. Exit Student.");
                System.out.println("Enter your choice:");

                // Choice input
                choice = Integer.parseInt(input.nextLine());

                switch (choice) {
                        case 1 -> {
                                /* Enrolment Addition */

                                // Student Selection
                                System.out.println("Here are the student's list. Please enter the ID for enrolment: ");
                                System.out.println(studentList.getAllStudents());
                                String selectedStudent = input.nextLine();
                                Student student = Student.getStudentID(selectedStudent);

                                // Course Selection
                                System.out.println("Here are the course's list. Please enter the ID for enrolment :");
                                System.out.println(Course.getAllCourses());
                                String selectedCourse = input.nextLine();
                                Course course = Course.getCourseID(selectedCourse);

                                // Semester Assignment
                                System.out.println("Please enter the semester: ");
                                String semester = input.nextLine();

                                // Create new Enrolment object
                                StudentEnrolment studentEnrolment = new StudentEnrolment(student, course, semester);
                                StudentEnrolmentManager seManager; // Create object for interface.
                                seManager = studentEnrolment;
                                seManager.add(studentEnrolment); // Let interface add the enrolment.
                                System.out.println("Student Enrolled!" + studentEnrolment);

                        }

                        case 2 -> { String studentID = input.nextLine();
                                StudentEnrolment studentEnrolment = new StudentEnrolment();
                                studentEnrolment.getEnrolment(studentID);

                        }
                        case 3 -> { }

                        case 4 -> {
                                // System Exit
                                System.out.println("Now Exit...");
                                System.exit(0);
                        }
                        default -> {
                                // In case wrong input
                                System.out.println("Wrong Number! Now we will redirect to the Main Menu");
                        }

                }
        }
        }
}