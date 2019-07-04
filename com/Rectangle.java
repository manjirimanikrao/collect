package com;
class Rectangle extends Shape  
{ 
   
 int length, width; 
   
 // constructor 
 Rectangle(int length, int width, String name) 
 { 
       
     super(name); 
     this.length = length; 
     this.width = width; 
 } 
   
 @Override
 public void draw()  
 { 
     System.out.println("Rectangle has been drawn ");  
 } 
   
 @Override
 public double area()  
 { 
     return (double)(length*width); 
 } 
}  
