public class ArithOp { 
public static void add(int a, int b) { 
int result = a + b; 
System.out.println("Addition = " + result); 
} 
public static void sub(int a, int b) { 
int result = a - b; 
System.out.println("Subtraction = " + result); 
} 
public static void mul(int a, int b) { 
int result = a * b; 
System.out.println("Multiplication = " + result); 
} 
/** 
* Performs division of two integers. 
* Handles division by zero using try-catch. 
* 
* @param a Dividend 
* @param b Divisor 
*/ 
public static void div(int a, int b) { 
try { 
// Attempt to divide a by b 
int result = a / b; 
System.out.println("Division = " + result); 
} 
catch (ArithmeticException e) { 
// This block executes if b is zero 
System.out.println("Error: Cannot divide by zero."); 
} 
finally { 
// This block always executes regardless of exception 
System.out.println("Division operation finished."); 
} 
} 
} 
