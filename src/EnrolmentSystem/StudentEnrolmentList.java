package EnrolmentSystem;

import java.util.ArrayList;

public abstract class StudentEnrolmentList extends StudentEnrolment {
    private static final ArrayList<StudentEnrolment> studentEnrolmentList = new ArrayList<>();

    public StudentEnrolmentList(Student student, Course course, String semester) {
        super(student, course, semester);
    }

    }
