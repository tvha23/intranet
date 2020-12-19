package intranet;

public class CourseFile {
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~Constructors~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /**
     * Default constructor
     */
    public CourseFile() {};
    public CourseFile(String name, String fileType)
    {
    	this.name=name;
    	this.fileType=fileType;
    }
    
    public CourseFile(String name, String fileType, Teacher teacher)
    {
    	this(name, fileType);
    	this.teacher=teacher;
    }
    

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~Fields~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Teacher teacher;

    /**
     * 
     */
    private String fileType;
    
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~equals, hashcode~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        CourseFile other = (CourseFile) o;
        return other.getCourseFileName().equals(this.getCourseFileName()) 
            && other.getCourseFileType().equals(this.getCourseFileType())
            && other.getCourseFileTeacher().equals(this.getCourseFileTeacher()); 
    }

    public int hashCode() {
        return this.hashCode();
    }


    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~clone~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public CourseFile clone() throws CloneNotSupportedException {
        CourseFile c = new CourseFile();
        c.fileType=this.fileType;
        c.name=this.name;
        c.teacher=this.teacher;
        return c;
    }

    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~Getters and setters~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public String getCourseFileName()
    {
    	return this.name;
    }
    
    public String getCourseFileType()
    {
    	return this.fileType;
    }
    
    public String getFullCourseFileName()
    {
    	return getCourseFileName()+"."+getCourseFileType();
    }
    
    public Teacher getCourseFileTeacher()
    {
    	return this.teacher;
    }
    

    public void setTeacher(Teacher teacher)
    {
    	this.teacher=teacher;
    }

    public void setCourseFileName(String name)
    {
    	this.name=name;
    }
    
    public void setCourseFileType(String fileType)
    {
        this.fileType=fileType;
    }


    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~toString~~~~~~~~~~~~~~~~~~~~~~~~~~~~    
    public String toString()
    {
        return "File name: " + this.getFullCourseFileName()+" . Teacher:"+this.getCourseFileTeacher().toString();
    }





}
