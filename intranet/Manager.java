package intranet;

import java.util.*;

/**
 * 
 */
public class Manager extends Employee implements Cloneable {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~Constructors~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /**
     * Default constructor
     */
    public Manager() {
    }

    public Manager(String name, String surname) {
        super(name, surname);
    }

    public Manager(String id, String password, String name, String surname) {
        super(id, password, name, surname);
    }


    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~Fields~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /**
     * 
     */
    private Vector<Course> courses;

    /**
     * 
     */
    private Vector<Teacher> teachers;

    /**
     * 
     */
    private String department;

    /**
     * @param Course c
     * @return
     */

    static Data data = Data.getInstance();


    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~Methods~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void addCourseForReg(Course c) {
        data.getCourses().add(c);// ****ASK THIS METHOD****
    }

    /**
     * @param Teacher t
     * @param String  message
     * @return
     */
    public void sendMessage(Teacher t, String message) {
        // ****SEND MESSAGE TO WHOO???****
        // ****Singleton***
        t.getMessages().add(message);// gotta create getMessages method
    }

    /**
     * @return
     */
    public void viewInfoAboutTeachers() {
        // ****WHAT KIND OF INFO?****
        // vector.toSting?
        // create method in Teacher the call it
        System.out.println("Numbers of teachers:" + data.getTeachers().size() + ". Teachers:");
        for (Teacher t : data.getTeachers()) {
            int i = 1;
            System.out.println(i + ") " + t.toString());
            i++;
        }
    }

    /**
     * @return
     */
    public void viewInfoAboutStudents() {
        // ****WHAT KIND OF INFO?****
        System.out.println("Numbers of students:" + data.getStudents().size() + ". Students:");
        for (Student s : data.getStudents()) {
            int i = 1;
            System.out.println(i + ") " + s.toString());
            i++;
        }
    }

    public static Vector<Course> getCourseBySpecialty(String specialty) {
        Vector<Course> coursesBySpecialty = new Vector<Course>();
        for (Course c : data.getCourses()) {
            if (c.getSpecialty().equals(specialty))// gotta add getSpecialty
            {
                coursesBySpecialty.add(c);
            }
        }
        return coursesBySpecialty;
    }


    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~Equals, Hashcode~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        User other = (User) o;
        return other.getid().equals(this.id);// how to get superclass' id?
    }

    public int hashCode() {
        return this.hashCode();
    }


    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~compareTo~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    @Override
    public int compareTo(Manager m) {
        return super.compareTo(m);// compareTo of User
    }

    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~clone~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @SuppressWarnings("unchecked")
    public Manager clone() throws CloneNotSupportedException {
        Manager manager = (Manager) super.clone();
        manager.courses = (Vector<Course>) this.courses.clone();
        manager.teachers = (Vector<Teacher>) this.teachers.clone();
        return manager;
    }


    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~toString~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public String toString() {
        return super.toString() + " Department: " + this.department + ".";
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~getters and setters~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public String getFirstName()
    {
        return super.firstname;
    }

    public String getLastName()
    {
        return super.lastname;
    }

    public String getFullName()
    {
        return super.getName();
    }

    public String getId()
    {
        return super.getId();
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

}