package intranet;

import java.util.Map; 
import java.util.Vector;

public class Student extends User{

    /**
     * Default constructor
     */
    

    private Map<Course, Mark> courses;
    private double gpa;
    private FACULTY faculty;
    private String speciality;
    private int yearOfStudy;

    /**
     * 
     */
    public Student() {}
    
    Student(String id, String password){
    	super(id,password);
    }
    
    Student(String id, String password, String name, String surname){
    	this(id,password);
    	this.firstname = name;
    	this.lastname = surname;
    }
    
    Student(String id, String password, String name, String surname, int y, FACULTY f, String spec){
    	this(id,password,name,surname);
    	this.yearOfStudy = y;
    	this.faculty = f;
    	this.speciality = spec;
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
        // TODO implement here
    	courses.forEach((k, v) -> System.out.println("Subject: " + k + ", 1 attestation: " + v.getFirstAtt() + ", 2 attestation: " +v.getSecondAtt() + ", final: " + v.getFinal()));
    }

    /**
     * @param Course c 
     * @param Teacher t 
     * @return
     */
    public boolean registerForCourse( Course c,  Teacher t) {
        // TODO implement here
    	for (Course c1: Manager.getCourses(this.speciality)) {
    		if (c1.equals(c)) this.courses.put(c,new Mark());
    		return true;
    	}
        return false;
    }

    /**
     * @return
     */
    public void viewFilesOfCourses() {
        // TODO implement here
    	for (CourseFile f: Data.getCourseFiles()) {
    		if (this.speciality.equals(f.getCourse().getSpeciality())) {
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

//    public boolean equals(Object o) {
//		if (o == this) return true;
//		if (!(o instanceof Teacher)) return false;
//		Teacher t = (Teacher) o;
//		return t.getId().equals(this.getId);
//	}
	
	public Student clone() {
		Student cloned = (Student)super.clone();
		//cloned.courses = (Map<Course,Mark>)courses.clone();
		cloned.yearOfStudy = this.yearOfStudy;
		cloned.faculty = this.faculty;
		cloned.gpa = this.gpa;
		cloned.speciality = this.speciality;
		return cloned;
	}

	//@Override
//	public int compareTo(Object o) {
//		if (o.getClass().getName().equals(this.getClass().getName())){
//			Student s = (Student) o;
//			return this.getName().compareTo(s.getName());
//		}
//		
//		// TODO Auto-generated method stub
//		return 0;
//	}
}