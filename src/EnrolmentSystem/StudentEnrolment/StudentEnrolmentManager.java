package EnrolmentSystem.StudentEnrolment;
public interface StudentEnrolmentManager {
    void add(StudentEnrolment studentEnrolment);
    void update(String studentID);
    void delete(String studentID, String courseID);
    void getOne(String studentID);
    void getAll();
}
