import java.sql.*; 
// Data Access Object (DAO) for Student table 
public class StudentDAO { 
private Connection conn; 
// Constructor receives DB connection 
public StudentDAO(Connection conn) { 
this.conn = conn; 
} 
// Insert a student 
public void insertStudent(String name, int age) throws SQLException { 
String sql = "INSERT INTO student (name, age) VALUES (?, ?)"; 
try (PreparedStatement ps = conn.prepareStatement(sql)) { 
ps.setString(1, name); 
ps.setInt(2, age); 
int rows = ps.executeUpdate(); 
System.out.println(rows + " student inserted."); 
} 
} 
// Search student by ID 
public void searchStudent(int id) throws SQLException { 
        String sql = "SELECT * FROM student WHERE id=?"; 
        try (PreparedStatement ps = conn.prepareStatement(sql)) { 
            ps.setInt(1, id); 
            try (ResultSet rs = ps.executeQuery()) { 
                if (rs.next()) { 
                    System.out.println("ID: " + rs.getInt("id")); 
                    System.out.println("Name: " + rs.getString("name")); 
                    System.out.println("Age: " + rs.getInt("age")); 
                } else { 
                    System.out.println("Student not found."); 
                } 
            } 
        } 
    } 
 
    // Fetch all students 
    public void fetchAllStudents() throws SQLException { 
        String sql = "SELECT * FROM student"; 
        try (Statement stmt = conn.createStatement(); 
             ResultSet rs = stmt.executeQuery(sql)) { 
 
            System.out.println("\n--- All Students ---"); 
            while (rs.next()) { 
                System.out.println("ID: " + rs.getInt("id") + 
                                   ", Name: " + rs.getString("name") + 
                                   ", Age: " + rs.getInt("age")); 
            } 
        } 
    } 
 
    // Update student details by ID 
    public void updateStudent(int id, String name, int age) throws SQLException { 
        String sql = "UPDATE student SET name=?, age=? WHERE id=?"; 
        try (PreparedStatement ps = conn.prepareStatement(sql)) { 
            ps.setString(1, name); 
            ps.setInt(2, age); 
            ps.setInt(3, id); 
            int rows = ps.executeUpdate(); 
            System.out.println(rows + " student updated."); 
        } 
    } 
 
    // Delete student by ID 
    public void deleteStudent(int id) throws SQLException { 
        String sql = "DELETE FROM student WHERE id=?"; 
        try (PreparedStatement ps = conn.prepareStatement(sql)) { 
ps.setInt(1, id); 
int rows = ps.executeUpdate(); 
System.out.println(rows + " student deleted."); 
} 
} 
} 

 
