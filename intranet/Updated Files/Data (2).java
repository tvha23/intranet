package intranet;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.util.*;

public class Data {

	private Vector<Course> courses;
	private Vector<User> users;
	private Vector<Admin> admins;
	private Vector<Student> students;
	private Vector<Teacher> teachers;
	private Vector<TechSupportGuy> techSupportGuys;
	private Vector<Manager> managers;
	private Vector<Order> orders;
	private Vector<CourseFile> courseFiles;
	
	static FileInputStream fis;
	static FileOutputStream fos;
	static ObjectOutputStream oos;
	static ObjectInputStream oin;
	
	public Data() {
		courses = new Vector<Course>();
		users = new Vector<User>();
		admins = new Vector<Admin>();
		students = new Vector<Student>();
		teachers = new Vector<Teacher>();
		techSupportGuys = new Vector<TechSupportGuy>();
		managers = new Vector<Manager>();
		orders = new Vector<Order>();
		courseFiles = new Vector<CourseFile>();
	}

	private static final Data data= new Data();
	
	public void coursesDes() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("courses");
		oin = new ObjectInputStream(fis);
		Vector<Course> readObject2 = (Vector<Course>) oin.readObject();
		Vector<Course> readObject = readObject2;
		this.courses = readObject2;
	}
	public void coursesSer()throws IOException{
		fos = new FileOutputStream("courses");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(courses);
		oos.close();
	}
	
	public void adminsDes() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("admins");
		oin = new ObjectInputStream(fis);
		admins = (Vector<Admin>) oin.readObject();
	}
	public void adminsSer()throws IOException{
		fos = new FileOutputStream("admins");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(courses);
		oos.close();
	}
	
	public void userDes() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("users");
		oin = new ObjectInputStream(fis);
		users = (Vector<User>) oin.readObject();
	}
	public void userSer()throws IOException{
		fos = new FileOutputStream("users");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(users);
		oos.close();
	}
	
	public void studentDes() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("student");
		oin = new ObjectInputStream(fis);
		students = (Vector<Student>) oin.readObject();
	}
	public void studentSer() throws IOException{
		fos = new FileOutputStream("student");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(students);
		oos.close();
	}
	
	public void teacherDes() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("student");
		oin = new ObjectInputStream(fis);
		teachers = (Vector<Teacher>) oin.readObject();
	}
	public void teacherSer()throws IOException{
		fos = new FileOutputStream("student");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(teachers);
		oos.close();
	}
	
	public void techSupportGuyDes() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("student");
		oin = new ObjectInputStream(fis);
		techSupportGuys = (Vector<TechSupportGuy>) oin.readObject();
	}
	public void techSupportGuySer() throws IOException{
		fos = new FileOutputStream("student");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(techSupportGuys);
		oos.close();
	}
	
	public void managerDes() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("student");
		oin = new ObjectInputStream(fis);
		managers = (Vector<Manager>) oin.readObject();
	}
	public void managerSer() throws IOException{
		fos = new FileOutputStream("student");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(managers);
		oos.close();
	}
	
	public void orderDes() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("orders");
		oin = new ObjectInputStream(fis);
		orders = (Vector<Order>) oin.readObject();
	}
	public void orderSer() throws IOException{
		fos = new FileOutputStream("student");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(orders);
		oos.close();
	}
	
	public void courseFilesDes() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("student");
		oin = new ObjectInputStream(fis);
		this.courseFiles = (Vector<CourseFile>) oin.readObject();
	}
	public void courseFilesSer() throws IOException{
		fos = new FileOutputStream("student");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(courseFiles);
		oos.close();
	}
	//~~~~~~~~~~~~
	
	public static void save() throws IOException {
		data.courseFilesSer();
		data.teacherSer();
		data.studentSer();
		data.managerSer();
		data.orderSer();
		data.userSer();
		data.adminsSer();
		data.teacherSer();
		data.coursesSer();
	}
	
	public static void deserialize() throws ClassNotFoundException, IOException {
		if(new File("courses").exists()) data.coursesDes();
		if(new File("students").exists()) data.studentDes();
		if(new File("techSupportGuys").exists()) data.techSupportGuyDes();
		if(new File("teachers").exists()) data.teacherDes();
		if(new File("managers").exists()) data.managerDes();
		if(new File("orders").exists()) data.orderDes();
		if(new File("users").exists()) data.userDes();
		if(new File("admins").exists()) data.adminsDes();
		if(new File("courseFiles").exists()) data.courseFilesDes();
		
	}


	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~Getters and Setters~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public static Data getInstance() { //Singleton
		return data;
	}
	
	public  Vector<Course> getCourses() {
		return data.courses;
	}

	public  Vector<Teacher> getTeachers() {
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
	
	public Vector<Manager> getManagers(){
		return data.managers;
	}
	
	public Vector<Order> getOrders(){
		return data.orders;
	}
	
	public Vector<CourseFile> getCourseFiles(){
		return data.courseFiles;
	}
	
	public Vector<Admin> getAdmins(){
		return data.admins;
	}

}