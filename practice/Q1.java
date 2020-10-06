import java.util.*;
class Q1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
    
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}