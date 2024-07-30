import java.io.*; 
import java.util.Scanner; 
/*
                                                    Programming Challenge 11: Sales Analysis
                                                    
                       Practice with more wrapper classes, added a "," at the end of every line scan in order to split 
                                                    the salesString into the array properly. 
*/ 
/**
   The SalesAnalysis class reads sales total from a text document, each line containing seven monetary totals representing one week of sales. 
   Several methods are called to find the total sales for each week, the average daily sales for each week, the total sales for all the weeks, 
   the average weekly sales, the week number that had the highest amount of sales, and the week number that had the lowest amount of sales.
*/
public class SalesAnalysis { 
   public static void main(String[] args) throws IOException { 
 
      String input = "" ,salesString = "";
      int numOfWeeks = 0; 
     
      
      File file = new File("SalesData.txt"); 
      Scanner scan = new Scanner(file); 
    
      
      
      while(scan.hasNext()) { 
         
         input = scan.nextLine();
         numOfWeeks++;
         salesString += input + ","; 
     } 
      
     String[] salesStrArray = salesString.split(",");
     
 
     System.out.printf("Total Sales: $%,.2f\n---------------------------" + 
       "\n\tTotal Sales Per Week" ,getTotal(salesStrArray));
    
    getWeeklyTotal(salesStrArray);
    System.out.print("\n---------------------------\n\tAverge Daily Sales Per Week");  
    getWeeklyDailyAverage(salesStrArray); 
    System.out.printf("\n---------------------------\nAverage Weekly Sales: $%,.2f" + 
    "\n---------------------------" ,getWeeklyAverage(salesStrArray ,numOfWeeks)); 
    getHighestWeekSales(salesStrArray);
    System.out.printf("\n---------------------------" + getLowestWeekSales(salesStrArray)); 
     
   } 
   
   /*
      The getTotal method returns the sum of all sales figures.  
      @perma salesStrArray The String array containing the sales numbers. 
      @return The sum of the elements in the salesStrArray. 
   */
   
   public static double getTotal(String[] salesStrArray) { 
      
      double totalSales = 0; 
      for (int index = 0; index < salesStrArray.length; index++) 
         totalSales += Double.valueOf(salesStrArray[index]); 
      return totalSales; 
   } 
   
   /*
      The getWeeklyTotal method calculates and displays the sum for each week of sales 
      @perma salesStrArray The String array containing the sales numbers.
   */ 
   
   public static void getWeeklyTotal(String[] salesStrArray) {
   
      int counter = 0 ,week = 1; 
      double total = 0;  
      
      for (int index = 0; index < salesStrArray.length; index++) { 
         
         total += Double.valueOf(salesStrArray[index]);
         counter++;  
         if (counter >= 7) {  
            System.out.printf("\nWeek %d: $%,.2f" ,week ,total);  
            counter = 0;
            total = 0; 
            week++; 
         }  
      }
   }
   
   /*
      The getWeeklyDailyAverage method calculates and displays the average sale per day in a sales week. 
      @perma salesStrArray The String array containing the sales numbers.
   */
   
   public static void getWeeklyDailyAverage(String[] salesStrArray) { 
      
      int counter = 0 ,week = 1; 
      double total = 0;  
      
      for (int index = 0; index < salesStrArray.length; index++) { 
         
         total += Double.valueOf(salesStrArray[index]);
         counter++;  
         if (counter >= 7) { 
            total = total / 7.0; 
            System.out.printf("\nWeek %d: $%,.2f" ,week ,total);  
            counter = 0;
            total = 0; 
            week++; 
         }  
      }
   }
   
   /*
      The getWeeklyAverage finds the average given the number of weeks the text file has. 
      @perma salesStrArray The String array containing the sales numbers.
      @perma NumOfWeeks The counter variable for number of lines scanned from file. 
      @reurn The average sales amount per week. 
   */ 
   
   public static double getWeeklyAverage(String[] salesStrArray ,int numOfWeeks) { 
   
      double total ,average; 
      total = getTotal(salesStrArray); 
      average = total / numOfWeeks; 
      return average; 
   } 
     
   /*
      The getHighestWeekSales method finds the week with the highest sales 
      @perma salesStrArray The String array containing the sales numbers.
   */ 
   
   public static void getHighestWeekSales(String[] salesStrArray) { 
   
      int counter = 0 ,week = 1; 
      double total = 0 ,highestNum = 0; 
      String highestWeek = "Week " +  String.valueOf(week);
      
      for (int i = 0; i < 7; i++)  
         highestNum += Double.valueOf(salesStrArray[i]);

      for (int index = 7; index < salesStrArray.length; index++) { 
         counter++; 
         total += Double.valueOf(salesStrArray[index]); 
         if (counter >= 7) { 
            week++;
            if (total > highestNum) { 
               highestNum = total; 
               highestWeek = "Week " + String.valueOf(week); 
            } else if (total == highestNum) 
               highestWeek += " and Week " + String.valueOf(week);
            counter = 0;
            total = 0.0;
         }   
      } 
      
      System.out.printf("\nWeek(s) with Highest Sales: %s \n@ An Amount Of: $%,.2f"  ,highestWeek ,highestNum); 
   }
   
   /*
      The getLowestWeeklySales method finds the week with the lowest sales 
      @perma salesStrArray The String array containing the sales numbers.
   */ 
   
   public static String getLowestWeekSales(String[] salesStrArray) { 
   
      int counter = 0 ,week = 1; 
      double total = 0 ,lowestNum = 0; 
      String lowestWeek = "Week " +  String.valueOf(week);
      
      for (int i = 0; i < 7; i++)  
         lowestNum += Double.valueOf(salesStrArray[i]);

      for (int index = 7; index < salesStrArray.length; index++) { 
         counter++; 
         total += Double.valueOf(salesStrArray[index]); 
         if (counter >= 7) { 
            week++;
            if (total < lowestNum) { 
               lowestNum = total; 
               lowestWeek = "Week " + String.valueOf(week); 
            } else if (total == lowestNum) 
               lowestWeek += " and Week " + String.valueOf(week);
            counter = 0;
            total = 0.0;
         }   
      } 
      
      String result = String.format("\nWeek(s) with Lowest Sales: %s \n@ An Amount Of: $%,.2f"  ,lowestWeek ,lowestNum); 
      return result; 
   }
} 

               
              
                
                         
         
         
            
        
     
      
         
         
  
           
            
          
         
       
         
   
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /* Print elements algorthim 
     int element = 0; 
     for (int i = 0; i < salesStrArray.length; i++) {
        System.out.println("#" + element + " " + salesStrArray[i]); 
        element++; 
     } 
     */ 
     
     

     
     
     
         
         
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
      