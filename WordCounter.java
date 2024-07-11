/*
                        *Programming Challenge 2*
      Tokenizing a String to count the number of words, a space is used as the delimter as well as
      an indicator of when whole words occur to get word count. 
*/
/**
   The WordCounter class counts the words in a given String
*/ 
public class WordCounter {

   private String[] tokens; 
   private int wordCount; 
   
   public WordCounter() { 
      wordCount = 0; 
   } 
   
   public void getWordCount(String word) { 
      tokens = word.split(" "); 
      
      for (String s : tokens) {  
         wordCount++; 
      } 
      System.out.println("Word Count: " + counter); 
   } 
} 


   