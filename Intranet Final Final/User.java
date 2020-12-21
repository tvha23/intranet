package intranet;

import java.io.Serializable;

//import java.util.*;

/**
 * 
 */
public abstract class User implements Comparable<User>, Serializable {
	String id;
	String password;
	String firstname;
	String lastname;
	//static String actor;
	  
	public User() {
	}
	  
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}
	  
	public User(String id, String password, String firstname, String lastname) {
		this(id,password);
		this.firstname = firstname;
		this.lastname = lastname;
	}
	 
	 
	public String getPassword() {
		return this.password;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPassword(String password) {
	    this.password = password;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname) {
	    this.lastname = lastname;
	}
	
	public String getName() {
	    return firstname + " " + lastname;
	}
	
	public String getId() {
		return id;
	}
	  
	void changePassword(String newPassword) {
	    this.password = newPassword; 
	}
	
	void loggedSuccessfully(String id, String password) {
	    if (this.id.equals(id) && this.password.equals(password)) {
	    	System.out.println("Logged Succesfuly");
	    }
	    else if(!this.id.equals(id) && !this.password.equals(password)) {
	    	System.out.println(" Not logged Succesfuly");
	    }
	}
	 
	 @Override
	 public boolean equals(Object obj) {
		 if (this == obj)
			 return true;
		 if (obj == null)
			 return false;
		 if (!this.getClass().getName().equals(obj.getClass().getName())) 
			 return false;
		 User other = (User) obj;
		 return this.id == other.id;
	 }
	 
//	  @Override 
//	 public User clone(){ 
//	   User u = new User(); 
//	   u.id = this.id;
//	      u.password = this.password ;
//	      u.firstname = this.firstname;
//	      u.lastname = this.lastname;
//	       return u ;
//	 }
	  
	  @Override
	  public int compareTo(User o) {
		  if (o.getClass().getName().equals(this.getClass().getName())){
			  User u = (User) o;
			  return this.getName().compareTo(u.getName());
	    }
	    return 0;
	   }
	  
	  public String toString() {
		  return this.getActor() + " (login: " + this.id+", password: "+this.password+") Name: "+this.lastname+" Surname: "+this.firstname;
	  }
	  
	  public abstract String getActor();
	}