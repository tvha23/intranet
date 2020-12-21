package intranet;

import java.io.Serializable;

public abstract class Employee extends User implements Serializable  {
    /**
     *
     */
    private static final long serialVersionUID = -4914519828243548480L;

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
    

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~clone~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public Employee clone() throws CloneNotSupportedException {
        return (Employee)super.clone();
    }

}