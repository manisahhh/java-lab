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