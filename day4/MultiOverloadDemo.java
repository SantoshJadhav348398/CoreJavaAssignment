/*

36.	Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 


*/

import java.util.Scanner;

class MultiOverload{
	
		int Multiply(int no1, int no2){
			return no1*no2;
		}

		float Multiply(float no1, float no2, float no3){
			return no1*no2*no3;
		}

		double Multiply(double no1, int no2){
			return no1*no2;
		}

		//arr [5]=1,2,3,4,5=>je asel te

	
}

class MultiOverloadDemo{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		
		MultiOverload m = new MultiOverload();
		double x = 24;
		System.out.println(x);
		
		System.out.println("Multiplication int int: "+m.Multiply(2,3));
		System.out.println("Multiplication float*3: "+m.Multiply(2,3,4));
		System.out.println("Multiplication double int : "+m.Multiply(2D,3));
		//System.out.println("Multiplication: "+m.Multiply(2,3)); 
	}
	
}

