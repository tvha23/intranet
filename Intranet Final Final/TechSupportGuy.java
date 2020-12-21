package intranet;

import java.io.Serializable;


public class TechSupportGuy extends User implements Serializable{
	//private Vector<Order> orders;
	static String actor = "TechSupportGuy"; 
 
	public TechSupportGuy() {
	}
	  
	public TechSupportGuy(String id, String password) {
		super(id,password);
	}
	  
	public TechSupportGuy(String id, String password, String firstname, String lastname) {
		super(id,password,firstname,lastname);
	}

    public void viewNewOrders() {
        for (int i = 0; i < Data.getInstance().getOrders().size(); i++) {
         if (Data.getInstance().getOrders().get(i).getStatus() == STATUS.NEW) {
        	 System.out.println(Data.getInstance().getOrders().get(i) + "\n");
        	
         	}
        }
    }

    /**
     * @return
     */
    public void viewOrders() {
     for (Order or : Data.getInstance().getOrders()) {
      System.out.print(or + "\n");
     }
        
    }

    /**
     * @param Order o 
     * @return
     */
    public void acceptOrder( Order o) {
        o.changeStatus(STATUS.ACTIVE);
        
        
    }

    public void rejectOrder( Order o) {
        o.changeStatus(STATUS.REJECTED);
    }

	@Override
	public String getActor() {
		// TODO Auto-generated method stub
		return "TechSupportGuy";
	}

}