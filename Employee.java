package intranet;

public class Employee extends User implements Comparable<Employee> {
	//Constructors
    /**
     * Default constructor
     */
    public Employee() {
    }

    public Employee(String name, String surname)
    {
        super(name, surname);
    }
    public Employee(String id, String password, String name, String surname)
    {
        super(id, password, name, surname);
    }
    
    /**
     * @param Order o
     */
    public void sendOrder( Order o) {
        TechSupportGuy.addOrder(o);//gotta implement addOrder to TechGuy
    }
    
    //Overriding equals method
    public boolean equals(Object o)
    {
    	return super.equals(o);
    }
    
    //Getters and Setters
    public String getName()
    {
    	return super.getName();
    }
    
    public String getId()
    {
    	return super.getid();
    }
    
    public void setId(String id) {
  	  super.setId(id);
  	 }
    
  	 public void setPassword(String password) throws TooShortPasswordException {
  	  super.setPassword(password);
  	 }
  	 
  	 public void setFirstname(String firstname) {
  	  super.setFirstname(firstname);
  	 }
  	 
  	 public void setLastname(String lastname) {
  	  super.setLastname(lastname);
  	 }
	public int compareTo(Manager m) {
		return super.compareTo(m);
	}
	
	
	public String toString()
	{
		return super.toString();
	}
    
}