import java.util.ArrayList; 
/*
                            *Programming Challenge 1*
           Simple program to practice using Character wrapper class for char data type. 
           
*/
/**
   The BackwardString class prints the contents of a string backwards. 
*/ 
public class BackwardString { 
   
   private String word; 
   private int length; 
   private char[] array; 
   
   public BackwardString() {
      word = "Not Set"; 
      length = 0;  
      
   
   } 
   
   public void print(String wrd) { 
      word = wrd;
      length = word.length(); 
      array = new char[length]; 
      
      for (int i = 0; i < word.length(); i++) { 
         array[i] = word.charAt(i);  
      }
       
      length--;
      
      for (int q = length; q >= 0; q--) { 
         
         System.out.print(array[q]); 
      }
         
         
   } 
}
  