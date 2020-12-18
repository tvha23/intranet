package intranet;


import java.util.*;

/**
 * 
 */
public class Data {
	
	/**
	 * Default constructor
	 */
	public Data() {
	}

	/**
	 * 
	 */
	private Vector<Course> courses;

	/**
	 * 
	 */
	private Vector<User> users;

	/**
	 * 
	 */
	private Vector<Student> students;

	/**
	 * 
	 */
	private Vector<Teacher> teachers;

	/**
	 * 
	 */
	private Vector<TechSupportGuy> techSupportGuys;

	/**
	 * 
	 */
	private Map<String, String> loginAndPassword;

	/**
	 * 
	 */
	private Vector<Manager> managers;

	private static final Data data= new Data();

	//Getters and Setters
	public static Data getInstance()//Singleton
	{
		return data;
	}
	public Vector<Course> getCourses()
	{
		return data.courses;
	}

	public Vector<Teacher> getTeachers()
	{
		return data.teachers;
	}
	
	public Vector<Student> getStudents() {
		return data.students;
	}
	
	public Vector<User> getUsers() {
		return data.users;
	
	}
	
	public Vector<TechSupportGuy> getTechSupportGuys() {
		return data.techSupportGuys;
	}
	
	public Vector<Manager> getManagers()
	{
		return data.managers;
	}











}