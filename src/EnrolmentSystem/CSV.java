package EnrolmentSystem;

import EnrolmentSystem.Course.Course;
import EnrolmentSystem.Student.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static EnrolmentSystem.Course.CourseList.courseList;
import static EnrolmentSystem.Student.StudentList.studentList;

public class CSV{

    static List<Student> readStudentsFromCSV() {
        List<Student> students = new ArrayList<>();
        Path pathToFile = Paths.get("default.csv");

        // BufferedReader instance
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.UTF_8)) {

            // read the first line from the text file
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array and a comma as the delimiter
                String[] attributes = line.split(",");

                Student student = createStudent(attributes);

                // adding student into ArrayList
                studentList.add(student);

                // read next line before looping
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return students;
    }

    private static Student createStudent(String[] metadata) {
        String id= metadata[0];
        String student = metadata[1];
        String birthdate = metadata[2];

        // create and return students
         return new Student(id, student, birthdate);
    }

    static List<Course> readCoursesFromCSV() {
        List<Course> courses = new ArrayList<>();
        Path pathToFile = Paths.get("default.csv");

        // BufferedReader instance
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.UTF_8)) {
            // read the first line from the text file
            String line = br.readLine();
            while (line != null) {

                // use string.split to load a string array and a comma as the delimiter
                String[] attributes = line.split(",");

                Course course = createCourse(attributes);

                // adding book into ArrayList
                courseList.add(course);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return courses;
    }

    private static Course createCourse(String[] metadata) {
        String courseID= metadata[3];
        String courseName = metadata[4];
        int courseCredit = Integer.parseInt(metadata[5]);

        // create and return courses
        return new Course(courseID, courseName, courseCredit);
    }

    static List<String> readSemestersFromCSV() {
        List<String> semesterList = new ArrayList<>();
        Path pathToFile = Paths.get("default.csv");

        // BufferedReader instance
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.UTF_8)) {

            // read the first line
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array and a comma as the delimiter
                String[] attributes = line.split(",");

                String semester = createSemester(attributes);

                semesterList.add(semester);
                // read next line before looping
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return semesterList;
    }

    private static String createSemester(String[] metadata) {
        // create and return semesters
        return metadata[6];
    }

}

