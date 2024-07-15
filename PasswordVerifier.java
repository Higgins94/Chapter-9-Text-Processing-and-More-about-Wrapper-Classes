/*
                           *Programming Challenge 5*
       More practice with StringBuilder class, mostly still with the char data
          type wrapper class, this time to check different criteria of a password. 
*/ 
/**
      The PasswordVerifier class checks to see if a passwords meets certain criteria.
*/ 
public class PasswordVerifier { 
   
   private final int MIN_LENGTH = 6;
   private StringBuilder psswrd; 
   private boolean criteriaMet;
   private boolean hasDigit; 
   private boolean hasUpper;  
   private boolean hasLower; 
   
   /**
      Constructor class no arg.
   */ 
   
   public PasswordVerifier() { 
      hasDigit = false; 
      hasUpper = false;   
      hasLower = false;
      criteriaMet = false;  
   } 
   
   /**
      The setPassword class sets passwrd field 
      @perma password The password with whichh the criteria will be applied to.
   */ 
   
   public void setPassword(String password) { 
      
      psswrd = new StringBuilder(password);
      hasDigit = false; 
      hasUpper = false;   
      hasLower = false;
      criteriaMet = false;   
   } 
   
   /**
      The getPassword class 
      @return passwrd toString
   */ 
   
   public void getPassword() { 
      System.out.println(psswrd.toString()); 
   } 
   
   /**
      The verify class checks to see if password meets criteria 
      @reurn criteriaMet The boolean status of the criteria being met 
   */ 
   
   public boolean verify() { 
   
      if(psswrd.length() < MIN_LENGTH)  
         return criteriaMet;
         
          
      
      for (int index = 0; index < psswrd.length(); index++) {
         
         if(Character.isDigit(psswrd.charAt(index)))
            hasDigit = true; 
         else if (Character.isUpperCase(psswrd.charAt(index))) 
            hasUpper = true;
         else if (Character.isLowerCase(psswrd.charAt(index)))
            hasLower = true; 
      } 
      
      if (hasDigit && hasUpper && hasLower) {
         criteriaMet = true; 
         return criteriaMet; 
      } 
      return criteriaMet; 
   }
}   

 
   
         
         
             
      
            
          