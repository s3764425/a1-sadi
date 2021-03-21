package EnrolmentSystem;

import java.util.ArrayList;

public abstract class StudentEnrolmentList extends StudentEnrolment {
    private static final ArrayList<StudentEnrolment> studentEnrolmentList = new ArrayList<>();

    public StudentEnrolmentList(Student student, Course course, String semester) {
        super(student, course, semester);
    }


    @Override
    public void add() {


    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void getOne() {

    }

    @Override
    public void getAll() {

    }
}