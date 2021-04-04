package EnrolmentSystem;

import java.util.Scanner;



public class Main {

        public static void main(String[] args) {
                Student s1 = new Student("s3764425", "Tran Trong Vy", "13/11/2000");
                Student s2 = new Student("s3653314", "Travis Tran", "12/10/1999");
                Student.addStudent(s1);
                Student.addStudent(s2);

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
                System.out.println("Welcome to the Enrolment System. Please type in the number:");
                System.out.println("1. Add Enrolment.");
                System.out.println("2. List Enrolment.");
                System.out.println("3. Delete Student.");
                System.out.println("4. Exit Student.");
                System.out.println("Enter your choice:");

                choice = Integer.parseInt(input.nextLine());

        switch (choice) {
                case 1 -> {
                        // Student Addition
                        System.out.println("Here are the student's list. Please enter the ID for enrolment: ");
                        System.out.println(Student.getAllStudents());
                        String selectedStudent = input.nextLine();
                        Student student = Student.getStudentID(selectedStudent);

                        System.out.println("Here are the course's list. Please enter the ID for enrolment :");
                        System.out.println(Course.getAllCourses());
                        String selectedCourse = input.nextLine();
                        Course course = Course.getCourseID(selectedCourse);

                        System.out.println("Please enter the semester: ");
                        String semester = input.nextLine();

                        StudentEnrolment studentEnrolment = new StudentEnrolment(student, course, semester);
                        StudentEnrolmentManager SEmanager;
                        SEmanager = studentEnrolment;
                        SEmanager.add(studentEnrolment);
                        System.out.println("New enrolment added: " + studentEnrolment);
                        break;
                }
                case 2 -> {
                        System.out.println("Enter student ID:");
                        String studentID = input.nextLine();

                        do {
                                System.out.println("Do you want to add or delete courses?");
                                System.out.println("1. Add course");
                                System.out.println("2. Delete course");
                                System.out.println("3. Exit to main menu");

                                choice = Integer.parseInt(input.nextLine());

                                switch (choice) {
                                        case 1 -> {
                                                break;
                                        }

                                case 2 -> { }

                                case 3 -> { }

                                }

                        } while (choice != 3);
                }

                case 3 -> {
                }

                case 4 -> {
                        System.out.println("Now Exit");
                        System.exit(0);
                        break;
                }

                default -> {
                        System.out.println("Wrong Number! Now we will redirect to the Main Menu");
                }
        }

}
}
}