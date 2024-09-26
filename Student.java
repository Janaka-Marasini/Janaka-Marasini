//Define a class Student with attributes: name, age, and grade.
//Write a parameterized constructor to initialize these attributes. 
//Create an object of the class and call a method showDetails() to display the student's information.
package com.orgs;

public class Student {
	String name;
	int age;
     char grade;
	
	public Student(String n,int a,char g) {
		name= n;
		age=a;
		grade=g;
		
	}
	
	public void showDetails() {
		System.out.println("Student name:"+name);
		System.out.println("Student age:"+age);
		System.out.println("student grade:"+grade);
	}
	public static void main(String[] args) {
		Student obj =new Student("Janaka",19,'A');
		obj.showDetails();
	}
	

}
