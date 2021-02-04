import java.util.Scanner;

public class PolicyDemo
{
   public static void main(String[] args)
   {
      //Declare variables for user input
      String demoPolicyNumber, //to hold the Policy Number
             demoProviderName, //to hold the Provider Name
             demoFirstName, //to hold the Policyholder's First Name
             demoLastName, //to hold the Policyholder's Last Name
             demoSmokingStatus; //to hold the Policyholder's Smoking Status                  
      int demoAge; //to hold the Policyholder's Age
      double demoHeight, //to hold the Policyholder's Height in inches
             demoWeight; //to hold the Policyholder's Weight in pounds
   
      //Create Scanner object for input
      Scanner keyboard = new Scanner(System.in);
     
      //Ask user for info
      System.out.print("Please enter the Policy Number: "); 
         demoPolicyNumber = keyboard.nextLine();  

      System.out.print("Please enter the Provider Name: "); 
         demoProviderName = keyboard.nextLine();  

      System.out.print("Please enter the Policyholder's First Name: "); 
         demoFirstName = keyboard.nextLine();  

      System.out.print("Please enter the Policyholder's Last Name: "); 
         demoLastName = keyboard.nextLine();  

      System.out.print("Please enter the Policyholder's Age: "); 
         demoAge = keyboard.nextInt();  
         
      keyboard.nextLine(); //remmove trailing
   
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): "); 
         demoSmokingStatus = keyboard.nextLine();  
       
      System.out.print("Please enter the Policyholder's Height (in inches): "); 
         demoHeight = keyboard.nextDouble();  
   
      System.out.print("Please enter the Policyholder's Weight (in pounds): "); 
         demoWeight = keyboard.nextDouble();  
                
      //Create an instance of the Policy class
      Policy instance1 = new Policy(demoPolicyNumber, demoProviderName, demoFirstName, demoLastName, demoAge, demoSmokingStatus, demoHeight, demoWeight);
      
      //Display data
      System.out.println("Policy Number: " + instance1.getPolicyNumber());
      System.out.println("Provider Name: " + instance1.getProviderName());
      System.out.println("Policyholder's First Name: " + instance1.getFirstName());
      System.out.println("Policyholder's Last Name: " + instance1.getLastName());
      System.out.println("Policyholder's Age: " + instance1.getAge());
      System.out.println("Policyholder's Smoking Status: " + instance1.getSmokingStatus());
      System.out.printf("Policyholder's Height: %.1f inches", instance1.getHeight());
      System.out.printf("\nPolicyholder's Weight: %.1f pounds", instance1.getWeight());
      System.out.printf("\nPolicyholder's BMI: %.2f", instance1.getBMI());
      System.out.printf("\nPolicy Price: $%.2f", instance1.getPricePolicy(demoAge,demoSmokingStatus));
   
   } //end main
} //end class
