import java.util.Scanner; //Needed for Scanner class
import java.io.*; //Needed for File class

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
   
      
      //Read the file
      File myfile = new File("PolicyInformation.txt"); //open the file
      Scanner inputFile = new Scanner(myfile); //create a Scanner object to read the file
      
      while (inputFile.hasNext()) //loop processes the lines until the end of the file
      {
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
                  
         
    
           
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

      } //end while
     
      inputFile.close(); //close the file  
                      
   
   } //end main
} //end class

