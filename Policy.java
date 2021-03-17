public class Policy
{
   private String policyNumber, //to hold the Policy Number
                  providerName, //to hold the Provider Name
                  firstName, //to hold the Policyholder's First Name
                  lastName, //to hold the Policyholder's Last Name
                  smokingStatus; //to hold the Policyholder's Smoking Status                  
   private int age; //to hold the Policyholder's Age
   private double height, //to hold the Policyholder's Height in inches
                  weight; //to hold the Policyholder's Weight in pounds
                  
   //no-arg constructor
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }


   /**
      The constructor initializes the policy object.
      @param polNum The Policy Number.
      @param proName The Provider Name.
      @param fName The Policyholder's First Name.
      @param lName The Policyholder's Last Name.
      @param a The Policyholder's Age.
      @param smokStat The Policyholder's Smoking Status
      @param h The Policyholder's Height.
      @param w The Policyholder's Weight.
   */
   public Policy(String polNum, String proName, String fName, String lName, int a, String smokStat, double h, double w)
   {
      policyNumber = polNum;
      providerName = proName;
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = smokStat;
      height = h;
      weight = w;
   }
   
   //setters
   
   /**
      The setPolicyNumber method sets the Policy Number.
      @param polNum The Policy Number.
   */
   public void setPolicyNumber(String polNum)
   {
     policyNumber = polNum;
   }
   
   
   /**
      The setProviderName method sets the Provider Name.
      @param proName The Provider Name.
   */
   public void setProviderName(String proName)
   {
     providerName = proName;
   }


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
      The getPolicyNumber method returns the Policy Number.
      @return The Policy Number.
   */
   public String getPolicyNumber()
   {
     return policyNumber;
   }


   /**
      The getProviderName method returns the Provider Name.
      @return The Provider Name.
   */
   public String getProviderName()
   {
     return providerName;
   }
   
   
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


   /**
      The getPricePolicy method calculates and returns the Price of the Insurance Policy.
      @return The price of the policy.
   */
   public double getPricePolicy()
   {
     final double BASE_FEE = 600,
                  AGE_OVER50_FEE = 75,
                  SMOKER_FEE = 100,
                  ADDITIONAL_FEE_BMI = 20;
     final int AGE_THRESHOLD = 50,
               BMI_THRESHOLD = 35;     
     double fee = BASE_FEE;

     if (age > AGE_THRESHOLD)
         fee += AGE_OVER50_FEE;           
     if (smokingStatus.equalsIgnoreCase("smoker"))
         fee += SMOKER_FEE;       
     if (getBMI() > BMI_THRESHOLD) 
         fee += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_BMI);
         
     return fee;
   }
   
}
