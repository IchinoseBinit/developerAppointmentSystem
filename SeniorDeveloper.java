
/**
 * This is a class Senior Developer which inherits the Developer class.
 * It has the get methods for every attributes and two set method for salary and contract period.
 * It also has a hire developer method which appoints the developer and a contract termination method.
 * It also has a print method that displays the platform, interviewer name and advance salary.
 * The platform and interviewer name are displayed by calling the get method while advance salary by calling the variable of the same class.
 * It also has a display method which displays the details of the developer class and then the other details of the senior developer class.
 * 
 * @author (Binit Koirala)
 * @ID Number (18028891)
 */
public class SeniorDeveloper extends Developer
{   
    // These are the attributes of the senior developer class.
    private int salary;
    private String joiningDate;
    private String staffRoomNumber;
    private double contractPeriod;
    private double advanceSalary;
    private boolean appointed;
    private boolean terminated;
    
    /**
     * The following is the constructor of this class.
     * It is used to pass the parameter platform, interviewer name and working hours to the super class constructor.
     * The parameters are passed to the super class constructor by calling or invoking them using 'super' keyword.
     * It accepts other parameters and updates the variables of this class using 'this' keyword.
     * The other variables are manually updated using empty string or 0.0 and booleans are initialized to false.
     */
    public SeniorDeveloper(String platform, String interviewerName, double workingHours, int salary, double contractPeriod)
    {
        super(platform, interviewerName, workingHours);
        this.salary=salary;
        this.contractPeriod=contractPeriod;
        joiningDate="";
        staffRoomNumber="";
        advanceSalary=0.0;
        appointed = false;
        terminated = false;
    }
    
    /**
     * This is a get method of the variable salary.
     * It returns the value of salary if the get method is called in other classes or subclasses.
     * It returns the value of same datatype i.e. integer.
     */
    public int getSalary()
    {
        return salary;
    }
    
    /**
     * This is a get method of the variable joiningDate.
     * It returns the value of joiningDate if the get method is called in other classes or subclasses.
     * It returns the value of same datatype i.e. string.
     */
    public String getJoiningDate()
    {
        return joiningDate;
    }
    
    /**
     * This is a get method of the variable staffRoomNumber.
     * It returns the value of staffRoomNumber if the get method is called in other classes or subclasses.
     * It returns the value of same datatype i.e. string.
     */
    public String getStaffRoomNumber()
    {
        return staffRoomNumber;
    }
    
    /**
     * This is a get method of the variable contractPeriod.
     * It returns the value of contractPeriod if the get method is called in other classes or subclasses.
     * It returns the value of same datatype i.e. string.
     */
    public double getContractPeriod()
    {
        return contractPeriod;
    }
    
    /**
     * This is a get method of the variable advanceSalary.
     * It returns the value of advanceSalary if the get method is called in other classes or subclasses.
     * It returns the value of same datatype i.e. double.
     */
    public double getAdvanceSalary()
    {
        return advanceSalary;
    }
    
    /**
     * This is a get method of the variable appointed.
     * It returns the value of appointed if the get method is called in other classes or subclasses.
     * It returns the value of same datatype i.e. boolean.
     */
    public boolean getAppointed()
    {
        return appointed;
    }
    
    /**
     * This is a get method of the variable terminated.
     * It returns the value of terminated if the get method is called in other classes or subclasses.
     * It returns the value of same datatype i.e. boolean.
     */
    public boolean getTerminated()
    {
        return terminated;
    }
    
    /**
     * These is the set method to set salary.
     * It is made as the variables are declared as private and cannot be accessed in other classes.
     * So, the set method is called in the other classes or subclasses to update the instance variable, salary as the parameter in the method. 
     */
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    
    /**
     * These is the set method to set contract period.
     * It is made as the variables are declared as private and cannot be accessed in other classes.
     * So, the set method is called in the other classes or subclasses to update the instance variable, contract period as the parameter in the method. 
     */
    public void setContractPeriod(double contractPeriod)
    {
        this.contractPeriod=contractPeriod;
    }
    
    /**
     * This is a method to hire developer.
     * This method takes parameters and passes the parameter developerName to the parent class.
     * It sets the developer name using set method of developer name. 
     * The other parameters are passed to the variables of the same class using 'this' keyword.
     * If the developer name is set using set method, the boolean appointed value gets true.
     * If the program is again invoked, it checks the first condition and shows the developer name and staff room number.
     */
    public void hireDeveloper(String developerName, String joiningDate, double advanceSalary, String staffRoomNumber)
    {
         if (appointed==true) 
         { 
             //If the appointed is true i.e. developer name is already initialized to a name in the parent class, it displays this message. 
             System.out.printf("\nThe developer name is :- %s and the room number is :- %s. \n",super.getDeveloperName(),staffRoomNumber);
         }
         else 
         { 
             //If the developer name is not initialized to a name in the parent class variable.
             //The parameters passed in the hireDeveloper methods are assigned in the variables of same class and parent class.
             //For assigning the parent class variable developerName, set method is used and the parameter is passed.
             // Similarly, other parameters are assigned to the same variables of the class.
             super.setDeveloperName(developerName);
             this.joiningDate=joiningDate;
             this.advanceSalary=advanceSalary;
             this.staffRoomNumber=staffRoomNumber;
             appointed = true;
             terminated = false;
         }
    }
    
    /**
     * This is a method to terminate the contract of a developer.
     * For terminating the contract, the program first checks the terminated boolean. 
     * If the terminated boolean is true, it shows a suitable message.
     * If the terminated boolean is false, the method to set the developer name is called from the parent class to set the developerName variable to an empty string.
     * Similarly, the joining date, advance salary are initialized to an empty string and 0.0 respectively.
     * The booleans appointed is assigned false and terminated is assigned true.
     */
    public void developerContractTermination()
    {
        if (terminated==true) 
        {
            //This checks the terminated boolean and if it is false, the message is shown.
            System.out.printf("The contract has been terminated. \n");
        }
        else 
        {
            super.setDeveloperName("");
            joiningDate = "";
            advanceSalary = 0.0;
            appointed = false;
            terminated = true;
        }
    }
    
    /**
     * This is a print method .
     * This method prints the platform and interviewer name using get method.
     * Using 'super' keyword and calling the get method of platform and interviewer name, they are printed.
     * The salary is printed by calling the variable name.
     */
    public void print() 
    {
        System.out.printf("The platform is %s. \nThe interviewer name is :- %s. \n",super.getPlatform(),super.getInterviewerName());
        //System.out.printf(""+super.getInterviewerName() +".");
        System.out.printf("The salary is :- Rs. %d. \n",advanceSalary);
    }
    
    /**
     * This is a method of the Senior Developer class to display or show the output.
     * This method prints the developer class display method first.
     * The display method of the developer class is called through 'super' keyword.
     * Similarly, if the boolean appointed is true, the other messages are displayed in an annotated way.
     */
    public void display()
    {
        super.display();
        if (appointed==true)
        {
            //If the developer is appointed, the boolean value of appointed is changed to true and these messages are to be displayed.
            System.out.printf("\nThe developer is appointed. \n");
            System.out.printf("Details of the Senior Developer :-\n");
            System.out.printf("The termination status is :- %s. \nThe joined date is :- %s. \n",terminated,joiningDate);
            System.out.printf("The advance salary is :- Rs. %.2f. \n",advanceSalary);  
            
        }
        else
        {
           System.out.printf("\n The developer is not appointed yet. \n");
        }
    }
}
