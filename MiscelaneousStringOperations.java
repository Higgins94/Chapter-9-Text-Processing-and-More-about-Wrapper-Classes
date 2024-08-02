import java.util.HashMap; 
/*
                                                                  *Programming Challenge 12*
                                                    More practice with text processing and wrapper classes.
         
/**
   The MiscelaneousStringOperations class demostrates four methods using wrapper classes.  
*/ 

public class MiscelaneousStringOperations {  
      
  
     
   public static int WordCount(String str) {
      int countWords = str.split("\\s").length;
      return countWords;    
   }
   
  /*
      The arrayToString method accepts a char array as argument and converts it to a String object.
      @perma charArray The array to be converted to a string object
      @return str The String object converted from char array 
  */ 
    
   public static String arrayToString(char[] charArray) { 
      
      String str = String.valueOf(charArray); 
      return str; 
   } 
     
   /*
      The arrayToString method accepts a char array as argument and converts it to a String object.
      @perma charArray the array to be converted into a String. 
      @return str a reference to the String object. 
   */ 
   
   public static char mostFrequent(String str) { 

      char answer = 0; 
      int count = 0; 
   
      HashMap<Character ,Integer> chm = new HashMap<>(); // Had to read up on HashMaps and TreeMaps from Core Java Volume I: Fundamentals, 12th Ed. by Cay S. Horstmann 
      
      for (int index = 0; index < str.length(); index++) { 
         char c = str.charAt(index); 
         chm.put(c, chm.getOrDefault(c ,0) + 1); 
      
         if (count < chm.get(c)) { 
          answer = c;
          count = chm.get(c); 
         } 
      }
      return answer;   
   } 
   
   /*
      The replaceSubString method replaces a substring of the string object
      @perma str1 The orginal string object. 
      @perma str2 Occurences to be searched for. 
      @perma str3 Replacement for each occurence. 
      @return The modified String object.
   */ 
                                        
   public static String replaceSubstring(String str1 ,String str2 ,String str3) { 
   
     return str1.replace(str2 ,str3);
         
      
   }
}
 
      
   
      
      
      
       
      
  