public class PolicyHolder //Step 1 
{
   private String firstName, //to hold the Policyholder's First Name
                  lastName, //to hold the Policyholder's Last Name
                  smokingStatus; //to hold the Policyholder's Smoking Status                  
   private int age; //to hold the Policyholder's Age
   private double height, //to hold the Policyholder's Height in inches
                  weight; //to hold the Policyholder's Weight in pounds
                  
   //no-arg constructor
   public PolicyHolder()
   {
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }


   /**
      The constructor initializes the policy object.
      @param fName The Policyholder's First Name.
      @param lName The Policyholder's Last Name.
      @param a The Policyholder's Age.
      @param smokStat The Policyholder's Smoking Status
      @param h The Policyholder's Height.
      @param w The Policyholder's Weight.
   */
   public PolicyHolder(String fName, String lName, int a, String smokStat, double h, double w)
   {
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = smokStat;
      height = h;
      weight = w;
   }
 
 
    //Copy constructor that initializes the object as a copy of another PolicyHolder object
   public PolicyHolder(PolicyHolder object2)
   {
      firstName = object2.firstName;
      lastName = object2.lastName;
      age = object2.age;
      smokingStatus = object2.smokingStatus;
      height = object2.height;
      weight =  object2.weight;
   }

  
   //setters
   

   /**
      The setFirstName method sets the Policyholder's First Name.
      @param fName The First Name.
   */
   public void setFirstName(String fName)
   {
     firstName = fName;
   }


   /**
      The setLastName method sets the Policyholder's Last Name.
      @param lName The Last Name.
   */
   public void setLastName(String lName)
   {
     lastName = lName;
   }


   /**
      The setAge method sets the Policyholder's Age.
      @param a The Age.
   */
   public void setAge(int a)
   {
     age = a;
   }


   /**
      The setSmokingStatus method sets the Policyholder's Smoking Status.
      @param smokStat The Smoking Status.
   */
   public void setSmokingStatus(String smokStat)
   {
     smokingStatus = smokStat;
   }


   /**
      The setHeight method sets the Policyholder's Height.
      @param h The Height.
   */
   public void setHeight(double h)
   {
     height = h;
   }


   /**
      The setWeight method sets the Policyholder's Weight.
      @param w The Weight.
   */
   public void setWeight(double w)
   {
     weight = w;
   }


   //getters
      
   
   /**
      The getFirstName method returns the Policyholder's First Name.
      @return The First Name.
   */
   public String getFirstName()
   {
     return firstName;
   }
   
   
   /**
      The getLastName method returns the Policyholder's Last Name.
      @return The Last Name.
   */
   public String getLastName()
   {
     return lastName;
   }
 
 
   /**
      The getAge method returns the Policyholder's Age.
      @return The Age.
   */
   public int getAge()
   {
     return age;
   }


   /**
      The getSmokingStatus method returns the Policyholder's Smoking Status.
      @return The Smoking Status.
   */
   public String getSmokingStatus()
   {
     return smokingStatus;
   }


   /**
      The getHeight method returns the Policyholder's Height.
      @return The Height.
   */
   public double getHeight()
   {
     return height;
   }


   /**
      The getWeight method returns the Policyholder's Weight.
      @return The Weight.
   */
   public double getWeight()
   {
     return weight;
   }


   /**
      The getBMI method calculates and returns the Policyholder's BMI.
      @return The BMI.
   */
   public double getBMI()
   {
     final double CONV_FACTOR = 703;
     
     return (weight * CONV_FACTOR) / (height * height);
   }


   //toString method - Step 2 Add a toString method
   public String toString()
   {
      String str = "\nPolicyholder's First Name: " + firstName + 
                   "\nPolicyholder's Last Name: " + lastName +
                   "\nPolicyholder's Age: " + age +
                   "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus +
                   "\nPolicyholder's Height: " + height +
                   "\nPolicyholder's Weight: " + weight +
                   "\nPolicyholder's BMI: " + getBMI();

      return str;
   }    
   
}
