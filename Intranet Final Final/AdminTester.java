package intranet;

import java.io.IOException;

public class AdminTester{
	public static void menu(Admin admin) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome "+admin.getName());
		actions(admin);
		Data.getInstance().save();
	}

	public static void actions(Admin admin) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Please choose your action:");
		System.out.println("1)Add a new user\n2)delete User\n3)Update password of a user\n4)Update name of a user\n5)update Surname\n6)view list of users\n7)Exit");
		String action = Tester.reader.readLine();
		switch(action) {
		case "1":{
			System.out.println("What type of user you want to add:\n1)Admin\n2)Teacher\n3)Student\n4)Manager\n5)TechSupportGuy");
			String actor = Tester.reader.readLine();
			if (actor.equals("1")) {
				System.out.print("Login:");
				String log = Tester.reader.readLine();
				System.out.print("Password:");
				String password = Tester.reader.readLine();
				System.out.print("Name:");
				String name = Tester.reader.readLine();
				System.out.print("Surname:");
				String surname = Tester.reader.readLine();
				User newAdmin = new Admin(log,password,name,surname);
				admin.addUser(newAdmin);
			}
			else if (actor.equals("2")) {
				System.out.print("Login:");
				String log = Tester.reader.readLine();
				System.out.print("Password:");
				String password = Tester.reader.readLine();
				System.out.print("Name:");
				String name = Tester.reader.readLine();
				System.out.print("Surname:");
				String surname = Tester.reader.readLine();
				System.out.println("Rank:1)Tutor\n2)Lector\n3)Senior Lector\n4)Professor");
				String rank = Tester.reader.readLine();
				RANK r;
				if (rank.equals("1")) r = RANK.TUTOR;
				else if (rank.equals("2")) r = RANK.LECTOR;
				else if (rank.equals("3")) r = RANK.SENIOR_LECTOR;
				else r = RANK.PROFESSOR;
				System.out.print("Department:");
				String department = Tester.reader.readLine();
				int dep = Integer.parseInt(department);
				User newTeacher = new Teacher(log,password,name,surname,r,dep);
				admin.addUser(newTeacher);
			}
			else if (actor.equals("3")) {
				System.out.print("Login:");
				String log = Tester.reader.readLine();
				System.out.print("Password:");
				String password = Tester.reader.readLine();
				System.out.print("Name:");
				String name = Tester.reader.readLine();
				System.out.print("Surname:");
				String surname = Tester.reader.readLine();
				System.out.print("Year of study:");
				String year = Tester.reader.readLine();
				int y = Integer.parseInt(year);
				System.out.println("Faculty:\n1)SCHOOL_OF_ECONOMICS\n2)BUSSINESS_SCHOOL\n3)CHEMICAL_ENGINEERING\n4)GEOLOGICAL_EXPLORATION\n5)INFORMATION_TECHNOLOGIES\n6)MARITIME_ACADEMY\n7)OIL_AND_GAS\n8)SCHOOL_OF_MATHEMATICS");
				String fac = Tester.reader.readLine();
				FACULTY f;
				if (fac.equals("1")) f = FACULTY.SCHOOL_OF_ECONOMICS;
				else if (fac.equals("2")) f = FACULTY.BUSSINESS_SCHOOL;
				else if (fac.equals("3")) f = FACULTY.CHEMICAL_ENGINEERING;
				else if (fac.equals("4")) f = FACULTY.GEOLOGICAL_EXPLORATION;
				else if (fac.equals("5")) f = FACULTY.INFORMATION_TECHNOLOGIES;
				else if (fac.equals("6")) f = FACULTY.MARITIME_ACADEMY;
				else if (fac.equals("7")) f = FACULTY.OIL_AND_GAS;
				else f = FACULTY.SCHOOL_OF_MATHEMATICS;
				System.out.println("Speciality:");
				String spec = Tester.reader.readLine();
				User newStudent = new Student(log,password,name,surname,y,f,spec);
				admin.addUser(newStudent);
			}
			else if (actor.equals("4")) {
				System.out.print("Login:");
				String log = Tester.reader.readLine();
				System.out.print("Password:");
				String password = Tester.reader.readLine();
				System.out.print("Name:");
				String name = Tester.reader.readLine();
				System.out.print("Surname:");
				String surname = Tester.reader.readLine();
				System.out.print("Department:");
				String department = Tester.reader.readLine();
				int dep = Integer.parseInt(department);
				User newManager = new Manager(log,password,name,surname,dep);
				admin.addUser(newManager);
			}
			else if (actor.equals("5")) {
				System.out.print("Login:");
				String log = Tester.reader.readLine();
				System.out.print("Password:");
				String password = Tester.reader.readLine();
				System.out.print("Name:");
				String name = Tester.reader.readLine();
				System.out.print("Surname:");
				String surname = Tester.reader.readLine();
				User newTG = new TechSupportGuy(log,password,name,surname);
				admin.addUser(newTG);
			}
			System.out.println("User added successfully\n");
			actions(admin);
		}
		case "2":{
			System.out.println("What type of user you want to delete:\n1)Admin\n2)Teacher\n3)Student\n4)Manager\n5)TechSupportGuy");
			String actor = Tester.reader.readLine();
			if (actor.equals("1")) {
				System.out.print("Login:");
				String log = Tester.reader.readLine();
				boolean find = false;
				for (Admin t: Data.getInstance().getAdmins()) {
					if (t.getId().equals(log)) {
						find = true;
						admin.deleteUser(t);
						break;
					}
				}
				if (!find) System.out.println("No such user(\n");
				else System.out.println("User deleted successfully\n");
				actions(admin);
			}
			else if (actor.equals("2")) {
				System.out.print("Login:");
				String log = Tester.reader.readLine();
				boolean find = false;
				for (Teacher t: Data.getInstance().getTeachers()) {
					if (t.getId().equals(log)) {
						find = true;
						admin.deleteUser(t);
						break;
					}
				}
				if (!find) System.out.println("No such user(\n");
				else System.out.println("User deleted successfully\n");
				actions(admin);
			}
			else if (actor.equals("3")) {
				System.out.print("Login:");
				String log = Tester.reader.readLine();
				boolean find = false;
				for (Student t: Data.getInstance().getStudents()) {
					if (t.getId().equals(log)) {
						find = true;
						admin.deleteUser(t);
						break;
					}
				}
				if (!find) System.out.println("No such user(\n");
				else System.out.println("User deleted successfully\n");
				actions(admin);
			}
			else if (actor.equals("4")) {
				System.out.print("Login:");
				String log = Tester.reader.readLine();
				boolean find = false;
				for (Manager t: Data.getInstance().getManagers()) {
					if (t.getId().equals(log)) {
						find = true;
						admin.deleteUser(t);
						break;
					}
				}
				if (!find) System.out.println("No such user(\n");
				else System.out.println("User deleted successfully\n");
				actions(admin);
			}
			else if (actor.equals("5")) {
				System.out.print("Login:");
				String log = Tester.reader.readLine();
				boolean find = false;
				for (TechSupportGuy t: Data.getInstance().getTechSupportGuys()) {
					if (t.getId().equals(log)) {
						find = true;
						admin.deleteUser(t);
						break;
					}
				}
				if (!find) System.out.println("No such user(\n");
				else System.out.println("User deleted successfully\n");
				actions(admin);
			}
			
		}
		case "3":{
			System.out.print("Login:");
			String log = Tester.reader.readLine();
			boolean find = false;
			for (User us: Data.getInstance().getUsers()) {
				if (us.getId().equals(log)) {
					find = true;
					System.out.println("New password:");
					String newPassword = Tester.reader.readLine();
					admin.updatePassword(us, newPassword);
					break;
				}
			}
			if (!find) System.out.println("No such user(");
			else System.out.println("Password changed successfuly");
			actions(admin);
			
		}
		case "4":{
			System.out.print("Login:");
			String log = Tester.reader.readLine();
			boolean find = false;
			for (User us: Data.getInstance().getUsers()) {
				if (us.getId().equals(log)) {
					find = true;
					System.out.println("New name:");
					String newName = Tester.reader.readLine();
					admin.updateName(us, newName);
					break;
				}
			}
			if (!find) System.out.println("No such user(");
			else System.out.println("Name changed successfuly");
			actions(admin);
			
		}
		case "5":{
			System.out.print("Login:");
			String log = Tester.reader.readLine();
			boolean find = false;
			for (User us: Data.getInstance().getUsers()) {
				if (us.getId().equals(log)) {
					find = true;
					System.out.println("New surname:");
					String newSurname = Tester.reader.readLine();
					admin.updateSurname(us, newSurname);
				}
			}
			if (!find) System.out.println("No such user(");
			else System.out.println("Surname changed successfuly");
			actions(admin);
		}
		case "6":{
			for(User u: Data.getInstance().getUsers()) {
				System.out.println(u);
			}
			actions(admin);
		}
		case "7":{
			Data.getInstance().save();
			System.out.println("Bye!");
			System.exit(0);
		}
		}
	}
	

}
