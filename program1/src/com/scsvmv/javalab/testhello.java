package com.scsvmv.javalab;
import com.scsvmv.javalab.hello.Hello;
/*
 * TestHello class
 * Demonstrates passing command-line arguments
 */
public class TestHello {
public static void main(String[] args) {

Hello simpleHello = new Hello();
simpleHello.wish();

com.scsvmv.javalab.hello.Hello h=
  new com.scsvmv.javalab.hello.Hello();

if(args.length>0) {
h.wish(args[0]); 
h.wishWithDate(args[0]);
} else {
System.out.println("Usage:");
System.out.println("java com.scsvmv.javalab.TestHello <name>");
System.out.println("Example:");
System.out.println("java com.scsvmv.javalab.TestHello Student");
}
}
}