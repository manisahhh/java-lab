package operations;

public class BasicOperations {

private float num1;
private float num2;
// Constructor for float values
public BasicOperations(float num1, float num2) {
this.num1 = num1;
this.num2 = num2;
}
// Overloaded constructor for int values
public BasicOperations(int num1, int num2) {
// Convert ints to float
this.num1 = (float) num1;
this.num2 = (float) num2;
}
public void performOperations() {
System.out.println("--- Basic Arithmetic ---");
System.out.println("Addition: " + (num1 + num2));
System.out.println("Subtraction: " + (num1 - num2));
System.out.println("Multiplication: " + (num1 * num2));
if (num2 != 0) {
System.out.println("Division: " + (num1 / num2));
System.out.println("Modulus: " + (num1 % num2));
} else {
System.out.println("Division and Modulus: Cannot divide by zero");
}
System.out.println("\n--- Math Class Methods ---");
System.out.println("Absolute value of num1: " + Math.abs(num1));
System.out.println("Maximum: " + Math.max(num1, num2));
System.out.println("Minimum: " + Math.min(num1, num2));
System.out.println("Power (num1^num2): " + Math.pow(num1, num2));
System.out.println("Square root of num1: " + Math.sqrt(num1));
System.out.println("Rounded num1: " + Math.round(num1));
System.out.println("Floor of num1: " + Math.floor(num1));
System.out.println("Ceil of num1: " + Math.ceil(num1));
System.out.println("Random number (0-1): " + Math.random());
}
}