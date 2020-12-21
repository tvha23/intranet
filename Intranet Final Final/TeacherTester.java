package intranet;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import intranet.ITester;

public class TeacherTester {

	public static void menu(Teacher t) throws Exception, IOException {
		Teacher myTeacher=t;
		System.out.println("Welcome to the System " + myTeacher.getName());
		actions(myTeacher);
		Data.getInstance().save();
	}




	public static void actions(Teacher t)throws IOException {
		Teacher myTeacher=t;
		System.out.println( "Press 1 to view list of students.\n"  
						   +"Press 2 to add a course file\n"
						   +"Press 3 to remove a course file\n" 
						   +"Press 4 to view info about yourself \n"
						   +"Press 5 to send order to Tech Supoort Guy(he doesn't like you)\n"
						   +"Press 6 to put a mark to a student \n"
						   +"Press 7 to add a course\n"
						   +"Press 420 to get out");
			int Menuchoice=Integer.parseInt( Tester.reader.readLine());
			switch(Menuchoice)
			{


			case(420):
			{
				System.out.println("Bye");
				System.exit(0);
			}

			case(1):
			{
				Course myCourse=null;
				System.out.println("Enter which course's list you want to see:");
				String course=Tester.reader.readLine();
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
					myTeacher.viewListOfStudents(myCourse);
				actions(myTeacher);
			}

			case(2)://add course file
			{
				System.out.println("Enter course file name and it's extension:");
				String fileName=Tester.reader.readLine(), fileExtension=Tester.reader.readLine();
				myTeacher.addCourseFile(new CourseFile(fileName, fileExtension));
				System.out.println("File added, successfully.");
				actions(myTeacher);
			}

			case(3)://delete course file
			{
				System.out.println("Enter course file name and it's extension to remove:");
				String fileName=Tester.reader.readLine();
				String fileExtension=Tester.reader.readLine();
				
				for(CourseFile cf:myTeacher.getCourseFiles())
				{
					if(cf.getCourseFileName().equals(fileName) && cf.getCourseFileType().equals(fileExtension))
					{
						myTeacher.deleteCourseFile(cf);
						System.out.println("File removed.");
					}
				}
				actions(myTeacher);
			}

			case(4)://view info about u
			{
				System.out.println();
			}

			case(5)://send Order
			{
				System.out.println("Enter message, and theme of the message to Tech Guy");
				String message=Tester.reader.readLine(), theme=Tester.reader.readLine();
				Date date=new Date();
				myTeacher.sendOrder(new Order(date,  message, theme));
				System.out.println("Order sent.");
				actions(myTeacher);
			}

			case(6)://put Marks
			{
				Course myCourse=null;
				System.out.println("Select name of course that you want to put mark:");
				String name=Tester.reader.readLine();
				for(Course c:myTeacher.getCourses())
				{

					if(name.equals(c.getName()))
					{
						myCourse=c;
						break;
					}
				}

				System.out.println("Write your target student's id:");
				String id =Tester.reader.readLine();
				Student myStudent=null;

				for(Course c: myTeacher.getCourses())
				{
					for(Student s:c.getStudents())
						if(s.getId().equals(id))
						{
							myStudent=s;
							break;
						}
				}
				if(myStudent==null)
				{
					System.out.println("Are you trying put mark to a ghost? This student doesn't exists");
					return;
				}

				System.out.println("Select to where you want put points.\n 1- 1st Attestation\n2- 2nd Attestation\n3-Final");
				int markChoice=Integer.parseInt(Tester.reader.readLine());
				System.out.println("Please choose the amount");
				double mark=Double.parseDouble(Tester.reader.readLine());
				switch(markChoice)
				{
					case(1):
					{
						Mark myMark=new Mark();
						myMark.setFirstAtt(mark);
						myTeacher.putMark(myCourse, myStudent, myMark);
						System.out.println("Marks put successfully.");
					}
	
					case(2):
					{
						Mark myMark=new Mark();
						myMark.setSecondAtt(mark);
						myTeacher.putMark(myCourse, myStudent, myMark);
						System.out.println("Marks put successfully.");
					}
	
					case(3):
					{
						Mark myMark=new Mark();
						myMark.setFinalExam(mark);
						myTeacher.putMark(myCourse, myStudent, myMark);
						System.out.println("Marks put successfully.");
					}
				}
			}

			case(7):
			{
				System.out.println("Enter the name,  of course you want to add:");
				String CourseName=Tester.reader.readLine();
				System.out.println("Enter course specialty:");
				String specialty=Tester.reader.readLine();
				System.out.println("Enter course credit(number):");
				int credit=Integer.parseInt(Tester.reader.readLine());
				System.out.println("Choose faculty:1- BS\n2-SEC\n3-CE\n4-GE\n5-IT\n6-MA\n7-OAG\n8-SOM");
				String fac = Tester.reader.readLine();
				FACULTY f;
				if (fac.equals("1")) f = FACULTY.BUSSINESS_SCHOOL;
				else if (fac.equals("2")) f = FACULTY.SCHOOL_OF_ECONOMICS;
				else if (fac.equals("3")) f = FACULTY.CHEMICAL_ENGINEERING;
				else if (fac.equals("4")) f = FACULTY.GEOLOGICAL_EXPLORATION;
				else if (fac.equals("5")) f = FACULTY.INFORMATION_TECHNOLOGIES;
				else if (fac.equals("6")) f = FACULTY.MARITIME_ACADEMY;
				else if (fac.equals("7")) f = FACULTY.OIL_AND_GAS;
				else f = FACULTY.SCHOOL_OF_MATHEMATICS;
				Course myCourse=new Course(f, specialty, CourseName, credit);
				myTeacher.addCourse(myCourse);
				System.out.println("Course added successfully.");
				actions(myTeacher);
			}
		}
	

	}

}
