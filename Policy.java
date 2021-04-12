public class Policy
{
   //Step 3 - Add a static field that is used to keep track of the number of Policy objects that have been created.
   private static int policyCount = 0;

   private String policyNumber, //to hold the Policy Number
                  providerName; //to hold the Provider Name
   private PolicyHolder policyHolder; //Step 4 - Policy has a PolicyHolder               
                  
   //no-arg constructor
   public Policy()
   {
      policyNumber = "";
      providerName = "";
   }


   /**
      The constructor initializes the policy object.
      @param polNum The Policy Number.
      @param proName The Provider Name.
   */
   public Policy(String polNum, String proName, PolicyHolder polHolder)
   {
      policyNumber = polNum;
      providerName = proName;
      policyHolder = new PolicyHolder(polHolder);
      policyCount++;
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

     if (policyHolder.getAge() > AGE_THRESHOLD)
         fee += AGE_OVER50_FEE;           
     if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
         fee += SMOKER_FEE;       
     if (policyHolder.getBMI() > BMI_THRESHOLD) 
         fee += ((policyHolder.getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_BMI);
         
     return fee;
   }
   
   
   public int getPolicyCount()
   {
      return policyCount;
   }


   //toString method - Step 2 Add a toString method
   public String toString()
   {
      String str = "Policy Number: " + policyNumber + 
                   "\nProvider Name: " + providerName ;

      return str;
   }    
  
}
