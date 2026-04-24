package shapes;
/**
* Interface representing geometric shapes.
* All shapes must implement methods to calculate area and volume.
*/
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