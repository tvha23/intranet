package intranet;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map; 
import java.util.Vector;

public class Student extends User implements Serializable{

    /**
     * Default constructor
     */
    
	String actor; 
    private Map<Course, Mark> courses;
    private double gpa;
    private FACULTY faculty;
    private String speciality;
    private int yearOfStudy;
   
    
    /**
     * 
     */
    public Student() {
    }
    
    Student(String id, String password){
    	super(id,password);
    	this.actor = "Student";
    }
    
    Student(String id, String password, String name, String surname){
    	this(id,password);
    	this.firstname = name;
    	this.lastname = surname;
    	this.actor = "Student";
    }
    
    Student(String id, String password, String name, String surname, int y, FACULTY f, String spec){
    	this(id,password,name,surname);
    	this.yearOfStudy = y;
    	this.faculty = f;
    	this.speciality = spec;
    	this.actor = "Student";
    }
    
    public void setYearOfStudy(int y) {
    	this.yearOfStudy = y;
    }
    
    public void setFaculty(FACULTY f) {
    	this.faculty = f;
    }
    
    public void setSpeciality(String s) {
    	this.speciality = s;
    }

    public Map<Course,Mark> getCourses() {
    	return this.courses;
    }

   

    /**
     * @return
     */
    public void viewTranscript() {
    	courses.forEach((k, v) -> 
    	System.out.println("Subject: " + k + ", "
    						+ "1 attestation: " + v.getFirstAtt() 
    						+ ", 2 attestation: " +v.getSecondAtt() 
    						+ ", final: " + v.getFinalExam()));
    }

    /**
     * @param Course c 
     * @param Teacher t 
     * @return
     */
    public boolean registerForCourse(Course c, Teacher t) throws TooMuchCoursesException{
    	for (Course c1: Manager.getCourseBySpecialty(this.speciality)) {
    		if (c1.equals(c)) {
    			if (this.courses.size() + 1 < 7)
    				this.courses.put(c,new Mark());
    			else 
    				throw new TooMuchCoursesException("Maximum number of courses exceeded"); 
    		}
    		
    		return true;
    	}
        return false;
    }

    /**
     * @return
     */
    public void viewFilesOfCourses() {
        // TODO implement here
    	for (CourseFile f: Data.getInstance().getCourseFiles()) {
    		if (this.faculty.equals(f.getFaculty())) {
    			System.out.println(f);
    		}
    	}
        
    }

    /**
     * @param Teacher t 
     * @return
     */
    public void viewInfoAboutTeacher( Teacher t) {
        // TODO implement here
        System.out.println(t);
    }

    /**
     * @param Course c 
     * @return
     */
    public void viewMarks( Course c) {
        // TODO implement here
    	courses.forEach((k, v) -> System.out.println("Subject: " + k + ", Mark: " + v));
        
    }
    
	
	public Student clone() throws CloneNotSupportedException {
		Student cloned = (Student)super.clone();
		//cloned.courses = (Map<Course,Mark>)courses.clone();
		Map<Course,Mark> clonedCourses = new HashMap<Course,Mark>();
		clonedCourses.putAll(this.courses);
		cloned.courses = clonedCourses;
		cloned.yearOfStudy = this.yearOfStudy;
		cloned.faculty = this.faculty;
		cloned.gpa = this.gpa;
		cloned.speciality = this.speciality;
		return cloned;
	}

	@Override
	public String getActor() {
		// TODO Auto-generated method stub
		return "Student";
	}

	
}