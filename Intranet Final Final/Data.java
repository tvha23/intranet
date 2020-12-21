package intranet;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.util.*;

public class Data {

	private Vector<Course> courses = new Vector<Course>();
	private Vector<User> users = new Vector<User>();
	private Vector<Admin> admins = new Vector<Admin>();
	private Vector<Student> students = new Vector<Student>();
	private Vector<Teacher> teachers = new Vector<Teacher>();
	private Vector<TechSupportGuy> techSupportGuys = new Vector<TechSupportGuy>();
	private Vector<Manager> managers = new Vector<Manager>();
	private Vector<Order> orders = new Vector<Order>();
	private Vector<CourseFile> courseFiles = new Vector<CourseFile>();
	
	private FileInputStream fis;
	private FileOutputStream fos;
	private ObjectOutputStream oos;
	private ObjectInputStream oin;

	private static final Data data= new Data();
	
	public void coursesDes() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("courses");
		oin = new ObjectInputStream(fis);
		courses = (Vector<Course>) oin.readObject();
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
		oos.writeObject(admins);
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
		fis = new FileInputStream("students");
		oin = new ObjectInputStream(fis);
		students = (Vector<Student>) oin.readObject();
	}
	public void studentSer() throws IOException{
		fos = new FileOutputStream("students");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(students);
		oos.close();
	}
	
	public void teacherDes() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("teachers");
		oin = new ObjectInputStream(fis);
		teachers = (Vector<Teacher>) oin.readObject();
	}
	public void teacherSer()throws IOException{
		fos = new FileOutputStream("teachers");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(teachers);
		oos.close();
	}
	
	public void techSupportGuyDes() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("techSupportGuys");
		oin = new ObjectInputStream(fis);
		techSupportGuys = (Vector<TechSupportGuy>) oin.readObject();
	}
	public void techSupportGuySer() throws IOException{
		fos = new FileOutputStream("techSupportGuys");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(techSupportGuys);
		oos.close();
	}
	
	public void managerDes() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("managers");
		oin = new ObjectInputStream(fis);
		managers = (Vector<Manager>) oin.readObject();
	}
	public void managerSer() throws IOException{
		fos = new FileOutputStream("managers");
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
		fos = new FileOutputStream("orders");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(orders);
		oos.close();
	}
	
	public void courseFilesDes() throws IOException, ClassNotFoundException{
		fis = new FileInputStream("courseFiles");
		oin = new ObjectInputStream(fis);
		courseFiles = (Vector<CourseFile>) oin.readObject();
	}
	public void courseFilesSer() throws IOException{
		fos = new FileOutputStream("courseFiles");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(courseFiles);
		oos.close();
	}
	//~~~~~~~~~~~~
	
	public void save() throws IOException {
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
	
	public void deserialize() throws ClassNotFoundException, IOException {
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