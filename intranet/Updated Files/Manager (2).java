package intranet;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Manager extends Employee implements Serializable{
	
	private Vector<Course> courses;
    private Vector<Teacher> teachers;
    private int department;
    static String actor = "Manager";
    
    /**
     * Default constructor
     */
    public Manager() {}
	  
	public Manager(String id, String password) {
		super(id,password);
	}
	  
	public Manager(String id, String password, String firstname, String lastname) {
		super(id,password,firstname,lastname);
	}

	public Manager(String id, String password, String firstname, String lastname, int dep) {
		this(id,password,firstname,lastname);
		this.department = dep;
	}
    /**
     * @param Course c 
     * @return
     */
    //Data data = Data.getInstance();

    public void addCourseForReg(Course c) {
    	Data.getInstance().getCourses().add(c);
    }

    /**
     * @param Teacher t 
     * @param String message 
     * @return
     */
    public void sendMessage( Teacher t,  String message) {
        t.getMassages().add(message); 
    }

    /**
     * @return
     */
    public void viewInfoAboutTeachers() {
        System.out.println("Numbers of teachers:"+Data.getInstance().getTeachers().size()+". Teachers:");
        for(Teacher t: Data.getInstance().getTeachers())
        {
            int i=1;
            System.out.println(i+") "+t.toString());
            i++;
        }
      
    }

    /**
     * @return
     */
    public void viewInfoAboutStudents() {
        Data.getInstance();
		System.out.println("Numbers of students:" + Data.getInstance().getStudents().size()+". Students:");
		for(Student s: Data.getInstance().getStudents())
        {
            int i=1;
            System.out.println(i+") "+s.toString());
            i++;
        }

    }
    public static Vector<Course> getCourseBySpecialty(String specialty)
    {
        Vector<Course> coursesBySpeciality= new Vector<Course>();
        for(Course c: Data.getInstance().getCourses())
        {
            if(c.getSpeciality().equals(specialty)) 
            {
                coursesBySpeciality.add(c);
            }
        }
        return coursesBySpeciality;
    }
    
    public String toString() {
        return super.toString() + " Department: " + this.department + ".";
       }
}