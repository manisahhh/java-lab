import java.util.Scanner; 
import java.util.Vector; 
import java.util.Hashtable; 
import java.util.Iterator; 

/** 
* Represents a Student with registration number, name, and marks. 
* Demonstrates OOP concepts and uses Hashtable for subject → marks mapping. 
*/ 

class Student { 
int regNo; 
String name; 
Hashtable<String, Integer> marks; 

/** 
* Constructs a Student object with registration number and name. 
* Initializes the marks Hashtable. 
* 
* @param regNo registration number of the student 
* @param name  name of the student 
*/ 

Student(int regNo, String name) { 
this.regNo = regNo; 
this.name = name; 
marks = new Hashtable<>(); 
} 

/** 
* Adds a subject and its marks to the student's record. 
* 
* @param subject name of the subject 
* @param mark    marks obtained in the subject 
* @throws IllegalArgumentException if mark is negative or greater than 100 
*/ 

void addMarks(String subject, int mark) throws IllegalArgumentException { 
if (mark < 0 || mark > 100) { 
throw new IllegalArgumentException("Mark must be between 0 and 100."); 
} 
marks.put(subject, mark);  } 

/** 
* Calculates the average marks of the student

   * 
     * @return average of all marks as double 
     */ 
    double calculateAverage() { 
        int sum = 0; 
        for (int m : marks.values()) { 
            sum += m; 
        } 
        return marks.size() == 0 ? 0.0 : (double) sum / marks.size(); 
    } 

 
    /** 
     * Displays student details including registration number, name, subjects, and average marks. 
     */ 

    void display() { 
        System.out.println("RegNo: " + regNo); 
        System.out.println("Name: " + name); 
        System.out.println("Marks: " + marks); 
        System.out.println("Average: " + calculateAverage()); 
        System.out.println("----------------------"); 
    } 
} 
 
/** 
 * Menu-driven Student Management System. 
 * Features: 
 * - Register new student 
 * - Add marks 
 * - Search student by registration number 
 * - Display all students 
 * - Unregister student 
 */
