/**
 * This is the RigoTechnology class which imports different libraries to create Graphical User Interface.
 * The swing, util, awt packages are imported in the Rigo Technology class.
 * The class RigoTechnology implements ActionListener class to execute certain methods while the buttons are pressed.
 * The actionPerformed method is overrided with the object of the class ActionEvent as its parameter.
 * There are various other methods as well which perform certain tasks like terminating the contract or appointing them.
 * 
 * @author (Binit Koirala)
 * @ID Number (18028891)
*/
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;

public class RigoTechnology implements ActionListener
{
    //These are the attributes of the RigoTechnology class.
    private JFrame frame;
    private JLabel lblWelcome;
    private JLabel lblGoToSD;
    private JLabel lblGoToJD;
    private JLabel lblWelcomeSD;
    private JLabel lblWelcomeJD;
    private JLabel lblAppointSD;
    private JLabel lblAppointJD;
    private JLabel lblSDPlatform;
    private JLabel lblJDPlatform;
    private JLabel lblSDInterviewerName;
    private JLabel lblJDInterviewerName;
    private JLabel lblSeniorDeveloperName;
    private JLabel lblJuniorDeveloperName;
    private JLabel lblSDWorkingHours;
    private JLabel lblJDWorkingHours;
    private JLabel lblSDSalary;
    private JLabel lblJDSalary;
    private JLabel lblJoiningDate;
    private JLabel lblStaffRoomNumber;
    private JLabel lblContractPeriod;
    private JLabel lblAdvanceSalary;
    private JLabel lblAppointedDate;
    private JLabel lblAddTerminationDate;
    private JLabel lblAppointTerminationDate;
    private JLabel lblSpecialization;
    private JLabel lblAppointedBy;
    private JLabel lblEvaluationPeriod;
    private JLabel lblSeniorDeveloperNumber;
    private JLabel lblJuniorDeveloperNumber;
    private JLabel lblBottomSD;
    private JLabel lblBottomJD;
    private JTextField textSDPlatform;
    private JTextField textJDPlatform;
    private JTextField textSDInterviewerName;
    private JTextField textJDInterviewerName;
    private JTextField textSeniorDeveloperName;
    private JTextField textJuniorDeveloperName;
    private JTextField textSDWorkingHours;
    private JTextField textJDWorkingHours;
    private JTextField textSDSalary;
    private JTextField textJDSalary;
    private JTextField textJoiningDate;
    private JTextField textStaffRoomNumber;
    private JTextField textContractPeriod;
    private JTextField textAdvanceSalary;
    private JTextField textAppointedDate;
    private JTextField textAddTerminationDate;
    private JTextField textAppointTerminationDate;
    private JTextField textSpecialization;
    private JTextField textAppointedBy;
    private JTextField textEvaluationPeriod;
    private JTextField textSeniorDeveloperNumber;
    private JTextField textJuniorDeveloperNumber;
    private JButton btnAddJD;
    private JButton btnAddSD;
    private JButton btnAppointSD;
    private JButton btnAppointJD;
    private JButton btnDeveloperContractTermination;
    private JButton btnSDDisplayAll;
    private JButton btnSDClear;
    private JButton btnJDDisplayAll;
    private JButton btnJDClear;
    private String platform;
    private String interviewerName;
    private double workingHours;
    private int salary;
    private double contractPeriod;
    private String appointedBy;
    private String terminationDate;
    private String developerName;
    private String joiningDate;
    private double advanceSalary;
    private String staffRoomNumber;
    private String appointedDate;
    private String specialization;
    private String evaluationPeriod;
    private int developerNumber;
    private ArrayList<Developer> myList;
    private SeniorDeveloper objSD;
    private JuniorDeveloper objJD;
    private JButton btnSeniorDeveloper;
    private JButton btnJuniorDeveloper;
    private JButton btnSDHome; 
    private JButton btnJDHome;
    private JPanel mainPanel;
    private JPanel panelFirst;
    private JPanel panelSD;
    private JPanel panelJD;
    private CardLayout cl;
    
    /**
     * This is the main method of the RigoTechnology class. 
     * The main methods is invoked at the first when the program is used.
     * The method calls the constructor of the RigoTechnology class.
     */
    public static void main(String[] args)
    {
        new RigoTechnology();
    }
    
    /**
     * This is the constructor of the RigoTechnology class. 
     * The constructor calls the GUI method of RigoTechnology class.
     */
    public RigoTechnology()
    {
        GUI();
    }
    
    /**
     * The method GUI is used to create frame, panels, ArrayList, labels and buttons in the first panel.
     * The panels are added in the mainPanel which uses CardLayout while other three panels uses no layout.
     * The background of the panels are changed using the setBackground method.
     * Similarly, this method also calls seniorDeveloperPanel and juniorDeveloperPanel method.
     * The addActionListener method is called by the buttons that are added in this method.
     * The setSize, setResizable and setVisible method is then called with respective parameters.
     */
    public void GUI()
    {
        frame= new JFrame("Appointment System");
        
        mainPanel=new JPanel(); 
        panelFirst=new JPanel(); 
        panelSD=new JPanel();
        panelJD=new JPanel();
        
        cl=new CardLayout();
        mainPanel.setLayout(cl);
        frame.add(mainPanel);
        
        panelFirst.setLayout(null);
        panelSD.setLayout(null);
        panelJD.setLayout(null);
        
        panelFirst.setBackground(new java.awt.Color(102,206,204));
        panelSD.setBackground(new java.awt.Color(102,206,204));
        panelJD.setBackground(new java.awt.Color(102,206,204));
        
        myList= new ArrayList<Developer>();
        
        lblWelcome = new JLabel("Welcome to Developer Appointment System");
        lblWelcome.setFont(new Font("Arial",Font.BOLD,20));
        lblWelcome.setBounds(70,10,480,20);
        panelFirst.add(lblWelcome);
        
        lblGoToSD = new JLabel("Go to Senior Developer Panel");
        lblGoToSD.setFont(new Font("Arial",Font.BOLD,16));
        lblGoToSD.setBounds(170,100,480,20);
        panelFirst.add(lblGoToSD);
        
        btnSeniorDeveloper=new JButton("Senior Developer");
        btnSeniorDeveloper.setFont(new Font("Arial",Font.PLAIN,16));
        btnSeniorDeveloper.setBounds(180,130,180,30);
        panelFirst.add(btnSeniorDeveloper);
        
        lblGoToJD = new JLabel("Go to Junior Developer Panel");
        lblGoToJD.setFont(new Font("Arial",Font.BOLD,16));
        lblGoToJD.setBounds(170,220,480,20);
        panelFirst.add(lblGoToJD);
        
        btnJuniorDeveloper=new JButton("Junior Developer");
        btnJuniorDeveloper.setFont(new Font("Arial",Font.PLAIN,16));
        btnJuniorDeveloper.setBounds(180,250,180,30);
        panelFirst.add(btnJuniorDeveloper);
        
        btnSDHome =new JButton("Home");
        btnSDHome.setBounds(30,450,100,20);
        panelSD.add(btnSDHome);
        
        btnJDHome =new JButton("Home");
        btnJDHome.setBounds(30,490,100,20);
        panelJD.add(btnJDHome);

        btnSeniorDeveloper.addActionListener(this);
        btnJuniorDeveloper.addActionListener(this);
        btnSDHome.addActionListener(this);
        btnJDHome.addActionListener(this);
        
        mainPanel.add(panelFirst,"Welcome");
        mainPanel.add(panelSD,"Senior Developer");
        mainPanel.add(panelJD, "Junior Developer");
        cl.show(mainPanel,"First");
        
        juniorDeveloperPanel();
        seniorDeveloperPanel();
        
        frame.setSize(600,400);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    /**
     * The method juniorDeveloperPanel is used to create labels, text fields and buttons.
     * These labels, text fields and buttons are shown in the Junior Developer panel.
     * The fonts are changed by calling the setFont method.
     * Similarly, the labels, text fields and buttons are placed with setBounds method.
     * The addActionListener method is called by the buttons that are added in this method.
     */
    public void juniorDeveloperPanel()
    {
        lblWelcomeJD= new JLabel("------------------------------------------------------Junior Developer---------------------------------------------------------");
        lblWelcomeJD.setBounds(30,10,1000,20);
        panelJD.add(lblWelcomeJD);
        
        lblJDPlatform= new JLabel("Platform:");
        lblJDPlatform.setBounds(30,50,100,20);
        panelJD.add(lblJDPlatform);
        
        textJDPlatform= new JTextField(30);
        textJDPlatform.setBounds(160,50,360,20);
        panelJD.add(textJDPlatform);
        
        lblJDInterviewerName= new JLabel("Interviewer's Name:");
        lblJDInterviewerName.setBounds(30,90,150,20);
        panelJD.add(lblJDInterviewerName);
        
        textJDInterviewerName= new JTextField(30);
        textJDInterviewerName.setBounds(160,90,360,20);
        panelJD.add(textJDInterviewerName);
        
        lblJDSalary= new JLabel("Salary:");
        lblJDSalary.setBounds(30,130,50,20);
        panelJD.add(lblJDSalary);
        
        textJDSalary= new JTextField(8);
        textJDSalary.setBounds(160,130,120,20);
        panelJD.add(textJDSalary);
        
        lblJDWorkingHours= new JLabel("Working Hours:");
        lblJDWorkingHours.setBounds(290,130,100,20);
        panelJD.add(lblJDWorkingHours);
        
        textJDWorkingHours= new JTextField(8);
        textJDWorkingHours.setBounds(400,130,120,20);
        panelJD.add(textJDWorkingHours);
        
        lblAppointedBy= new JLabel("Appointed By:");
        lblAppointedBy.setBounds(30,170,100,20);
        panelJD.add(lblAppointedBy);
        
        textAppointedBy= new JTextField(8);
        textAppointedBy.setBounds(160,170,120,20);
        panelJD.add(textAppointedBy);
        
        lblAddTerminationDate= new JLabel("Termination Date:");
        lblAddTerminationDate.setBounds(290,170,120,20);
        panelJD.add(lblAddTerminationDate);
        
        textAddTerminationDate= new JTextField(8);
        textAddTerminationDate.setBounds(400,170,120,20);
        panelJD.add(textAddTerminationDate);
        
        btnAddJD= new JButton("Add JD");
        btnAddJD.setBounds(420,210,100,20);
        panelJD.add(btnAddJD);
        
        lblAppointJD= new JLabel("-------------------------------------------------Appoint Junior Developer--------------------------------------------------");
        lblAppointJD.setBounds(30,250,1000,20);
        panelJD.add(lblAppointJD);
        
        lblJuniorDeveloperName= new JLabel("Developer's Name:");
        lblJuniorDeveloperName.setBounds(30,290,150,20);
        panelJD.add(lblJuniorDeveloperName);
        
        textJuniorDeveloperName= new JTextField(30);
        textJuniorDeveloperName.setBounds(160,290,360,20);
        panelJD.add(textJuniorDeveloperName);
        
        lblAppointedDate= new JLabel("Appointed Date:");
        lblAppointedDate.setBounds(30,330,100,20);
        panelJD.add(lblAppointedDate);
        
        textAppointedDate= new JTextField(8);
        textAppointedDate.setBounds(160,330,120,20);
        panelJD.add(textAppointedDate);
        
        lblAppointTerminationDate= new JLabel("Termination Date:");
        lblAppointTerminationDate.setBounds(290,330,120,20);
        panelJD.add(lblAppointTerminationDate);
        
        textAppointTerminationDate= new JTextField(8);
        textAppointTerminationDate.setBounds(400,330,120,20);
        panelJD.add(textAppointTerminationDate);
        
        lblSpecialization= new JLabel("Specialization:");
        lblSpecialization.setBounds(30,370,100,20);
        panelJD.add(lblSpecialization);

        textSpecialization= new JTextField(8);
        textSpecialization.setBounds(160,370,120,20);
        panelJD.add(textSpecialization);
        
        lblEvaluationPeriod= new JLabel("Evaluation Period:");
        lblEvaluationPeriod.setBounds(290,370,120,20);
        panelJD.add(lblEvaluationPeriod);
        
        textEvaluationPeriod= new JTextField(8);
        textEvaluationPeriod.setBounds(400,370,120,20);
        panelJD.add(textEvaluationPeriod);
        
        lblJuniorDeveloperNumber= new JLabel("Developer No:");
        lblJuniorDeveloperNumber.setBounds(30,410,120,20);
        panelJD.add(lblJuniorDeveloperNumber);
        
        textJuniorDeveloperNumber= new JTextField(8);
        textJuniorDeveloperNumber.setBounds(160,410,120,20);
        panelJD.add(textJuniorDeveloperNumber);
        
        btnAppointJD= new JButton("Appoint JD");
        btnAppointJD.setBounds(420,450,100,20);
        panelJD.add(btnAppointJD);
        
        btnJDClear= new JButton("Clear");
        btnJDClear.setBounds(290,490,100,20);
        panelJD.add(btnJDClear);
        
        btnJDDisplayAll= new JButton("Display All");
        btnJDDisplayAll.setBounds(420,490,100,20);
        panelJD.add(btnJDDisplayAll);
        
        lblBottomJD= new JLabel("----------------------------------------------------------------------------------------------------------------------------------------");
        lblBottomJD.setBounds(30,530,1000,20);
        panelJD.add(lblBottomJD);
        
        btnAddJD.addActionListener(this);
        btnAppointJD.addActionListener(this);
        btnJDClear.addActionListener(this);
        btnJDDisplayAll.addActionListener(this);
    }
    
    /**
     * The method SeniorDeveloperPanel is used to create labels, text fields and buttons.
     * These labels, text fields and buttons are shown in the Senior Developer panel.
     * The fonts are changed by calling the setFont method.
     * Similarly, the labels, text fields and buttons are placed with setBounds method.
     * The addActionListener method is called by the buttons that are added in this method.
     */
    public void seniorDeveloperPanel()
    {
        lblWelcomeSD= new JLabel("------------------------------------------------------Senior Developer---------------------------------------------------------");
        lblWelcomeSD.setBounds(30,10,1000,20);
        panelSD.add(lblWelcomeSD);
        
        lblSDPlatform= new JLabel("Platform:");
        lblSDPlatform.setBounds(30,50,100,20);
        panelSD.add(lblSDPlatform);
        
        textSDPlatform= new JTextField(30);
        textSDPlatform.setBounds(160,50,360,20);
        panelSD.add(textSDPlatform);
        
        lblSDInterviewerName= new JLabel("Interviewer's Name:");
        lblSDInterviewerName.setBounds(30,90,150,20);
        panelSD.add(lblSDInterviewerName);
        
        textSDInterviewerName= new JTextField(30);
        textSDInterviewerName.setBounds(160,90,360,20);
        panelSD.add(textSDInterviewerName);
        
        lblSDSalary= new JLabel("Salary:");
        lblSDSalary.setBounds(30,130,50,20);
        panelSD.add(lblSDSalary);
        
        textSDSalary= new JTextField(8);
        textSDSalary.setBounds(160,130,120,20);
        panelSD.add(textSDSalary);
        
        lblSDWorkingHours= new JLabel("Working Hours:");
        lblSDWorkingHours.setBounds(290,130,150,20);
        panelSD.add(lblSDWorkingHours);
        
        textSDWorkingHours= new JTextField(8);
        textSDWorkingHours.setBounds(400,130,120,20);
        panelSD.add(textSDWorkingHours);
        
        lblContractPeriod= new JLabel("Contract Period:");
        lblContractPeriod.setBounds(30,170,100,20);
        panelSD.add(lblContractPeriod);
        
        textContractPeriod= new JTextField(8);
        textContractPeriod.setBounds(160,170,120,20);
        panelSD.add(textContractPeriod);
        
        btnAddSD= new JButton("Add SD");
        btnAddSD.setBounds(420,210,100,20);
        panelSD.add(btnAddSD);
        
        lblAppointSD= new JLabel("-------------------------------------------------Appoint Senior Developer--------------------------------------------------");
        lblAppointSD.setBounds(30,250,1000,20);
        panelSD.add(lblAppointSD);
        
        lblSeniorDeveloperName= new JLabel("Developer's Name:");
        lblSeniorDeveloperName.setBounds(30,290,150,20);
        panelSD.add(lblSeniorDeveloperName);
        
        textSeniorDeveloperName= new JTextField(30);
        textSeniorDeveloperName.setBounds(160,290,360,20);
        panelSD.add(textSeniorDeveloperName);
        
        lblJoiningDate= new JLabel("Joining Date:");
        lblJoiningDate.setBounds(30,330,80,20);
        panelSD.add(lblJoiningDate);
        
        textJoiningDate= new JTextField(8);
        textJoiningDate.setBounds(160,330,120,20);
        panelSD.add(textJoiningDate);
        
        lblAdvanceSalary= new JLabel("Advance Salary:");
        lblAdvanceSalary.setBounds(290,330,120,20);
        panelSD.add(lblAdvanceSalary);
        
        textAdvanceSalary= new JTextField(8);
        textAdvanceSalary.setBounds(400,330,120,20);
        panelSD.add(textAdvanceSalary);
        
        lblStaffRoomNumber= new JLabel("Staff Room No:");
        lblStaffRoomNumber.setBounds(30,370,100,20);
        panelSD.add(lblStaffRoomNumber);
        
        textStaffRoomNumber= new JTextField(8);
        textStaffRoomNumber.setBounds(160,370,120,20);
        panelSD.add(textStaffRoomNumber);
        
        lblSeniorDeveloperNumber= new JLabel("Developer No:");
        lblSeniorDeveloperNumber.setBounds(290,370,120,20);
        panelSD.add(lblSeniorDeveloperNumber);
        
        textSeniorDeveloperNumber= new JTextField(8);
        textSeniorDeveloperNumber.setBounds(400,370,120,20);
        panelSD.add(textSeniorDeveloperNumber);
        
        btnDeveloperContractTermination= new JButton("Terminate");
        btnDeveloperContractTermination.setBounds(290,410,100,20);
        panelSD.add(btnDeveloperContractTermination);
        
        btnAppointSD= new JButton("Appoint SD");
        btnAppointSD.setBounds(420,410,100,20);
        panelSD.add(btnAppointSD);  
                
        btnSDClear= new JButton("Clear");
        btnSDClear.setBounds(290,450,100,20);
        panelSD.add(btnSDClear);
    
        btnSDDisplayAll= new JButton("Display All");
        btnSDDisplayAll.setBounds(420,450,100,20);
        panelSD.add(btnSDDisplayAll);
        
        lblBottomSD= new JLabel("----------------------------------------------------------------------------------------------------------------------------------------");
        lblBottomSD.setBounds(30,490,1000,20);
        panelSD.add(lblBottomSD);
        
        btnAddSD.addActionListener(this);
        btnDeveloperContractTermination.addActionListener(this);
        btnAppointSD.addActionListener(this);
        btnSDClear.addActionListener(this);
        btnSDDisplayAll.addActionListener(this);
    }
    
    /**
     * This is a method of the class ActionListener.
     * It is overridden here to make use of the buttons. 
     * An object of the class ActionEvent is accepted as parameter.
     * The getSource method is called by the object and initialized to a new object source.
     * If the source equals to any of the button object, the respective method is called.
     * Then the task is performed.
     */
    public void actionPerformed(ActionEvent ae)
    { 
        Object source=ae.getSource();
        if(source==btnSeniorDeveloper)
        {   
            cl.show(mainPanel,"Senior Developer");
            frame.setSize(600,600);
        }
        if(source==btnJuniorDeveloper)
        {   
            cl.show(mainPanel,"Junior Developer");
            frame.setSize(600,600);
        }
        if(source==btnSDHome)
        {
            cl.show(mainPanel,"Welcome");
            frame.setSize(600,400);
        }
        if(source==btnJDHome)
        {   
            cl.show(mainPanel,"Welcome");
            frame.setSize(600,400);
        }
        if(source==btnAddSD)
        {
            addSeniorDeveloper();
        }   
        if (source==btnAppointSD)
        {
            appointSeniorDeveloper();
        }
        if (source==btnDeveloperContractTermination)
        {   
            seniorDeveloperContractTermination();
        }
        if (source==btnSDClear)
        {
            clearSeniorDeveloper();
        }
        if(source==btnSDDisplayAll)
        {
            displaySeniorDeveloper();
        }
        if (source==btnAddJD)
        {
            addJuniorDeveloper();
        }
        if (source==btnAppointJD)
        {
            appointJuniorDeveloper();
        }
        if (source==btnJDClear)
        {
            clearJuniorDeveloper();
        }
        if (source== btnJDDisplayAll)
        {
            displayJuniorDeveloper();
        }
    }
    
    /**
     * This is a method to add platform for the Senior Developer.
     * Try and catch blocks are used to catch certain exception and display error message using dialog box.
     * The method accepts the values that are to be passed as argument in constructor.
     * It takes the values from text fields from Senior Developer panel.
     * Object of the class Senior Developer is created and is added to the arrayList.
     */
    public void addSeniorDeveloper()
    {
        try
        {
            platform=textSDPlatform.getText();
            interviewerName=textSDInterviewerName.getText();
            salary=Integer.parseInt(textSDSalary.getText());
            workingHours=Double.parseDouble(textSDWorkingHours.getText());
            contractPeriod=Double.parseDouble(textContractPeriod.getText());  
            objSD= new SeniorDeveloper(platform, interviewerName, workingHours, salary, contractPeriod);
            myList.add(objSD);
            JOptionPane.showMessageDialog(frame,"The platform for Senior Developer is added.","Senior Developer", JOptionPane.INFORMATION_MESSAGE);
            textSDPlatform.setText("");
            textSDInterviewerName.setText("");
            textSDSalary.setText("");
            textSDWorkingHours.setText("");
            textContractPeriod.setText("");
        }
        catch(NumberFormatException exceptionNumFormat)
        {
            JOptionPane.showMessageDialog(frame,"Please Enter a sutiable value.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * This is a method to appoint the Senior Developer.
     * Try and catch blocks are used to catch certain exception and display error message using dialog box.
     * The method accepts the values that are to be passed as argument in the method hireDeveloper.
     * It takes the values from text fields from Senior Developer panel.
     * If Developer Number is less than the size of array list and greater than or equal to zero.
     * Object of the class Developer is casted as Senior Developer.
     * Object calls getAppointed method and if the value received is false, hireDeveloper method is called.
     * If the value received from getAppointed method is true, a dialog box is shown with a message.
     * if the user inputs an invalid value in the developerNumber, a dialog box is shown with an message.
     */
    public void appointSeniorDeveloper()
    {
        try
        {
            developerName=textSeniorDeveloperName.getText();
            joiningDate=textJoiningDate.getText();
            advanceSalary=Double.parseDouble(textAdvanceSalary.getText());
            staffRoomNumber=textStaffRoomNumber.getText();
            developerNumber=Integer.parseInt(textSeniorDeveloperNumber.getText());
            if(developerNumber<myList.size() && developerNumber>=0)//To check whether the number is in ArrayList index or not.
            {
                SeniorDeveloper castedObjSD=(SeniorDeveloper)myList.get(developerNumber);//To use the method of Senior Developer class.
                if(castedObjSD.getAppointed()==false)//To check whether the developer is appointed or not.
                {
                    castedObjSD.hireDeveloper(developerName, joiningDate, advanceSalary, staffRoomNumber);
                    JOptionPane.showMessageDialog(frame,"The Senior Developer is appointed.","Sucessful", JOptionPane.INFORMATION_MESSAGE);
                    textSeniorDeveloperName.setText("");
                    textJoiningDate.setText("");
                    textAdvanceSalary.setText("");
                    textStaffRoomNumber.setText("");
                    textSeniorDeveloperNumber.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,"The Senior Developer is already appointed.","Error", JOptionPane.ERROR_MESSAGE); 
                }
            }
            else
            {
                textSeniorDeveloperNumber.setForeground(Color.red);
                JOptionPane.showMessageDialog(frame,"Please Enter a suitable value in Developer Number.","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException exceptionNumFormat)
        {
            JOptionPane.showMessageDialog(frame,"Please Enter a suitable value.","Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(ClassCastException exceptionClassCast)
        {
            JOptionPane.showMessageDialog(frame,"Please Enter the appropriate index number of Senior Developer.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * This is a method to appoint the terminate Senior Developer.
     * Try and catch blocks are used to catch certain exception and display error message using dialog box.
     * If Developer Number is less than the size of array list and greater than or equal to zero.
     * Object of the class Developer is casted as Senior Developer.
     * Object calls the getAppointed method and if the value received is ture, developerContractTermination method is called.
     * If the value received from getAppointed method is false, a dialog box is shown with a message.
     * if the user inputs an invalid value in the developerNumber, a dialog box is shown with an message.
     */
    public void seniorDeveloperContractTermination()
    {
        try
        {    
            developerNumber=Integer.parseInt(textSeniorDeveloperNumber.getText());
            if(developerNumber<myList.size() && developerNumber>=0)//To check whether the number is in ArrayList index or not.
            {
                SeniorDeveloper castedObjSD=(SeniorDeveloper)myList.get(developerNumber);
                if(castedObjSD.getAppointed()==true)//To check whether the developer is appointed or not.
                {
                    castedObjSD.developerContractTermination();//To use the method of Senior Developer class.
                    JOptionPane.showMessageDialog(frame,"The Senior Developer is terminated.","Sucessful", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,"The Senior Developer is not appointed yet.","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                textSeniorDeveloperNumber.setForeground(Color.red);
                JOptionPane.showMessageDialog(frame,"Please Enter a suitable value in Developer Number.","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException exceptionNumFormat)
        {
            JOptionPane.showMessageDialog(frame,"Please Enter a suitable value.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * This is a method to clear the text fields of the Senior Developer panel.
     * Try and catch blocks are used to catch certain exception and display error message using dialog box.
     * When this method is called, the text fields are cleared with a dialog box showing a message.
     * The setText method of all the text fields in Senior Developer panel is called with empty string as argument.
     */
    public void clearSeniorDeveloper()
    {
        textSDPlatform.setText("");
        textSDInterviewerName.setText("");
        textSDSalary.setText("");
        textSDWorkingHours.setText("");
        textContractPeriod.setText("");
        textSeniorDeveloperName.setText("");
        textJoiningDate.setText("");
        textAdvanceSalary.setText("");
        textStaffRoomNumber.setText("");
        textSeniorDeveloperNumber.setText("");   
        JOptionPane.showMessageDialog(frame,"The fields are cleared successfully.","Senior Developer", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * This is a method to display the details of every object in the ArrayList.
     * Here, a boolean variable status is initialized to false and a for loop is used.
     * The object of the class Developer is created and it calls the display method.
     * The boolean value of status is changed to true.
     * Then a condition is check and if the boolean value is equal to false, a message is shown. 
     */
    public void displaySeniorDeveloper()
    {
        boolean status=false; // It is used so that the error message is shown when display button is pressed.
        for(Developer ObjDisSD:myList)// for each loop to display every object in the array list.
        {
            ObjDisSD.display();
            status=true; //Initializing the value of status so that it wont show the dialog box.
        }
        if(status==false)// If the display method is not called, the dialog box is shown
        {
            JOptionPane.showMessageDialog(frame,"Please Add, Appoint the Developer first.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * This is a method to add platform for the Junior Developer.
     * Try and catch blocks are used to catch certain exception and display error message using dialog box.
     * The method accepts the values that are to be passed as argument in constructor.
     * It takes the values from text fields from Junior Developer panel.
     * Object of the class Junior Developer is created and is added to the arrayList.
     */
    public void addJuniorDeveloper()
    {
        try
        {
            platform=textJDPlatform.getText();
            interviewerName=textJDInterviewerName.getText();
            salary=Integer.parseInt(textJDSalary.getText());
            workingHours=Double.parseDouble(textJDWorkingHours.getText());
            appointedBy=textAppointedBy.getText();
            terminationDate=textAddTerminationDate.getText();
            objJD= new JuniorDeveloper(platform, interviewerName, workingHours, salary, appointedBy, terminationDate);;
            myList.add(objJD);
            JOptionPane.showMessageDialog(frame,"The platform for Junior Developer is added.","Junior Developer", JOptionPane.INFORMATION_MESSAGE);
            textJDPlatform.setText("");
            textJDInterviewerName.setText("");
            textJDSalary.setText("");
            textJDWorkingHours.setText("");
            textAppointedBy.setText("");
            textAddTerminationDate.setText("");
        }
        catch(NumberFormatException exceptionNumFormat)
        {
            JOptionPane.showMessageDialog(frame,"Please Enter a suitable value.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * This is a method to appoint the Junior Developer.
     * Try and catch blocks are used to catch certain exception and display error message using dialog box.
     * The method accepts the values that are to be passed as argument in the method appointDeveloper.
     * It takes the values from text fields from Junior Developer panel.
     * If Developer Number is less than the size of array list and greater than or equal to zero.
     * Object of the class Developer is casted as Junior Developer.
     * Object calls getJoined method and if the value received is false, appointDeveloper method is called.
     * If the value received from getJoined method is true, a dialog box is shown with a message.
     * if the user inputs an invalid value in the developerNumber, a dialog box is shown with an message.
     */
    public void appointJuniorDeveloper()
    {
        try
        {
            developerName=textJuniorDeveloperName.getText();
            appointedDate=textAppointedDate.getText();
            terminationDate=textAppointTerminationDate.getText();
            specialization=textSpecialization.getText();
            evaluationPeriod=textEvaluationPeriod.getText();
            developerNumber=Integer.parseInt(textJuniorDeveloperNumber.getText());
            if(developerNumber<myList.size() && developerNumber>=0)//To check whether the number is in ArrayList index or not.
            {
                JuniorDeveloper castedObjJD=(JuniorDeveloper)myList.get(developerNumber);//To use the method of Junior Developer class.
                if(castedObjJD.getJoined()==false)//To check whether the developer is appointed or not.
                {
                    castedObjJD.appointDeveloper(developerName, appointedDate, terminationDate, specialization);
                    JOptionPane.showMessageDialog(frame,"The Junior Developer is appointed.","Junior Developer", JOptionPane.INFORMATION_MESSAGE);
                    textJuniorDeveloperName.setText("");
                    textAppointedDate.setText("");
                    textAppointTerminationDate.setText("");
                    textSpecialization.setText("");
                    textEvaluationPeriod.setText("");
                    textJuniorDeveloperNumber.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,"The Junior Developer is already appointed.","Error", JOptionPane.ERROR_MESSAGE); 
                }
            }
            else
            {
                textJuniorDeveloperNumber.setForeground(Color.red);
                JOptionPane.showMessageDialog(frame,"Please Enter a suitable value in Developer Number.","Error", JOptionPane.ERROR_MESSAGE);     
            }
        }
        catch(NumberFormatException exceptionNumFormat)
        {
            JOptionPane.showMessageDialog(frame,"Please Enter a suitable value.","Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(ClassCastException exceptionClassCast)
        {
            JOptionPane.showMessageDialog(frame,"Please Enter the appropriate index number of Junior Developer.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * This is a method to clear the text fields of the Junior Developer panel.
     * Try and catch blocks are used to catch certain exception and display error message using dialog box.
     * When this method is called, the text fields are cleared with a dialog box showing a message.
     * The setText method of all the text fields in Junior Developer panel is called with empty string as argument.
     */
    public void clearJuniorDeveloper()
    {
        textJDPlatform.setText("");
        textJDInterviewerName.setText("");
        textJDSalary.setText("");
        textJDWorkingHours.setText("");
        textAppointedBy.setText("");
        textAddTerminationDate.setText("");
        textJuniorDeveloperName.setText("");
        textAppointedDate.setText("");
        textAppointTerminationDate.setText("");
        textSpecialization.setText("");
        textEvaluationPeriod.setText("");
        textJuniorDeveloperNumber.setText("");
        JOptionPane.showMessageDialog(frame,"The fields are cleared successfully.","Junior Developer", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * This is a method to display the details of every object in the ArrayList.
     * Here, a boolean variable status is initialized to false and a for loop is used.
     * The object of the class Developer is created and it calls the display method.
     * The boolean value of status is changed to true.
     * Then a condition is check and if the boolean value is equal to false, a message is shown. 
     */
    public void displayJuniorDeveloper()
    {
        boolean status=false; // It is used so that the error message is shown when display button is pressed.
        for(Developer ObjDisJD:myList)// for each loop to display every object in the array list.
        {
            ObjDisJD.display();
            status=true; //Initializing the value of status so that it wont show the dialog box.
        }
        if(status==false)// If the display method is not called, the dialog box is shown
        {
            JOptionPane.showMessageDialog(frame,"Please Add, Appoint the Developer first.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
