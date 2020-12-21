package intranet;

public abstract class Employee extends User {

    /**
     * Default constructor
     */
	
	public Employee() {}
	  
	public Employee(String id, String password) {
		super(id,password);
	}
	  
	public Employee(String id, String password, String firstname, String lastname) {
		super(id,password,firstname,lastname);
	}
    /**
     * @param String message
     */
    public void sendOrder( Order o) {
        Data.getInstance().getOrders().add(o); 
    }

}