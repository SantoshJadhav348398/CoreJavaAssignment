/*
Create a class Student with 2 data members rno and name.
Create one method setData() that takes roll number and student name as 
parameter and stores them in data members rno and name.
Create one more method showData() to print the data member values. 
Create another class (main class) StudentDemo that 
creates Student class object and calls setData() and showData() methods.
*/

import java.util.Scanner;
class Student
{
	private int rno;
	private String name;
	
	void SetData(int no,String sname)
	{
		rno=no;
		name=sname;
	}
	
	void ShowData()
	{
		System.out.println("RollNo:"+rno+" Name:"+name);
	}
}

class StudentDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter RollNo:");
		int RollNo=sc.nextInt();
		System.out.println("enter name:");
		String name=sc.next();
		
		Student s=new Student();
		s.SetData(RollNo,name);
		
		System.out.println("enter RollNo:");
		int rollNo=sc.nextInt();
		System.out.println("enter name:");
		String Name=sc.next();
		
		Student s1=new Student();
		s1.SetData(rollNo,Name);
		
		s.ShowData();
		s1.ShowData();
		
	}
}