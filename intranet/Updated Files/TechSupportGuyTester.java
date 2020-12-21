package Progect;
import java.io.IOException; 

public class TechSupportGuyTester{ 
	 public static void menu(TechSupportGuy tech) throws IOException { 
	  // TODO Auto-generated method stub  
		 actions(tech); 
		 Data.getInstance().save();
	 }
	  public static void actions(TechSupportGuy tech) throws IOException(){
		  System.out.println("Please choose your action:"); 
		  System.out.println("Press 1 to view new orders/n" + "Press 2 to view orders/n"
        + "Press 3 to accept orders/n" + "Press 4 to reject orders/n"
        +"Press 420 to get out");
		  String action = Tester.reader.readLine();
		    switch(action) { 
			    case("420"):
			    	System.out.println("BLABLA");
			    	break;
			    case("1"):
			    	tech.newOrders();
			    	break;
			    case("2"): 
			    	tech.viewOrders();
			    	break;
			    case("3"):
			    	tech.acceptOrder();
			    	break;
			    case("4"):
			    	tech.rejectOrder(o);
			    	System.out.println("Orders are rejected");
			    	break;
			    default: System.out.println("Wrong action");
		    
		    }
	  }
}
