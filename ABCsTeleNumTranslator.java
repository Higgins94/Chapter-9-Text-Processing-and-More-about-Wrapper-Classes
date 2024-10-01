import java.util.Scanner; 
/*
Programming Challenge 13: Alphabetic Telephone Number Translator
    
*/ 
/**
   The ABCsTeleNumTranslator class verifies a telephone number input is in correct form, and converts any letters to their corresponding digits 
*/ 
public class ABCsTeleNumTranslator { 
   public static void main(String[] args) { 
      
      String tele = getNumber(); 
     String noHyphens = removeHyphens(tele);
     formatNumber(noHyphens); 
   
      }
      
     /**
     * Prompts the user to enter a telephone number and verifies its format.
     * This method continues to prompt until a valid telephone number is provided.
     *
     * @return A valid telephone number in the format of "XXX-XXX-XXXX".
     */
      public static String getNumber() { 
         
         Scanner scan = new Scanner(System.in); 
         System.out.print("Enter Telephone Number(XXX-XXX-XXXX): ");
         String tele = scan.nextLine();
         
         while(tele.length() != 12 || !verifyHyphenPlacement(tele)) { 
            System.out.print("Enter Telephone Number(XXX-XXX-XXXX): ");
            tele = scan.nextLine();
         }
         return tele; 
     } 
   /**
   * Verifies the placement of hyphens in the provided telephone number.
   * Hyphens are considered correctly placed if they appear at the 4th and 8th positions.
   *
   * @param tele The telephone number to verify.
   * @return true if hyphens are correctly placed, false otherwise.
   */
   public static boolean verifyHyphenPlacement(String tele) { 
      boolean correctHyphens = false;
      char c1 = tele.charAt(3); 
      char c2 = tele.charAt(7); 
      if(c1 == '-' && c2 == '-')
         correctHyphens = true; 
      return correctHyphens; 
   }   
   
   /**
   * Removes all non-alphanumeric characters from the telephone number.
   * If the resulting string does not have exactly 10 valid characters, 
   * it prompts the user for a new telephone number.
   *
   * @param tele The telephone number to process.
   * @return A string containing only letters and digits.
   */
   public static String removeHyphens(String tele) { 
      
      String noHyphens = ""; 
      for(int index = 0; index < tele.length(); index++) { 
         char c = tele.charAt(index); 
         if(Character.isLetterOrDigit(c)) 
            noHyphens+=c;   
      } 
      
      if(noHyphens.length() != 10) 
         return getNumber();
      
      return noHyphens; 
      
   }   
   /**
   * Formats the telephone number by converting letters to corresponding digits.
   * The result is passed to the addHyphens method to format it properly.
   *
   * @param tele The telephone number to format.
   */
   public static void formatNumber(String tele) { 
   
      String result = ""; 
      for(int index = 0; index < tele.length(); index++) { 
         char c = tele.charAt(index);
         
         if(Character.isDigit(c))
            result+=c; 
         else if(Character.isLetter(c)) {
            switch(c) { 
                  case 'A':
                  case 'B':
                  case 'C':
                     result+= "2";
                     break;
                  case 'D':
                  case 'E':
                  case 'F':
                     result+= "3";
                     break;
                  case 'G':
                  case 'H':
                  case 'I':
                     result+= "4";
                     break;
                  case 'J':
                  case 'K':
                  case 'L':
                     result+= "5";
                     break;
                  case 'M':
                  case 'N':
                  case 'O':
                     result+= "6";
                     break;
                  case 'P':
                  case 'Q':
                  case 'R':
                  case 'S':
                     result+= "7";
                     break;
                  case 'T':
                  case 'U':
                  case 'V':
                     result+= "8";
                     break;
                  case 'W':
                  case 'X':
                  case 'Y':
                  case 'Z':
                     result+= "9";
                     break;
                  default: 
                     result+= "ERROR"; 
                     break;
               }
         }   
      
      }
      addHyphens(result);
   } 
   
   /**
   * Adds hyphens to the formatted telephone number for better readability.
   *
   * @param tele The telephone number string without hyphens.
   */
   public static void addHyphens(String tele) { 
      
      String finalForm = ""; 
      char c = tele.charAt(0); 
      finalForm += c;
      String subS = tele.substring(1, 3);
      finalForm+=subS + "-";
      subS = tele.substring(3 ,6); 
      finalForm += subS + "-"; 
      for(int index = 6; index < tele.length(); index++) { 
         c = tele.charAt(index);
         finalForm+= c; 
      } 
      
      displayTeleNumber(finalForm); 
   } 
   
   /**
   * Displays the formatted telephone number to the console.
   *
   * @param finalTeleNumber The formatted telephone number string.
   */
   
   public static void displayTeleNumber(String finalTeleNumber) {
      System.out.println(finalTeleNumber); 
   } 
}    
          
      
 