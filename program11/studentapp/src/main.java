import java.sql.*; 
import java.util.Properties; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.util.Scanner; 

public class Main { 
    public static void main(String[] args) { 
        Properties props = new Properties(); 
        
        // Load DB properties 
        try (FileInputStream fis = new FileInputStream("db.properties")) { 
            props.load(fis); 
        } catch (IOException e) { 
            System.out.println("Error: Could not find db.properties file.");
            return; 
        } 

        String url = props.getProperty("db.url"); 
        String user = props.getProperty("db.user"); 
        String pass = props.getProperty("db.pass"); 

        // DB connection 
        try (Connection conn = DriverManager.getConnection(url, user, pass); 
             Scanner sc = new Scanner(System.in)) { 
            
            System.out.println("Connected to database successfully."); 
            StudentDAO dao = new StudentDAO(conn);  // Create DAO object 

            while (true) { 
                // CORRECTED: Combined into one line to fix the "unclosed string literal" error
                System.out.println("\n1. Insert Student\n2. Search Student\n3. Fetch All Students\n4. Update Student\n5. Delete Student\n6. Exit"); 
                
                System.out.print("Choose option: "); 
                int choice = sc.nextInt(); 
                sc.nextLine();  // Consume newline 

                switch (choice) { 
                    case 1: 
                        System.out.print("Enter name: "); 
                        String name = sc.nextLine(); 
                        System.out.print("Enter age: "); 
                        int age = sc.nextInt(); 
                        dao.insertStudent(name, age); 
                        break; 
                    case 2: 
                        System.out.print("Enter ID to search: "); 
                        int id = sc.nextInt(); 
                        dao.searchStudent(id); 
                        break; 
                    case 3: 
                        dao.fetchAllStudents(); 
                        break; 
                    case 4: 
                        System.out.print("Enter ID to update: "); 
                        int updateId = sc.nextInt(); 
                        sc.nextLine(); 
                        System.out.print("Enter new name: "); 
                        String newName = sc.nextLine(); 
                        System.out.print("Enter new age: "); 
                        int newAge = sc.nextInt(); 
                        dao.updateStudent(updateId, newName, newAge); 
                        break; 
                    case 5: 
                        System.out.print("Enter ID to delete: "); 
                        int deleteId = sc.nextInt(); 
                        dao.deleteStudent(deleteId); 
                        break; 
                    case 6: 
                        System.out.println("Exiting..."); 
                        return; 
                    default: 
                        System.out.println("Invalid option!"); 
                } 
            } 
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
}
 
 
