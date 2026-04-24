// File: UserRegistration.java 
public class UserRegistration { 
/** 
* Logic and Validation moved here (The Calling Method) 
*/ 
public void processRegistration(String username, int age) { 
        System.out.println(">>> Processing registration for: " + username); 
         
        try { 
            // Validation Logic (Moved here per request) 
            if (age < 0) { 
                throw new InvalidAgeException("Age cannot be negative (" + age + ")."); 
            } 
             
            if (username == null || username.trim().isEmpty()) { 
                throw new InvalidAgeException("Username is required."); 
            } 
 
            // If validation passes, call the registration/save action 
            registerUser(username, age); 
             
            System.out.println("STATUS: Success."); 
 
        } catch (InvalidAgeException e) { 
            // Handle Failure Scenario 
            System.err.println("STATUS: Failed - " + e.getMessage()); 
        } finally { 
            System.out.println("Finalizing request...\n"); 
        } 
    } 
 
    /** 
     * The simple action method 
     */ 
    private void registerUser(String username, int age) { 
        System.out.println("System: Saving " + username + " (Age: " + age + ") to database."); 
    } 
} 
