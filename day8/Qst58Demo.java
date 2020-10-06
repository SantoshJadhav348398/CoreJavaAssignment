package Excep;
import java.util.*;
public class Qst58Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String days[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		try {
			System.out.println("Entet the day to find : ");
			int index=sc.nextInt();
			System.out.println(days[index]);
		}
	catch(IndexOutOfBoundsException e) {
		System.out.println(e);
	}

}
}
