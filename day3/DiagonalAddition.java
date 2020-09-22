/*
Create an integer type 2-D array of	size [3X3].
Take the elements from the user and then
calculate the sum of the elements present in the diagonal
*/

import java.util.Scanner;
class DiagonalAddition
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter row value:");
		int n=sc.nextInt();
		int arr[][]=new int[n][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("enter no:");
				arr[i][j]=sc.nextInt();
			}
		}
		int sum1=0;
		int sum2=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
					sum1+=arr[i][j];
					
				if((i+j)==(n-1))
					sum2+=arr[i][j];
			}
		}
		System.out.println("Right Diognal Addition is:"+sum1);
		System.out.println("left Diognal Addition is:"+sum2);
		
				
	}
}