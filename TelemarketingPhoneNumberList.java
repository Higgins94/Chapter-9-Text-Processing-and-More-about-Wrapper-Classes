import java.util.Scanner; 
/*
                           *Programming Challenge 6* 
        Practice using string methods, just needed one for the challenge; The startsWith method. 
*/
/**
   The TelemarketingPhoneNumberList class searches an array of string objects and returns 
   the strings that start with the input given by the user. 
*/ 
public class TelemarketingPhoneNumberList { 
   public static void main(String[] args) { 

      String[] names = {"Harrison, Rose" ,"James, Dean", 
                                "Smith, William" ,"Smith, Brad", 
                                 "Martin, Dean" ,"Rose, Mary" }; 
      
      String[] phoneNumbers = {"555-2234" ,"555-9098" ,"555-1785", 
                               "555-9224" ,"555-4542" ,"946-5558" };  
      
      String input ,name; 
      boolean match;
      
      Scanner scan = new Scanner(System.in); 
      System.out.print("\nEnter First Few Characters: ");
      input = scan.nextLine(); 

      for (int index = 0; index < input.length(); index++) { 
         match = false; 
         name = names[index];
         match = name.startsWith(input); 
         if (match) { 
            System.out.println("\n" + names[index] + ": " + phoneNumbers[index]);
         }       
      } 
   } 
} 
        