import java.util.Scanner; 
import java.io.*; 
import java.nio.file.*; 
 
public class FileMenuSystem { 
    private static final String FILE_PATH = "userdata.txt"; 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        boolean running = true; 
 
        while (running) { 
            System.out.println("\n--- FILE MANAGER MENU ---"); 
            System.out.println("1. Read File"); 
            System.out.println("2. Write to File"); 
            System.out.println("3. Exit"); 
            System.out.print("Select an option: ");
  String choice = scanner.nextLine(); 
 
            switch (choice) { 
                case "1": 
                    readFile(); 
                    break; 
                case "2": 
                    writeFile(scanner); 
                    break; 
                case "3": 
                    System.out.println("Exiting program..."); 
                    running = false; 
                    break; 
                default: 
                    System.out.println("Invalid option. Please try again."); 
            } 
        } 
        scanner.close(); 
    } 
 
    private static void readFile() { 
        try { 
            File file = new File(FILE_PATH); 
            if (!file.exists()) { 
                System.out.println("Error: File does not exist yet. Write something first!"); 
                return; 
            } 
            String content = Files.readString(Path.of(FILE_PATH)); 
            System.out.println("\n--- FILE CONTENT ---"); 
            System.out.println(content); 
            System.out.println("---------------------"); 
        } catch (IOException e) { 
            System.err.println("Failed to read: " + e.getMessage()); 
        } 
    } 
 
    private static void writeFile(Scanner scanner) { 
        System.out.print("Enter text to save to file: "); 
        String data = scanner.nextLine(); 
 
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) { // 'true' enables appending 
            writer.write(data + System.lineSeparator()); 
            System.out.println("Success: Data saved to " + FILE_PATH); 
        } catch (IOException e) { 
            System.err.println("Failed to write: " + e.getMessage()); 
        } 
    } 
} 
 
