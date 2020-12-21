package intranet;

import java.io.Serializable;

//import java.util.*;

/**
 * 
 */
public class Admin extends User implements Serializable{
	String actor;
    public Admin() {}
	public Admin(String id, String password) {
		super(id,password);
		this.actor = "Admin";
	}
	public Admin(String id, String password, String firstname, String lastname) {
		super(id,password,firstname,lastname);
		this.actor = "Admin";
	}
	
    public void addUser(User u) {
        Data.getInstance().getUsers().add(u);
        if (u.getActor().equals("Teacher")) {
        	Teacher t = (Teacher) u;
        	Data.getInstance().getTeachers().add(t);
        }
        if (u.getActor().equals("Admin")) {
        	Admin a = (Admin) u;
        	Data.getInstance().getAdmins().add(a);
        }
        if (u.getActor().equals("TechSupportGuy")) {
        	TechSupportGuy t = (TechSupportGuy) u;
        	Data.getInstance().getTechSupportGuys().add(t);
        }
        if (u.getActor().equals("Manager")) {
        	Manager t = (Manager) u;
        	Data.getInstance().getManagers().add(t);
        }
        if (u.getActor().equals("Student")) {
        	Student t = (Student) u;
        	Data.getInstance().getStudents().add(t);
        }
    }

    /**
     * @param User u 
     * @return
     */
    
    public void deleteUser(User u) {
        // TODO implement here
    	Data.getInstance().getUsers().remove(u);
        if (u.getActor().equals("Teacher")) {
        	Teacher t = (Teacher) u;
        	Data.getInstance().getTeachers().remove(t);
        }
        if (u.getActor().equals("Admin")) {
        	Admin a = (Admin) u;
        	Data.getInstance().getAdmins().remove(a);
        }
        if (u.getActor().equals("TechSupportGuy")) {
        	TechSupportGuy t = (TechSupportGuy) u;
        	Data.getInstance().getTechSupportGuys().remove(t);
        }
        if (u.getActor().equals("Manager")) {
        	Manager t = (Manager) u;
        	Data.getInstance().getManagers().remove(t);
        }
        if (u.getActor().equals("Student")) {
        	Student t = (Student) u;
        	Data.getInstance().getStudents().remove(t);
        }
    }

    /**
     * @param User u 
     * @param string newPassword 
     * @return
     */
    public void updatePassword( User u,  String newPassword) {
        // TODO implement here
        u.changePassword(newPassword);
    }

    /**
     * @param User u 
     * @return
     */
    public void viewLogFiles(User u) {
        // TODO implement here
        
    }

    /**
     * @return
     */
    public void viewLogFiles() {
        // TODO implement here
        
    }

    /**
     * @param User u 
     * @param string newName 
     * @return
     */
    public void updateName( User u,  String name) {
        // TODO implement here
        u.setFirstname(name);
    }

    /**
     * @param User u 
     * @param string newSurname 
     * @return
     */
    public void updateSurname( User u,  String newSurname) {
        // TODO implement here
    	u.setLastname(newSurname);
        
    }
	@Override
	public String getActor() {
		// TODO Auto-generated method stub
		return "Admin";
	}

}
