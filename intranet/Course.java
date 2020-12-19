package intranet;

import java.io.Serializable;
import java.util.Vector;

public class Course implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -210789856211635347L;

    /**
     * Default constructor
     */
    public Course() {
    }

    /**
     * 
     */
    private FACULTY faculty;

    /**
     * 
     */
    private String specialty;

    /**
     * 
     */
    private Vector<Student> students;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private int credit;

    /**
     * 
     */
    public Course prerequisite;

    /**
     * 
     */
    public Mark mark;








    /**
     * @return
     */
    public Mark avgMark() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public double avgGpa() {
        // TODO implement here
        return 0.0d;
    }

}
