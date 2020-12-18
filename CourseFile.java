package intranet;

public class CourseFile {
	//Constructors
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
    
    
    //Getters and setters
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







}
