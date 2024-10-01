import java.util.Scanner; 
/**
* ===============================================================
*                     Programming Challenge 14
*                          Word Separator
* ===============================================================
*/ 
/*
* The WordSeparator class processes a run-together sentence with no spaces and the begining of each word is capitalized
* then converts to a normal sentence. 
*/
public class WordSeparator { 
   public static void main(String[] args) { 
      
      String sentenceToBeConverted = getSentence();
      System.out.println(addSpacesAndLowercase(sentenceToBeConverted));    
   } 
   /**
   * Prompts the user for a sentence and returns it.
   * The user must input a sentence with words run together,
   * where each word starts with an uppercase letter.
   * 
   * @return The sentence entered by the user.
   */
   public static String getSentence() { 
      Scanner scan = new Scanner(System.in); 
      String sentenceToBeConverted = " "; 
      while (verifyFormat(sentenceToBeConverted)) { 
         System.out.println("Input a sentence in which all of the words are run together with no spaces, but the first character of each word is uppercase"); 
         sentenceToBeConverted = scan.nextLine(); 
      }
      return sentenceToBeConverted; 
   } 
   /**
   * Checks if the given sentence contains any whitespace characters.
   * 
   * @param sentence The sentence to be checked.
   * @return true if the sentence contains spaces; false otherwise.
   */
   public static boolean verifyFormat(String sentence) {                      
      boolean containsSpaces = true; 
      for(int index = 0; index < sentence.length(); index++) { 
         char c = sentence.charAt(index); 
         if (Character.isWhitespace(c)) { // use trim() to skip all this?
             return containsSpaces; 
         }
      } 
      return false; 
   }
   /**
   * Converts the input sentence into format of normal sentence
   * It adds a space before each capitalized
   * letter except for the first character are converted to lowercase.
   * 
   * @param sentenceToBeConverted The run-together sentence to convert.
   * @return The converted sentence with spaces and lowercase letters.
   */
   public static String addSpacesAndLowercase(String sentenceToBeConverted) { 
      
      String convertedSentence = String.valueOf(sentenceToBeConverted.charAt(0)).toUpperCase();
      
      for(int index = 1; index < sentenceToBeConverted.length(); index++) { 
         char c = sentenceToBeConverted.charAt(index); 
         if(Character.isUpperCase(c)) { 
            convertedSentence += " " + Character.toLowerCase(c);            
         } else { 
            convertedSentence+= c;
         } 
      }
      return convertedSentence; 
   }
   }      
                 
          
          