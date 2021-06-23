package com.blogging.AbstractDemo;

public class Circle extends Shapes{
	
	int radius = 5;
	double area,pi=3.14;

	@Override
	public void area() {
		// TODO Auto-generated method stub
		area = pi*radius*radius;
		System.out.println("The area of Circle is : "+area);
		
	}

}
