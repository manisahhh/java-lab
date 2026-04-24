// Importing required Swing and AWT libraries 
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
// Creating a class that extends JFrame (window)  
// and implements ActionListener (for button click handling) 
public class LoginPage extends JFrame implements ActionListener { 
// Declaring GUI components 
JLabel userLabel, passLabel;       
JTextField userText;               
JPasswordField passText;           
JButton loginButton;               
// Constructor to set up the GUI 
LoginPage() { 
setTitle("Login Page");                  
setSize(350, 200);                      
setLayout(null);                        
// Labels for username and password 
// Text field for username input 
// Password field (hides input) 
// Login button 
// Set window title 
// Set window size 
// Use absolute positioning 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close app on exit 
// Username Label 
        userLabel = new JLabel("Username:"); 
        userLabel.setBounds(30, 30, 80, 25);    // Set position and size 
        add(userLabel);                         // Add to frame 
 
        // Username Text Field 
        userText = new JTextField(); 
        userText.setBounds(120, 30, 150, 25); 
        add(userText); 
 
        // Password Label 
        passLabel = new JLabel("Password:"); 
        passLabel.setBounds(30, 70, 80, 25); 
        add(passLabel); 
 
        // Password Field 
        passText = new JPasswordField(); 
        passText.setBounds(120, 70, 150, 25); 
        add(passText); 
 
        // Login Button 
        loginButton = new JButton("Login"); 
        loginButton.setBounds(120, 110, 100, 30); 
        loginButton.addActionListener(this); // Register button click event 
        add(loginButton); 
 
        setVisible(true); // Make the frame visible 
    }
// This method is called when the button is clicked 
    public void actionPerformed(ActionEvent e) { 
        // Get entered username 
        String username = userText.getText(); 
 
        // Get entered password (converted from char array to String) 
        String password = new String(passText.getPassword()); 
 
        // Simple validation (hardcoded values) 
        if (username.equals("admin") && password.equals("1234")) { 
            // Show success message 
            JOptionPane.showMessageDialog(this, "Login Successful!"); 
        } else { 
            // Show error message 
            JOptionPane.showMessageDialog(this, "Invalid Username or Password"); 
        } 
    } 
 
// Main method - entry point of the program 
public static void main(String[] args) { 
new LoginPage(); // Create and display the login page 
} 
}
