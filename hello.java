package com.scsvmv.javalab.hello;
import java.util.Date;
/*
* Hello class
* Demonstrates method overloading and command-line arguments
*/
public class Hello {
// Default constructor
public Hello() {
}
// Generic wish
public void wish() {
System.out.println("Hello World");
}
// Overloaded wish method with name parameter
public void wish(String name) {
System.out.println("Hello " + name);
}
// Wish with name and today's date
public void wishWithDate(String name) {
Date today = new Date();
System.out.println("Hello " + name + " | Date: " + today);
}
}