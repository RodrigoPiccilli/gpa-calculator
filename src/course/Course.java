package course;
/**
 * Class representing Course object. Each course has a name, title, ID, and instructor.
 */
public class Course {

    /** Course Name */
    private String name;
    /** Course Title */
    private String title;
    /** Course ID */
    private int courseID;
    /** Course Instructor */
    private String instructor;

    /**
     * Constructor for Course.
     * @param name Course Name
     * @param title Course Title
     * @param courseID Course ID
     * @param instructor Course Instructor
     */
    public Course(String name, String title, int courseID, String instructor) {
        setName(name);
        setTitle(title);
        setID(courseID);
        setInstructor(instructor);
    }


    /**
     * Setter for Name.
     * @param name Course Name
     * @throws IllegalArgumentException if name is null or empty.
     */
    private void setName(String name) {
        if(name == null || name.isEmpty()) throw new IllegalArgumentException("Invalid Name for Course");
        this.name = name;
    }

    /**
     * Setter for Title.
     * @param title Course Name
     * @throws IllegalArgumentException if title is null or empty.
     */
    private void setTitle(String title) {
        if(title == null | title.isEmpty()) throw new IllegalArgumentException("Invalid Title for Course");
        this.title = title;
    }

    /**
     * Setter for Course ID.
     * @param courseID Course ID
     * @throws IllegalArgumentException if ID is less than or equal to 0.
     */
    private void setID(int courseID) {
        if(courseID <= 0) throw new IllegalArgumentException("Invalid ID for Course");
        this.courseID = courseID;
    }

    /**
     * Setter for Instructor.
     * @param instructor Course Instructor
     * @throws IllegalArgumentException if instructor is null or empty.
     */
    private void setInstructor(String instructor) {
        if(instructor == null || instructor.isEmpty()) throw new IllegalArgumentException("Invalid Instructor for Course");
        this.instructor = instructor;
    }

}
