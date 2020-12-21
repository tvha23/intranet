package intranet;

import java.util.Date; 
import java.io.*;

public class Order implements Serializable{   
	
    private Date date; 
    private String message; 
    private String theme; 
    private STATUS status; 
 
    public Order() { 
	     date = new Date();
	     message = "news";
	     theme = "seminar";
	     status = STATUS.NEW;
    } 
    
    public Order(Date date, String message, String theme) {
	     this.date = date;
	     this.message = message;
	     this.theme = theme;
	     status = STATUS.NEW;
    }
    
    public void changeStatus(STATUS status) {
    	this.status = status;
    }
    
    public STATUS getStatus() {
    	return status;
    }

	 @Override
	 public int hashCode() {
		  final int prime = 31;
		  int result = 1;
		  result = prime * result + ((date == null) ? 0 : date.hashCode());
		  result = prime * result + ((message == null) ? 0 : message.hashCode());
		  result = prime * result + ((theme == null) ? 0 : theme.hashCode());
		  return result;
	 }

	 @Override
	 public boolean equals(Object obj) {
		  if (this == obj)
			  return true;
		  if (obj == null)
			  return false;
		  if (getClass() != obj.getClass())
			  return false;
		  Order other = (Order) obj;
		  if (date == null) {
			  if (other.date != null)
				  return false;
		  } else if (!date.equals(other.date))
			  return false;
		  if (message == null) {
			  if (other.message != null)
		    return false;
		  } else if (!message.equals(other.message))
			  return false;
		  if (theme == null) {
			  if (other.theme != null)
				  return false;
		  } else if (!theme.equals(other.theme))
			  return false;
		  return true;
	 }

	 @Override
	 public String toString() {
		 return "Order [date=" + date + ", message=" + message + ", theme=" + theme + ", status=" + status + "]";
	 }
}
