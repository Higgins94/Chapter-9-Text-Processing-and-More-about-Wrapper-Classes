import java.util.Scanner; 
/*
                            Programming Challenge 9
              Simple program for more practice with String wrapper class. 
*/ 
/**
   The SumOfDigitsInAString converts a String of numbers seperated by commas into a sum of said numbers. 
*/ 

public class SumOfDigitsInAString { 
   public static void main(String[] args) { 
   
      int sum = 0 ,digit; 
      Scanner scan = new Scanner (System.in); 
      System.out.println("Enter a series of numbers followed with a comma."); 
      String input = scan.nextLine();
      input = input.replaceAll("\\s+","");
      System.out.print(input);
      String[] strNums = input.split(",");
     
      
      for(int index = 0; index < strNums.length; index++) 
         sum += Integer.valueOf(strNums [index]);    
            
      System.out.printf("\nSum: %,d" ,sum);

   }
}
      
      