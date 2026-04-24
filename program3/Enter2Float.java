import operations.BasicOperations;
public class Enter2Float {
public static void main(String[] args) {
if (args.length != 2) {
System.out.println("Usage: java Enter2Float ");
return;
}
try {
float num1 = Float.parseFloat(args[0]);
float num2 = Float.parseFloat(args[1]);
// Using float constructor
BasicOperations obj1 = new BasicOperations(num1, num2);
obj1.performOperations();
// Using int constructor
BasicOperations obj2 = new BasicOperations(10, 3);
obj2.performOperations();
} catch (NumberFormatException e) {
System.out.println("Please enter valid float numbers.");
}
}
}
