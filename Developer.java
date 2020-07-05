
/**
 * This is a developer class which have four attributes for the program.
 * It might be workful in a technical field organization which keeps the record of their empolyees.
 * It has the get methods for every attributes and one set method for developer name.
 * It also has a display method which displays the details of the developer class.
 * The developer class is inherited by other subclasses and its get method and set method is used by other classes.
 * The display method is also called in subclasses to display the details of the developer class.
 *
 * @author (Binit Koirala)
 * @ID (18028891)
 */
public class Developer
{
    // These are the attributes of the developer class.
    private String platform;
    private String interviewerName;
    private String developerName;
    private double workingHours;
   
    /**
     * The following is the constructor of this class.
     * It accepts three parameters and updates the variables using 'this' keyword.
     * The developer name is assigned an empty string.
     */
    public Developer(String platform, String interviewerName, double workingHours )
    {
        this.platform=platform;
        this.interviewerName=interviewerName;
        this.workingHours=workingHours;
        this.developerName="";
    }
   
    /**
    * This is a get method of the variable platform.
    * It returns the value of platform if the get method is called in other classes or subclasses.
    * It returns the value of same datatype i.e. string.
    */
    public String getPlatform()
    {
        return platform;
    }
    
    /**
    * This is a get method of the variable interviewerName.
    * It returns the value of interviewerName if the get method is called in other classes or subclasses.
    * It returns the value of same datatype i.e. string.
    */
    public String getInterviewerName()
    {
        return interviewerName;
    }        
    
    /**
    * This is a get method of the variable developerName.
    * It returns the value of developerName if the get method is called in other classes or subclasses.
    * It returns the value of same datatype i.e. string.
    */
    public String getDeveloperName()
    {
        return developerName;
    }  
    
    /**
    * This is a get method of the variable workingHours.
    * It returns the value of workingHours if the get method is called in other classes or subclasses.
    * It returns the value of same datatype i.e. double.
    */
    public double getWorkingHours()
    {
        return workingHours;
    }
    
    /**
     * This is a set method to set the developer name.
     * It is made as the variables are declared as private and cannot be accessed in other classes.
     * So, the set method is called in the other classes or subclasses to update the instance variable, developer name as the parameter in the method. 
     */
    public void setDeveloperName(String developerName)
    {
        this.developerName=developerName;
    }
    
    /**
     * This is a method of the Developer class to display or show the output.
     * The messages are displayed by calling the variables names of the class.
     * Similarly, if the developer name is not an empty string, the developer name is also displyed.
     * This display method is also called in the other subclasses using 'super keyword'.
     */
    public void display()
    {
        System.out.printf("\nThe platform is :- %s. \nThe interviewer name is :- %s. \n",platform, interviewerName);
        if(!developerName.equals(""))
        {
            //The developer name is assigned to a name after the set method is called in the other classes/subclasses.
            //And so for displaying the name assigned from subclasses, this condition is used.
            System.out.printf("The developer name is :- %s. \n",developerName);
        }        
        System.out.printf("The working hours is :- %.2f hours. \n",workingHours);        
    }
}