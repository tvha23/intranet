package intranet;

import java.util.Vector;

public class Course {

    /**
     * Default constructor
     */
    public Course() {}

    /**
     * 
     */
    private FACULTY faculty;
    private String speciality;
    private Vector<Student> students;
    private String name;
    private int credit;
    public Course prerequisite;

    Course(FACULTY f, String spec, String name, int cred){
    	this.faculty = f;
    	this.speciality = spec;
    	this.name = name;
    	this.credit = cred;
    }
    
    void setPrerequisite(Course c) {
    	this.prerequisite = c;
    }

    public Vector<Student> getStudents(){
    	return this.students;
    }
    
    public String getSpeciality() {
    	return this.speciality;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public String toString() {
    	return name + ", faculty: "+faculty+", speciality: "+ speciality+", number of credits: "+credit+", prerequisite"+this.prerequisite.name;
    }
    /**
     * @return
     */
//    public int avgMark() {
//    	double avg = 0;
//    	for (Student s: this.getStudents()) {
//    		for ()
//    	}
//        // TODO implement here
//        return null;
//    }

    /**
     * @return
     */
//    public double avgGpa() {
//        // TODO implement here
//        return 0.0d;
//    }

}