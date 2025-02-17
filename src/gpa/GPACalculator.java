package gpa;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import course.Course;
import io.CourseReaderIO;
import io.StudentReaderIO;
import student.Student;

public class GPACalculator {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
       // ArrayList<Course> courses = new ArrayList<Course>();


        Scanner input = new Scanner(System.in);
        //System.out.printf("\t%-10s", "Student Roll File Name: ");
       // students = StudentReaderIO.readStudentRoll(input.next());
       students = StudentReaderIO.readStudentRoll("sample-files/StudentRoll.txt");
       // System.out.printf("\t%-10s", "Courses File Name: ");
       // CourseReaderIO.readCourses(input.next(), students);
       CourseReaderIO.readCourses("sample-files/Courses.txt", students);






    }
}
