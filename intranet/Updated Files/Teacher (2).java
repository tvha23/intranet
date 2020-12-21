package intranet;

import java.io.Serializable;
import java.util.Vector;


public class Teacher extends Employee implements Serializable{
	static String actor = "Teacher"; 
    private Vector<Course> courses;
    private RANK status;
    private Vector<CourseFile> courseFiles;
    private int department;
    private Vector<String> massages;

    public Teacher() {}
    
    Teacher(String id, String password){
    	super(id,password);
    }
    
    Teacher(String id, String password, String name, String surname){
    	this(id,password);
    	this.firstname = name;
    	this.lastname = surname;
    }
    Teacher(String id, String password, String name, String surname, RANK R, int dep){
    	this(id,password,name,surname);
    	this.status = R;
    	this.department = dep;
    }

//    public String getName() {
//    	return this.lastname + " " + this.firstname;
//    }
    
    public String getRank() {
    	return String.valueOf(this.status);
    }
    
    public Vector<Course> getCourses() {
    	return this.courses;
    }
    
    public Vector<CourseFile> getCourseFiles(){ 
    	return this.courseFiles;
    }
    
    public Vector<String> getMassages(){
    	return this.massages;
    }
    
    public int getDepartment() {
    	return this.department;
    }
    
    public void setRank(RANK r) {
    	this.status = r;
    }
    
    public void setDepartment(int d) {
    	this.department = d;
    }
    /**
     * @param Course c 
     * @return
     */
    public void addCourse( Course c) {
    	courses.add(c);
        // TODO implement here
        
    }

    /**
     * @param Course c 
     * @return
     */
    public void deleteCourse( Course c) {
        // TODO implement here
    	courses.remove(c);
    }

    /**
     * @param Course c 
     * @param Student s 
     * @param Mark m 
     * @return
     */
    public void putMark( Course c,  Student s,  Mark m) {
        for (Student s1: c.getStudents()) {
        	if (s1.equals(s)) {
        		s.getCourses().put(c,m);
        	}
        }
    }

    /**
     * @param Student s 
     * @return
     */
    public void viewInfo( Student s) {
        // TODO implement here
        System.out.println(s.toString());
    }

    /**
     * @param Course c 
     * @return
     */
    public void viewInfo( Course c) {
        // TODO implement here
    	System.out.println(c.toString());
    }

    /**
     * @param Course c 
     * @return
     */
    public void viewListOfStudents( Course c) {
        // TODO implement here
        for (Student s: c.getStudents()) {
        	System.out.println(s.toString());
        }
    }

    /**
     * @param CourseFile c 
     * @return
     */
    public void addCourseFile( CourseFile c) {
    	courseFiles.add(c);
        // TODO implement here
        
    }
    public void deleteCourseFile( CourseFile c) {
    	courseFiles.remove(c);
        // TODO implement here
        
    }
    
    public String toString() {
    	return "Teacher: "+this.getRank()+" "+super.toString();
    }

	@Override
	public void sendOrder(Order o) {
		// TODO Auto-generated method stub
		Data.getInstance().getOrders().add(o);
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof Teacher)) return false;
		Teacher t = (Teacher) o;
		return t.getId().equals(this.getId());
	}
	
	
	public Teacher clone() throws CloneNotSupportedException {
		Teacher cloned = (Teacher)super.clone();
		cloned.courseFiles = (Vector<CourseFile>)courseFiles.clone();
		cloned.courses = (Vector<Course>)courses.clone();
		cloned.status = this.status;
		return cloned;
	}

//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		if (o.getClass().getName().equals(this.getClass().getName())){
//			Teacher t = (Teacher) o;
//			return this.getName().compareTo(t.getName());
//		}
//		return 0;
//	}
}