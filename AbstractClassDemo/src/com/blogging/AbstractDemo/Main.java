package com.blogging.AbstractDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle();
		t.b = 4;
		t.h = 13;
		t.area();
		
		Square s = new Square();
		s.s = 12;
		s.area();
		
		Circle c = new Circle();
		c.radius = 5;
		c.area();
		
		Shapes shape = new Triangle();
		System.out.println("\nCalled area method of triangle through abstract class reference");
		shape.area();//It takes the values present in the triangle class
		shape.print();
		
		Shapes shape1 = new Square();
		System.out.println("Called area method of square through abstract class reference");
		shape1.area();
		
		Shapes shape2 = new Circle();
		System.out.println("Called area method of circle through abstract class reference");
		shape2.area();
		

	}

}
