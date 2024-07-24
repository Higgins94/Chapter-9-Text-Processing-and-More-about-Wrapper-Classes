import java.io.*; 
import java.util.*; 
/*
                                  Programming Challenge 10
     Same as programming challenge 2 "WordCounter" class but sting is coming from a file. 
     Still used a space as the delimter, although this program is much cleaner than challenge 2's code. 
/**
   The WordCounterFromFile class counts the number of words in a given file
*/ 
public class WordCounterFromFile { 
   public static void main(String[] args) throws IOException { 
   
      Scanner scan = new Scanner(System.in); 
      System.out.print("Enter name of file + extension: "); 
      String filename = scan.nextLine(); 
      File file = new File(filename); 
   
      Scanner fileRead = new Scanner(file); 
      String line ,total = ""; 
   
      while (fileRead.hasNext()) { 
         line = fileRead.nextLine();
         total = total + line; 
      } 
    String[] str = total.split(" "); 
      
      int wordCount = str.length; 
      System.out.println("Number of words in file: " + wordCount); 
   } 
} 
  
         
      
      
