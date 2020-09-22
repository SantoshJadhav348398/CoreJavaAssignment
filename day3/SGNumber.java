// Write a program to fine the smallest and greatest number present in the
// array of integer type.

import java.util.Scanner;

class SGNumber
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of array");
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				System.out.println("enter the no:");
				arr[i]=sc.nextInt();
			}
			int max=0;
			int min=arr[0];
			for(int i=0;i<n;i++)
			{
				if(max < arr[i])
					max=arr[i];
				if(min > arr[i])
					min=arr[i];
			}
			
			System.out.println("Largest no is:" +max);
			System.out.println("smallest no is:" +min);
				
				
		}
}