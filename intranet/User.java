package intranet;

import java.util.*;

/**
 * 
 */
public class User implements Comparable<User> {
	  String id;
	  String password;
	  String firstname;
	  String lastname;
	  
	  public User() {
	   
	  }
	  public User(String id, String password, String firstname, String lastname) {
	  
	  this(id,password);
	  this.firstname = firstname;
	  this.lastname = lastname;
	 }
	 
	 public User(String id, String password) {
	  this.id = id;
	  this.password = password;
	 }
	 
	 public void setId(String id) {
	  this.id = id;
	 }
	 public void setPassword(String password)  {
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
	 public String getid() {
	  return id;
	 }
	  void ChangePassword(String newPassword) throws TooShortPasswordException {
	   this.password = newPassword; 
	  }
	  void loggedSuccessfully(String id, String password) {
	   
	   if (this.id.equals(id) && this.password.equals(password)) {
	     System.out.println("logged Succesfuly");
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
	  return this.id==other.id;
	 }
	  @Override
	  
	     public User clone() throws CloneNotSupportedException{ 
	   User u = new User(); 
	   u.id = this.id ;
	      u.password = this.password ;
	      u.firstname = this.firstname;
	      u.lastname = this.lastname;
	       return u ;
	 }
	  
	  @Override
	  public int compareTo(User o) {
	    if (o.getClass().getName().equals(this.getClass().getName())){
	     User u = (User) o;
	     return this.getName().compareTo(u.getName());
	    }
	    
	    // TODO Auto-generated method stub
	    return 0;
	   }

	  
	}