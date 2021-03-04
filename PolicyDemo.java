import java.util.Scanner;

public class PolicyDemo
{
   public static void main(String[] args)
   {
      //Declare variables for user input
      String policyNumber, //to hold the Policy Number
             providerName, //to hold the Provider Name
             firstName, //to hold the Policyholder's First Name
             lastName, //to hold the Policyholder's Last Name
             smokingStatus; //to hold the Policyholder's Smoking Status                  
      int age; //to hold the Policyholder's Age
      double height, //to hold the Policyholder's Height in inches
             weight; //to hold the Policyholder's Weight in pounds
   
      //Create Scanner object for input
      Scanner keyboard = new Scanner(System.in);
     
      //Ask user for info
      System.out.print("Please enter the Policy Number: "); 
         policyNumber = keyboard.nextLine();  

      System.out.print("Please enter the Provider Name: "); 
         providerName = keyboard.nextLine();  

      System.out.print("Please enter the Policyholder's First Name: "); 
         firstName = keyboard.nextLine();  

      System.out.print("Please enter the Policyholder's Last Name: "); 
         lastName = keyboard.nextLine();  

      System.out.print("Please enter the Policyholder's Age: "); 
         age = keyboard.nextInt();  
         
      keyboard.nextLine(); //remmove trailing
   
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): "); 
         smokingStatus = keyboard.nextLine();  
       
      System.out.print("Please enter the Policyholder's Height (in inches): "); 
         height = keyboard.nextDouble();  
   
      System.out.print("Please enter the Policyholder's Weight (in pounds): "); 
         weight = keyboard.nextDouble();  
                
      //Create an instance of the Policy class
      Policy instance1 = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
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
      System.out.printf("\nPolicy Price: $%.2f", instance1.getPricePolicy(age, smokingStatus));
   
   } //end main
} //end class
