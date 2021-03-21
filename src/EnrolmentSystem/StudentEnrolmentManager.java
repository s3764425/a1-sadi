package EnrolmentSystem;

import java.util.List;

public interface StudentEnrolmentManager {
        boolean addEnrolment(String studentId, String courseId, String semester);

        boolean updateEnrolment(String studentId);

        boolean deleteEnrolment(String studentId);

        List<Enrolment> getEnrolments();

        List<Enrolment> getEnrolmentsByCourseId(String courseId);

        List<Enrolment> getEnrolmentsByStudentId(String studentId);

        List<Course> getCoursesInSemester(String semester);

        List<Course> getCoursesOfStudentInSemseter(String studentId, String semester);

        List<Student> getStudentsInCourseInSemester(String courseId, String semester);

        List<String> getSemesters();

    }
