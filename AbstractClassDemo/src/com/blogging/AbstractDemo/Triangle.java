package com.blogging.AbstractDemo;

public class Triangle extends Shapes{

	float b = 6,h = 12,area;
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		area = (b*h)/2;
		System.out.println("The area of Triangle is : "+area);
		
		
		
	}

}
