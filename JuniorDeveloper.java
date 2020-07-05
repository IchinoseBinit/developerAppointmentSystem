
/**
 * This is a class Junior Developer which inherits the Developer class.
 * It has the get methods for every attributes and a set method for salary.
 * It also has a appoint developer method which appoints the developer.
 * It also has a display method which displays the details of the developer class and then the other details of the junior developer class.
 * 
 * @author (Binit Koirala)
 * @ID Number (18028891)
 */
public class JuniorDeveloper extends Developer
{
    // These are the attributes of the junior developer class.
   private int salary;
   private String appointedDate;
   private String evaluationPeriod;
   private String terminationDate;
   private String specialization;
   private String appointedBy;
   private boolean joined;
   
   /**
    * The following is the constructor of this class.
    * It is used to pass the parameter platform, interviewer name and working hours to the super class constructor.
    * The parameters are passed to the super class constructor by calling or invoking them using 'super' keyword.
    * It accepts other parameters and updates the variables of this class using 'this' keyword.
    * The other variables are manually updated using empty string or 0.0 and boolean is initialized to false.
    */
   public JuniorDeveloper(String platform, String interviewerName, double workingHours, int salary, String appointedBy, String terminationDate)
   {
       super(platform, interviewerName, workingHours);
       this.salary=salary;
       this.appointedBy=appointedBy;
       this.terminationDate=terminationDate;
       appointedDate="";
       evaluationPeriod="";
       specialization="";
       joined = false;
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
    * This is a get method of the variable appointedDate.
    * It returns the value of appointedDate if the get method is called in other classes or subclasses.
    * It returns the value of same datatype i.e. string.
    */
   public String getAppointedDate()
   {
       return appointedDate;
   }
   
   /**
    * This is a get method of the variable evaluationPeriod.
    * It returns the value of evaluationPeriod if the get method is called in other classes or subclasses.
    * It returns the value of same datatype i.e. string.
    */
   public String getEvaluationPeriod()
   {
       return evaluationPeriod;
   }
   
   /**
    * This is a get method of the variable terminationDate.
    * It returns the value of terminationDate if the get method is called in other classes or subclasses.
    * It returns the value of same datatype i.e. string.
    */
   public String getTerminationDate()
   {
       return terminationDate;
   }
   
   /**
    * This is a get method of the variable specialization.
    * It returns the value of specialization if the get method is called in other classes or subclasses.
    * It returns the value of same datatype i.e. string.
    */
   public String getSpecialization()
   {
       return specialization;
   }
   
   /**
    * This is a get method of the variable appointedBy.
    * It returns the value of appointedBy if the get method is called in other classes or subclasses.
    * It returns the value of same datatype i.e. string.
    */
   public String getAppointedBy()
   {
       return appointedBy;
   }
   
   /**
    * This is a get method of the variable joined.
    * It returns the value of joined if the get method is called in other classes or subclasses.
    * It returns the value of same datatype i.e. boolean.
    */
   public boolean getJoined()
   {
       return joined;
   }
   
    /**
     * This is a set method to set salary.
     * It is made as the variables are declared as private and cannot be accessed in other classes.
     * So, the set method is called in the other classes or subclasses to update the instance varibale, salary as the parameter in the method. 
     * If the joined status is false, the method takes the parameter and updates the salary variables.
     * IF the joined status is true, the message developer name is already appointed is given.
     */
   public void setSalary(int salary)
   {
       if (joined==false) 
       {
           this.salary=salary;
       }
       else
       {
           System.out.printf("The %s is already appointed, so the salary cannot be changed. \n",super.getDeveloperName()); 
       }
   }
   
   /**
     * This is a method to appoint developer.
     * This method takes parameters and passes the parameter developerName to the parent class.
     * It sets the developer name using set method of developer name. 
     * The other parameters are passed to the variables of the same class using 'this' keyword.
     * If the developer name is set using set method, the boolean joined value gets true.
     * If the program is again invoked, it checks the second condition and shows the developer name and appointed date.
     */
   public void appointDeveloper(String developerName, String appointedDate, String terminationDate, String specialization)
   {
       if(joined==false) 
       {
          //If the developer name is not initialized to a name in the parent class variable i.e. joined is false.
          //The parameters passed in the appointDeveloper methods are assigned in the variables of same class and parent class.
          //For assigning the parent class variable developerName, set method is used and the parameter is passed.
          // Similarly, other parameters are assigned to the same variables of the class.
          super.setDeveloperName(developerName);
          joined = true;
          this.appointedDate=appointedDate;
          this.terminationDate=terminationDate;
          this.specialization=specialization;
       }
       else
       {
           System.out.printf("The %s is already appointed at this date :- %s. \n",super.getDeveloperName(),appointedDate);
       }
       
   }
   
   /**
     * This is a method of the Junior Developer class to display or show the output.
     * This method prints the developer class display method first.
     * The display method of the developer class is called through 'super' keyword.
     * Similarly, if the boolean joined is true, the other messages are displayed in an annotated way.
     */
   public void display()
   {
       super.display();
       if (joined==true) 
       {
           //If the developer is appointed, the boolean value of joined is changed to true and these messages are to be displayed.
           System.out.printf("\nThe developer is appointed. \n");
           System.out.printf("Details of the Junior Developer :-\n");
           System.out.printf("The appointed date is :- %s. \n",appointedDate);
           System.out.printf("The evaluation period is :- %s. \n",evaluationPeriod);
           System.out.printf("The termination date is :- %s. \n",terminationDate);
           System.out.printf("The salary is :- Rs.%d. \n",salary);
           System.out.printf("The specialization of the developer is :- %s. \n",specialization);
           System.out.printf("The person who appointed the developer is :- %s. \n",appointedBy);
       }
       else
       {
           System.out.printf("\n The developer is not appointed yet. \n");
       }
   }
}
