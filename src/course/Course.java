package course;
/**
 * Class representing Course object. Each course has a name, title, ID, and instructor.
 */
public class Course {

    /** Course Name */
    private String name;
    /** Course Title */
    private String title;
    /** Course Section */
    private int section;
    /** Course Instructor */
    private String instructor;
    /** Course Grade */
    private int grade;

    /**
     * Constructor for Course.
     * @param name Course Name
     * @param title Course Title
     * @param section Course Section
     * @param instructor Course Instructor
     */
    public Course(String name, String title, int section, String instructor, int grade) {
        setName(name);
        setTitle(title);
        setSection(section);
        setInstructor(instructor);
        setGrade(grade);
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
     * Setter for Course Section.
     * @param section Course Section
     * @throws IllegalArgumentException if Section is less than or equal to 0 or greater than 999.
     */
    private void setSection(int section) {
        if(section <= 0 || section > 999) throw new IllegalArgumentException("Invalid ID for Course");
        this.section = section;
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

    /**
     * Setter for Grade.
     * @param grade Student's Grade
     */
      public void setGrade(int grade) {
        if(grade < 0) throw new IllegalArgumentException("Invalid Grade");
        this.grade = grade;
    }

}
