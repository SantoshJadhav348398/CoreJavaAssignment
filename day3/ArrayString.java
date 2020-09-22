//Initialize one String type of array and print the elements using for each loop.

import java.util.Scanner;
class ArrayString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int size=sc.nextInt();
		String a[]=new String[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("enter character:");
			a[i]=sc.next();
		}
		System.out.print("entered String are:");
			
		for(String i:a)
		{
			System.out.print(i);
		}
	}
}