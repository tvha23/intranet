package intranet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tester{
	public static BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
	public static void main(String [] args) throws Exception{
        Data.getInstance().deserialize();
        Admin a = new Admin("farabi_amina","123456","Amina","Farabi");
        Data.getInstance().getAdmins().add(a);
        for (int i = 0; i < Data.getInstance().getUsers().size(); i++) 
        	System.out.println(Data.getInstance().getUsers().get(i));
        Tester.menu();
        Data.getInstance().save();
    }
	public static void menu() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Intranet!");
		System.out.println("Please choose your action:\n1)Autorization\n2)Exit");
		String in = reader.readLine();
		if (in.equals("1")) {
			actions();
		}
		if (in.equals("2")) {
			Data.getInstance().save();
			System.exit(0);
		}
			

	}
	

	public static void actions() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Who do you want to enter as?(choose the option)");
		System.out.println("1)Admin\n2)Teacher\n3)Student\n4)Manager\n5)TechSupportGuy");
		String actor = reader.readLine();
		System.out.print("Login:");
		String log = reader.readLine();
		System.out.print("Password:");
		String password = reader.readLine();
		switch(actor) {
			case "1":{
				for (Admin adm: Data.getInstance().getAdmins()) {
					if (password.equals(adm.getPassword()) && log.equals(adm.getId())) {
						System.out.println("Logged Seccessfuly!");
	                    AdminTester.menu(adm);
	                    return;
					}
				}
				System.out.println("Invalid password or login!Try again!");
				menu();
			}
			case "2":{
				for (Teacher t: Data.getInstance().getTeachers()) {
					if (password.equals(t.getPassword()) && log.equals(t.getId())) {
						System.out.println("Logged Seccessfuly!");
						TeacherTester.menu(t);
	                    return;
					}
				}
				System.out.println("Invalid password or login!Try again!");
				menu();
			}
			case "3":{
				for (int i = 0; i < Data.getInstance().getStudents().size(); i++) {
					if (password.equals(Data.getInstance().getStudents().get(i).getPassword()) && log.equals(Data.getInstance().getStudents().get(i).getId())) {
						System.out.println("Logged Seccessfuly!");
						//StudentDriver.menu(Data.getInstance().getStudents().elementAt(i));
	                    return;
					}
					else {
						System.out.println("Invalid password or login!Try again!");
						menu();
					}
				}
			}
			case "4":{
				for (int i = 0; i < Data.getInstance().getManagers().size(); i++) {
					if (password.equals(Data.getInstance().getManagers().get(i).getPassword()) && log.equals(Data.getInstance().getManagers().get(i).getId())) {
						System.out.println("Logged Seccessfuly!");
						//ManagerDriver.menu(Data.getInstance().getManagers().elementAt(i));
	                    return;
					}
					else {
						System.out.println("Invalid password or login!Try again!");
						menu();
					}
				}
			}
			case "5":{
				for (int i = 0; i < Data.getInstance().getTechSupportGuys().size(); i++) {
					if (password.equals(Data.getInstance().getTechSupportGuys().get(i).getPassword()) && log.equals(Data.getInstance().getTechSupportGuys().get(i).getId())) {
						System.out.println("Logged Seccessfuly!");
						//TechSupportGuyDriver.menu(Data.getInstance().getTechSupportGuys().elementAt(i));
	                    return;
					}
					else {
						System.out.println("Invalid password or login!Try again!");
						menu();
					}
				}
			}
		}
	}
}
