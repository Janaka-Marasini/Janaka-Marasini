
//Write a class Rectangle with attributes length and width. Use a constructor to set these values. 
//Add methods to calculate the area and perimeter of the rectangle. 
//Create an object to test your class.
package com.orgs;

public class Rectangle {
	int length;
	int width;
	public Rectangle(int l,int w) {
		length=l;
		width=w;		
	}
	public int calculateperimeter() {
		return 2 * (length + width);
		
		
		
	}
	public int calculatearea() {
		return length * width;
	}

	public static void main(String[] args) {
		Rectangle rectangle= new Rectangle(5,3);
	System.out.println("perimeter of Rectangle:"+rectangle.calculateperimeter());
	System.out.println("Area of Rectangle:"+rectangle.calculatearea());


	}

}
