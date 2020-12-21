package intranet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.util.Date;
import intranet.ITester;

public class StudentTester {
	 public static void menu(Student s) throws IOException { 
		   // TODO Auto-generated method stub
		   Student myStudent = s;
		   System.out.println("Welcome "+myStudent.getName()); 
		   actions(myStudent); 
		   Data.getInstance().save(); 
	 } 

 
	public static void actions(Student student) throws IOException() {
	 Student myStudent = s;
	 System.out.println("Please choose your action:"); 
	   System.out.println("Press 1 to view transcript./n" + "Press 2 to register for  course /n"
	        + "Press 3 to view a course file/n" + "Press 4 to view info about teacher /n"
	        + "Press 5  to view a marks /n"
	        +"Press 420 to get out");
	    String action = Tester.reader.readLine();
	    switch(action) { 
	    case(420):
	    {
	     return;
	    }
	    case(1):
	    {
	     myStudent.viewTranscript();
	    }
	    case(2):
	    {
	     System.out.println("Please :");
	    }
	    case(3):
	    {
	     Course myCourse=null; 
	        System.out.println("Enter which course's file you want to see:"); 
	        String course=reader.readLine(); 
	        for(Course c: Data.getInstance().getCourses()) 
	        { 
	         if(c.getName().equals(course)) 
	         { 
	          myCourse = c; 
	          break; 
	         } 
	        } 
	        if(myCourse==null) 
	        { 
	         System.out.println("No such course"); 
	         break; 
	        } 
	        else 
	         myStudent.viewFilesOfSCourses(myCourse); 
	       }
	    case(4):
	    {
	     myTeacher.toString();
	    }
	    case(5):
	    {
	     myStudent.viewMarks();
	    }
	    }
	    
	}
  

