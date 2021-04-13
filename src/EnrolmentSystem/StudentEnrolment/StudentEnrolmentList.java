package EnrolmentSystem.StudentEnrolment;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentEnrolmentList implements StudentEnrolmentManager {
    private static final List<StudentEnrolment> studentEnrolmentList = new ArrayList<StudentEnrolment>();
    private static final List<String> semesterList = new ArrayList<String>();

    public void printAllCoursesForStudentInSemester(String studentId, String semester) {
        for (StudentEnrolment studentEnrolmentList : studentEnrolmentList) {
            if (studentEnrolmentList.getStudent().getStudentID().equalsIgnoreCase(studentId)
                    && studentEnrolmentList.getSemester().equalsIgnoreCase(semester)) {
                System.out.println(studentEnrolmentList.getCourse().getCourseName());
            }
            else
                System.out.println("No enrolment found!");
        }
    }

    public void printAllStudentsInCourseInSemester(String courseId, String semester) {
        for (StudentEnrolment studentEnrolmentList : studentEnrolmentList) {
            if (studentEnrolmentList.getCourse().getCourseID().equalsIgnoreCase(courseId)
                    && studentEnrolmentList.getSemester().equalsIgnoreCase(semester)) {
                System.out.println(studentEnrolmentList.getStudent().getStudentName());
            }
            else
                System.out.println("No enrolment found!");
        }
    }

    public void printAllCoursesInSemester(String semester) {
        for(StudentEnrolment studentEnrolmentList: studentEnrolmentList) {
            if (studentEnrolmentList.getSemester().equalsIgnoreCase(semester)) {
                System.out.println(studentEnrolmentList.getCourse().getCourseName());
            }
            else
                System.out.println("No enrolment found!");
        }
    }

    @Override
    public void add(StudentEnrolment studentEnrolment) {
        studentEnrolmentList.add(studentEnrolment);
    }

    @Override
    public void update(String studentID) {
        if (studentEnrolmentList.size() == 0) {
            System.out.println("No enrolment found!");
        }
        System.out.println("Enter student ID for modify");
        Scanner input = new Scanner(System.in);
        String selectedStudent = input.nextLine();
        for (StudentEnrolment studentEnrolmentList: studentEnrolmentList) {
            String student = String.valueOf(studentEnrolmentList.getStudent().getStudentID());
            System.out.println("Enter ID to modify:");
            String newCourseId = input.nextLine();
        }
    }

    @Override
    public void delete(String studentID, String courseID) {
        for (int i = 0; i < studentEnrolmentList.size(); i++) {
            if(studentEnrolmentList.get(i).getStudent().getStudentID().equalsIgnoreCase(studentID)
                    && studentEnrolmentList.get(i).getCourse().getCourseID().equalsIgnoreCase(courseID)) {
                System.out.println(studentEnrolmentList.remove(i));
                System.out.println("Enrolment deleted!");
            }

        }
    }

    @Override
    public void getOne(String studentID) {
        if (studentEnrolmentList.size() != 0) {
            for (StudentEnrolment studentEnrolment : studentEnrolmentList) {
                String student = String.valueOf(studentEnrolment.getStudent().getStudentID());
                if (student.equalsIgnoreCase(studentID))
                    System.out.println(studentEnrolment.toString());
            }
            System.out.println("No enrolment found!");
        }
    }
    @Override
    public void getAll() {
        if (studentEnrolmentList.size() == 0) {
            System.out.println("No enrolment found!");
        }
        else {
            for (StudentEnrolment studentEnrolment: studentEnrolmentList) {
                System.out.println(studentEnrolment.toString());
            }
        }
    }

}


