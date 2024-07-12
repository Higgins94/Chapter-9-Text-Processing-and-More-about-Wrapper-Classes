import java.util.Scanner; 
/*
                     *Programming Challenge 3*
             Practicing using StringBuilder class 
                     
*/
/**
   The SentenceCapitalizer class takes a string and capitalizes the first 
   letter of a sentence if not already 
*/
public class SentenceCapitalizer { 
   public static void main(String[] args) { 
      
      String input; 
      Scanner scan = new Scanner(System.in); 
     
      while (true) { 
         System.out.print("Type: "); 
         input = scan.nextLine(); 
         toUpper(input);  
      } 
   }
   
   /**
      The toUpper method takes a string and capitalizes the first 
   letter of a sentence if not already 
   @perma input The string to be evaluated
   */ 

   public static void toUpper(String input) { 
      
      boolean capitalize = true;
      
      StringBuilder sb = new StringBuilder(input);
      
      for (int index = 0; index < sb.length(); pos++) {
         
         if (sb.charAt(index) == '.') {
            capitalize = true;
         } else if (capitalize && !Character.isWhitespace(sb.charAt(index))) {
            sb.setCharAt(index, Character.toUpperCase(sb.charAt(index)));
            capitalize = false;
         }
      }   
       
      System.out.println(sb.toString());
   }
} 
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      /**
      char chr;
      for (int i = 0; i < input.length(); i++) {
         
         chr = input.charAt(i);
         if ('.' == chr) {
          
            str1 = str.substring(i).toUpperCase();  // first letter = J  
S           String res = str.substring(i).toUpperCase();             
            if (Character.isSpaceChar(chr)) { 
               i++;  
               input.charAt(i)toUpperCase();
               i -= 2; 
               
            }
         }       
      }
   }
}   
      
      
*/
          
    
      
      