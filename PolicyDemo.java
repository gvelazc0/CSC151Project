/*import java.util.Scanner;
  import java.util.ArrayList;
  import java.io.File;
  import java.io.IOException;*/

import java.util.*; //Needed for Scanner and ArrayList class
import java.io.*; //Needed for File class

public class PolicyDemo
{
   public static void main(String[] args)
   {
      //Declare variables
      String policyNumber, //to hold the Policy Number
             providerName, //to hold the Provider Name
             firstName, //to hold the Policyholder's First Name
             lastName, //to hold the Policyholder's Last Name
             smokingStatus, //to hold the Policyholder's Smoking Status 
             fileInput = "";                 
      int age, //to hold the Policyholder's Age
          numSmokers = 0; // to hold the number of policy holders that are smokers and non-smokers
      double height, //to hold the Policyholder's Height in inches
             weight; //to hold the Policyholder's Weight in pounds
    
      //Create an array list to store objects. The ArrayList will hold Policy objects.
      ArrayList<Policy> policies = new ArrayList<Policy>();   
   
      try 
      {        
         /*Create an instance of the File class. Pass the string "PolicyInformation.txt" to the constructor. 
         This process creates a File object that represents the file PolicyInformation.txt.*/      
         File myfile = new File("PolicyInformation.txt"); //open the file
         
         //Pass a reference to the File object as an argument to the Scanner class constructor
         Scanner inputFile = new Scanner(myfile); //create a Scanner object to read the file

         /* Use a while loop to read the file. Use the hasNext() method to determine whether 
            the file has more data to be read. Use an "if statement" to determine the end of the file and 
            to consume newline characters */
      
         while (inputFile.hasNext()) //loop processes the lines until the end of the file
         {
            //"Parsing" way of reading input - We read each line of input as a String and convert it to other data types when required
            policyNumber = inputFile.nextLine();
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            fileInput = inputFile.nextLine();
            age = Integer.parseInt(fileInput); //convert the age to an int
            smokingStatus = inputFile.nextLine();
            fileInput = inputFile.nextLine();            
            height = Double.parseDouble(fileInput); //convert the height to a double
            fileInput = inputFile.nextLine();                        
            weight = Double.parseDouble(fileInput); //convert the weight to a double
            
            if(inputFile.hasNext())
               inputFile.nextLine(); //this handles the end of the file to avoid an exception
            
            
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
            System.out.printf("\nPolicy Price: $%.2f", policies.get(i).getPricePolicy());           
            System.out.println("\n");
            
            if(policies.get(i).getSmokingStatus().equalsIgnoreCase("smoker")) //keep track of the number of smokers
               numSmokers++;

         } //end for
         
      //Display the number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + numSmokers);   
      System.out.println("The number of policies with a non-smoker is: " + (policies.size() - numSmokers));   
      

      } //close the "try" block of code
      
      catch(IOException ex) //If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
                            
   
   } //end main
} //end class




/* Alternative way of reading input without parsing
         while (inputFile.hasNext()) //loop processes the lines until the end of the file
         {
            policyNumber = inputFile.nextLine();
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = inputFile.nextInt();
            inputFile.nextLine(); //clear the new line left in the buffer
            smokingStatus = inputFile.nextLine();         
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();
            
            if(inputFile.hasNext())
               inputFile.nextLine(); //this handles the end of the file to avoid an exception
         } //end while
*/


/* A shorter way to add policy objects
   policies.add(new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight));
*/


/* Another way to code the selection structure using the enhanced for loop
         for(Policy pol : policies)
         { 
            System.out.println("Policy Number: " + pol.getPolicyNumber());
            System.out.println("Provider Name: " + pol.getProviderName());
            System.out.println("Policyholder's First Name: " + pol.getFirstName());
            System.out.println("Policyholder's Last Name: " + pol.getLastName());
            System.out.println("Policyholder's Age: " + policies.get(i).getAge());
            System.out.println("Policyholder's Smoking Status: " + pol.getSmokingStatus());
            System.out.printf("Policyholder's Height: %.1f inches", pol.getHeight());
            System.out.printf("\nPolicyholder's Weight: %.1f pounds", pol.getWeight());
            System.out.printf("\nPolicyholder's BMI: %.2f", pol.getBMI());
            System.out.printf("\nPolicy Price: $%.2f", pol.getPricePolicy());
*/