package EnrolmentSystem;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

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

                StudentEnrolment studentEnrolment1 = new StudentEnrolment(s1, c1, "2021A");
                StudentEnrolment studentEnrolment2 = new StudentEnrolment(s2, c1, "2021A");
                StudentEnrolment studentEnrolment3 = new StudentEnrolment(s1, c2, "2021A");
                StudentEnrolment studentEnrolment4 = new StudentEnrolment(s2, c2, "2021A");

                StudentEnrolmentList enrolmentList = new StudentEnrolmentList();
                enrolmentList.add(studentEnrolment1);
                enrolmentList.add(studentEnrolment2);
                enrolmentList.add(studentEnrolment3);
                enrolmentList.add(studentEnrolment4);

                Menu menu = new Menu();
                menu.process();
        }
        static class Menu {
        StudentEnrolmentList enrolmentList = new StudentEnrolmentList();
        StudentList studentList = new StudentList();
        CourseList courseList = new CourseList();

        public void mainMenu(){
                System.out.println("Welcome to the Enrolment System. Please type in the number:");
                System.out.println("1. Add Enrolment.");
                System.out.println("2. List One Enrolment.");
                System.out.println("3. List All Enrolment.");
                System.out.println("4. Print Enrolments.");
                System.out.println("5. Exit Student.");
                System.out.println("Enter your choice:");
        }

        public void process(){
                Scanner input = new Scanner(System.in);
                mainMenu();
                boolean loop = true;
                int choice;

                choice = Integer.parseInt(input.nextLine());

                while(true) {
                        switch (choice) {
                                case 1 -> {
                                        /* Enrolment Addition */
                                        // Student Selection
                                        System.out.println("Here are the student's list. Please enter the ID for enrolment: ");
                                        System.out.println(studentList.getAllStudents());
                                        String selectedStudent = input.nextLine();
                                        Student student = studentList.getStudentID(selectedStudent);

                                        // Course Selection
                                        System.out.println("Here are the course's list. Please enter the ID for enrolment :");
                                        System.out.println(courseList.getAllCourses());
                                        String selectedCourse = input.nextLine();
                                        Course course = courseList.getCourseID(selectedCourse);

                                        // Semester Assignment
                                        System.out.println("Please enter the semester: ");
                                        String semester = input.nextLine();
                                        StudentEnrolment studentEnrolment = new StudentEnrolment(student, course, semester);

                                        // Create new Enrolment object
                                        enrolmentList.add(studentEnrolment);
                                        System.out.println(studentEnrolment.toString());
                                        mainMenu();
                                        choice = Integer.parseInt(input.nextLine());
                                }

                                case 2 -> {System.out.println("Please enter the student's ID: ");
                                        String studentID = input.nextLine();
                                        enrolmentList.getOne(studentID);
                                        mainMenu();
                                        choice = Integer.parseInt(input.nextLine());
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
                                        mainMenu();
                                        choice = Integer.parseInt(input.nextLine());
                                }

                        }
                }
        }
}
}
