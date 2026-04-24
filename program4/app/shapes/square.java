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
* Calculate area for a given side (double);
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