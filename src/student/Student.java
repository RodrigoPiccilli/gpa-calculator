package student;

import java.util.ArrayList;

import course.Course;

/**
 * Class representing student object. Each student has their own gpa, name, and student ID number.
 * 
 * @author Rodrigo Piccilli
 */
public class Student {

    /** Student First Name */
    private String firstName;
    /** Student Last Name */
    private String lastName;
    /** Student ID */
    private int studentID;
    /** Student GPA */
    private double gpa;
    /** Student Grades */
    private ArrayList<Course> courses;


    /**
     * Constructor For Student Object.
     * @param firstName  Student First Name
     * @param lastName Student Last Name
     * @param studentID Student ID
     */
    public Student(String firstName, String lastName, int studentID) {
        this(firstName, lastName, studentID, 0.0);
       
    }

    /**
     * Constructor For Student Object.
     * @param firstName  Student First Name
     * @param lastName Student Last Name
     * @param studentID Student ID
     * @param gpa   Student GPA
     */
    public Student(String firstName, String lastName, int studentID, double gpa) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentID(studentID);
        setGPA(gpa);
        courses = new ArrayList<>();
    }

    /**
     * Getter for First Name
     * @return Student First Name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Getter for Last Name
     * @return Student Last Name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for First Name
     * @param firstName Student First Name
     * @throws IllegalArgumentException if student name is null or empty.
     */
    private void setFirstName(String firstName) {
        if(firstName == null || firstName.isEmpty()) throw new IllegalArgumentException("Invalid Student Name");
        this.firstName = firstName;
    }

     /**
     * Setter for First Name
     * @param lastName Student First Name
     * @throws IllegalArgumentException if student name is null or empty.
     */
    private void setLastName(String lastName) {
        if(lastName == null || lastName.isEmpty()) throw new IllegalArgumentException("Invalid Student Name");
        this.lastName = lastName;
    }

    /**
     * Getter for Student ID.
     * @return Student ID

     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * Setter for Student ID
     * @param studentID Student ID
     * @throws IllegalArgumentException if student ID is less than or equal to 0.
     */
    private void setStudentID(int studentID) {
        if(studentID <= 0) throw new IllegalArgumentException("Invalid Student ID");
        this.studentID = studentID;
    }

    /**
     * Getter for GPA
     * @return Student GPA
     */
    public double getGPA() {
        return gpa;
    }

    /**
     * Setter for GPA.
     * @param gpa Student GPA.
     * @throws IllegalArgumentException if GPA is less than 0.
     */
    public void setGPA(double gpa) {
        if(gpa < 0) throw new IllegalArgumentException("Invalid Student GPA");
        this.gpa = gpa;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }



}
