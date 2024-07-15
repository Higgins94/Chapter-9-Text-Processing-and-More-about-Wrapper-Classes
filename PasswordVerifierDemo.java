import java.util.Scanner; 
/*
                        *Programming Challenge 5*
          This is a simple class to demostrate the PasswordVerifier class 
*/
/**
   The PasswordVerifierDemo displays wheather a password meets 
   complexity criteria.
*/ 

public class PasswordVerifierDemo {
   public static void main(String[] args) { 
      
      Scanner scan = new Scanner(System.in); 
      PasswordVerifier psswrd = new PasswordVerifier();  
      
      String input;
      boolean result; 
      
      while (true) { 
         System.out.print("\nEnter password: ");
         input = scan.nextLine(); 
         psswrd.setPassword(input); 
         psswrd.getPassword(); 
         result = psswrd.verify(); 
         
         if (result)  
            System.out.print("\nPassword Meets Criteria"); 
         else 
            System.out.print("\nDoes NOT Meet Criteria"); 
      } 
   }
}      
            
            
            