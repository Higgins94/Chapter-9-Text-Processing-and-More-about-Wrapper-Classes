import java.util.Scanner; 
/*
                                          *Programming Challenge 12*
*/
/**
   The MiscelaneousStringOperationsDemo demostrates the methods in the MiscelaneousStringOperations class 
*/ 
public class MiscelaneousStringOperationsDemo { 
   public static void main(String[] args) { 
   
      MiscelaneousStringOperations mso = new MiscelaneousStringOperations(); 
      
      Scanner scan = new Scanner(System.in); 
      
      System.out.print("Enter A String: "); 
      String str = scan.nextLine(); 
      
      System.out.printf("\nNumber of words contained in the String: %d" 
         ,mso.WordCount(str)); 
         
      char[] charArray = {'A' ,'A' ,'B' ,'C' ,'D'}; 
    
      System.out.printf("\nchar array returned as string: %s" ,mso.arrayToString(charArray)); 
     
      System.out.print("\nEnter substring to replace: "); 
      String str2 = scan.nextLine(); 
      System.out.print("\nEnter replacement: "); 
      String str3 = scan.nextLine();   
      System.out.printf("Modified String: %s" ,mso.replaceSubstring(str ,str2 ,str3));
          
   }
}