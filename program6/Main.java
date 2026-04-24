 
// File: Main.java 
public class Main { 
    public static void main(String[] args) { 
        UserRegistration app = new UserRegistration(); 
 
        // Scenario 1: Valid 
        app.processRegistration("JavaExpert", 30); 
 
        // Scenario 2: Invalid Age 
        app.processRegistration("JuniorDev", -1); 
 
        // Scenario 3: Invalid Username 
        app.processRegistration("", 20); 
} 
}
