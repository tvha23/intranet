package intranet;

public abstract class Employee extends User  {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~Constructors~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /**
     * Default constructor
     */
    public Employee() {
    }

    public Employee(String name, String surname) {
        super(name, surname);
    }

    public Employee(String id, String password, String name, String surname) {
        super(id, password, name, surname);
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~Methods~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /**
     * @param Order o
     */
    public void sendOrder(Order o) {
        TechSupportGuy.addOrder(o);// gotta implement addOrder to TechGuy
    }
    
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~compareTo~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public int compareTo(Manager m) {
        return super.compareTo(m);
    }


    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~clone~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public Employee clone() throws CloneNotSupportedException {
        return (Employee)super.clone();
    }



    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~toString~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public String toString() {
        return super.toString();
    }

}