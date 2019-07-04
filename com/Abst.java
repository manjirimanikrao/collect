package com;

public class Abst {
	 public static void main (String[] args)  
	 { 
    Shape rect = new Rectangle(2,3, "Rectangle"); 
    System.out.println("Area of rectangle: " + rect.area()); 
    rect.moveTo(1,2); 
    System.out.println(" "); 
    Shape circle = new Circle(2, "Cicle"); 
    System.out.println("Area of circle: " + circle.area()); 
    circle.moveTo(2,4); 
	 }
}
