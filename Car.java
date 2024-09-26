// Create a class Car with attributes: make, model, and year.
//Write a constructor to initialize these attributes and a method displayDetails() 
//to print the car's details.
package com.orgs; 

public class Car {
	String make;
	String model;
	int year;
	//constructor to initialize the attributes
	public Car(String m,String mod,int y) {
		make=m;
		model=mod;
		year=y;
	}
	 public void displayDetails() {
		 System.out.println("make:"+make);
		 System.out.println("model:"+model);
		 System.out.println("year:"+year);
	 }
	
	public static void main(String[] args) {
		Car obj = new Car("Toyoto","camry",2020);
		obj.displayDetails();

	}

}
