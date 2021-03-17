import java.util.*; //Needed for Scanner and ArrayList class
import java.io.*; //Needed for File class

public class PolicyDemo
{
   public static void main(String[] args)
   {
   
      try 
      {
         /*Create an instance of the File class. Pass the string "PolicyInformation.txt" to the constructor. 
         This process creates a File object that represents the file PolicyInformation.txt.*/      
         File myfile = new File("PolicyInformation.txt"); //open the file
         
         //Pass a reference to the File object as an argument to the Scanner class constructor
         Scanner inputFile = new Scanner(myfile); //create a Scanner object to read the file

         //Declare variables for user input
         String policyNumber, //to hold the Policy Number
                providerName, //to hold the Provider Name
                firstName, //to hold the Policyholder's First Name
                lastName, //to hold the Policyholder's Last Name
                smokingStatus; //to hold the Policyholder's Smoking Status                  
         int age; //to hold the Policyholder's Age
         double height, //to hold the Policyholder's Height in inches
                weight; //to hold the Policyholder's Weight in pounds

      
         //Create an array list to store objects. The ArrayList will hold Policy objects.
         ArrayList<Policy> policies = new ArrayList<Policy>();

         /* Use a while loop to read the file. Use the hasNext() method to determine whether 
            the file has more data to be read. Use an "if statement" to determine the end of the file and 
            to consume newline characters */
      
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
            
            if(inputFile.hasNext())
            {
               inputFile.nextLine(); //this handles the end of the file to avoid an exception
            } //end if
            
            
            //Create Policy objects using the Policy class type - we are still under the while loop. Objects will be created as long as there are records in the file to read.
            Policy pol = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
   
            //Add Policy objects to the ArrayList (Note: policies is the reference variable for the ArrayList and pol is the reference variable for the Policy objects)
            policies.add(pol);
            
         } //end while
     
      
         inputFile.close(); //close the file  
      
         
         //Display output using for loop
         for(int i =0; i < policies.size(); i++)
         { 
            System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());
            System.out.println("Provider Name: " + policies.get(i).getProviderName());
            System.out.println("Policyholder's First Name: " + policies.get(i).getFirstName());
            System.out.println("Policyholder's Last Name: " + policies.get(i).getLastName());
            System.out.println("Policyholder's Age: " + policies.get(i).getAge());
            System.out.println("Policyholder's Smoking Status: " + policies.get(i).getSmokingStatus());
            System.out.printf("Policyholder's Height: %.1f inches", policies.get(i).getHeight());
            System.out.printf("\nPolicyholder's Weight: %.1f pounds", policies.get(i).getWeight());
            System.out.printf("\nPolicyholder's BMI: %.2f", policies.get(i).getBMI());
            System.out.printf("\nPolicy Price: $%.2f", policies.get(i).getPricePolicy(age, smokingStatus));

         } //end for

      }//close the "try" block of code
      
      catch(IOException ex)//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
                            
   
   } //end main
} //end class

