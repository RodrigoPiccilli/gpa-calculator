package student;

/**
 * Class representing student object. Each student has their own gpa, name, and student ID number.
 * 
 * @author Rodrigo Piccilli
 */
public class Student {

    /** Student Name */
    private String name;
    /** Student ID */
    private int studentID;
    /** Student GPA */
    private double gpa;
    
    /**
     * Constructor For Student Object.
     * @param name  Student Name
     * @param studentID Student ID
     * @param gpa   Student GPA
     */
    public Student(String name, int studentID, double gpa) {
        setName(name);
        setStudentID(studentID);
        setGPA(gpa);
    }

    /**
     * Getter for Name
     * @return Student Name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for Name
     * @param name Student Name
     * @throws IllegalArgumentException if student name is null or empty.
     */
    private void setName(String name) {
        if(name == null || name.isEmpty()) throw new IllegalArgumentException("Invalid Student Name");
        this.name = name;
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



}
