public interface Shape { 
/** Constant value of PI */ 
double PI = 3.14159; 
/** 
* Calculate the area of the shape. 
* @return area as double 
*/ 
double area(); 
/** 
* Calculate the volume of the shape. 
* @return volume as double 
*/ 
double volume(); 
} 
2 ⃣ Square Class 
File: shapes/Square.java 
package shapes; 
/** 
* Class representing a square. 
* Implements the Shape interface. 
*/ 
public class Square implements Shape { 
/** Side length of the square */ 
protected double side; 
/** 
* Constructor to initialize square side 
* @param s side length 
*/ 
public Square(double s) { 
side = s; 
} 
/** 
* Calculate area of the square 
* @return side^2 
*/ 
public double area() { 
return side * side; 
} 
// ---------------------------- 
// Static overloaded methods 
// ---------------------------- 
/** 
* Calculate area for a given side (double) 
* @param s side length 
* @return area 
*/ 
public static double area(double s) { 
return s * s; 
} 
/** 
* Calculate area for a given side (int) 
* @param s side length 
* @return area 
*/ 
public static double area(int s) { 
return s * s; 
} 
/** 
* Square does not have volume 
* @return 0 
*/ 
public double volume() { 
return 0; 
} 
} 
3 ⃣ Cube Class 
File: shapes/Cube.java 
package shapes; 
/** 
* Cube class extends Square 
* Demonstrates use of super() and super.area() 
*/ 
public class Cube extends Square { 
/** 
* Constructor calls Square constructor 
* @param s side length 
*/ 
public Cube(double s) { 
super(s); // super() calls parent constructor 
} 
/** 
* Calculate surface area of cube 
* Uses one face area from Square 
* @return surface area 
*/ 
public double area() { 
double tmp = super.area(); // reuse Square area 
return 6 * tmp; 
} 
/** 
* Calculate cube volume 
* @return volume 
*/ 
public double volume() { 
return side * side * side; 
} 
} 
4 ⃣ Circle Class 
File: shapes/Circle.java 
package shapes; 
/** 
* Circle class implements Shape interface 
*/ 
public class Circle implements Shape { 
/** Radius of the circle */ 
protected double radius; 
/** 
* Constructor 
* @param r radius 
*/ 
public Circle(double r) { 
radius = r; 
} 
/** 
* Calculate area of the circle 
* @return PI * r^2 
*/ 
public double area() { 
return PI * radius * radius; 
} 
// ---------------------------- 
// Static overloaded method 
// ---------------------------- 
/** 
* Calculate area for a given radius 
* @param r radius 
* @return area 
*/ 
public static double area(double r) { 
return PI * r * r; 
} 
/** 
* Circle has no volume 
* @return 0 
*/ 
public double volume() { 
return 0; 
} 
} 
5 ⃣ Sphere Class 
File: shapes/Sphere.java 
package shapes; 
/** 
* Sphere class extends Circle 
* Demonstrates reuse of Circle area using super.area() 
*/ 
public class Sphere extends Circle { 
/** 
* Constructor calls Circle constructor 
* @param r radius 
*/ 
public Sphere(double r) { 
super(r); // super() call 
} 
/** 
* Calculate surface area of sphere 
* Reuses Circle's area method 
* @return surface area 
*/ 
public double area() { 
double tmp = super.area(); // circle area 
return 4 * tmp; 
} 
/** 
* Calculate volume of sphere 
* @return volume 
*/ 
public double volume() { 
return (4.0 / 3.0) * PI * radius * radius * radius; 
} 
} 
6 ⃣ Main Program 
File: app/ShapeDemo.java 
package app; 
// Import all classes from shapes package 
import shapes.*; 
/** 
* Main class to demonstrate shapes 
* Shows dynamic polymorphism and static overloading 
*/ 
public class ShapeDemo { 
public static void main(String[] args) { 
Shape s; 
// ---------------------------- 
// Dynamic polymorphism examples 
// ---------------------------- 
s = new Cube(3); 
System.out.println("Cube Area = " + s.area()); 
System.out.println("Cube Volume = " + s.volume()); 
s = new Sphere(2); 
System.out.println("Sphere Area = " + s.area()); 
System.out.println("Sphere Volume = " + s.volume()); 
// ---------------------------- 
// Static polymorphism examples 
// ---------------------------- 
System.out.println("Square Area (static) = " + Square.area(5)); 
System.out.println("Square Area (static int) = " + Square.area(6)); 
System.out.println("Circle Area (static) = " + Circle.area(4)); 
} 
}