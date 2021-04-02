package EnrolmentSystem;

import java.util.List;
public interface StudentEnrolmentManager {
    void add(Student student, Course course, String semester);
    void update();
    void delete();
    void getOne();
    void getAll();

}
