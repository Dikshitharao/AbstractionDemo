package com.blogging.AbstractDemo;

public class Square extends Shapes {
	
	int s = 5, area;

	@Override
	public void area() {
		// TODO Auto-generated method stub
		area = s*s;
		System.out.println("The area of Square is : "+area);
		
	}

}
