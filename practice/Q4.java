//package practice;
import java.util.*;
class MyClass
{
    private int a;
    private int b;
    private int c;
    public MyClass()
    {
        a=2;
        b=3;
        c=a+b;
        System.out.print("no args:");
    }
    public MyClass(int a)
    {
        this.a=a;
        b=3;
        c=a+b;
        System.out.print("one parameter:");
    }
    public MyClass(int a,int b)
    {
        this.a=a;
        this.b=b;
        c=a+b;
        System.out.print("two parameter:");
    }
    void Show()
    {
        System.out.println(c);
    }

}
public class Q4 {
    public static void main(String[] args) {
        MyClass m1=new MyClass();
        m1.Show();
        MyClass m2=new MyClass(2);
        m2.Show();
        MyClass m3=new MyClass(2,3);
        
        
        m3.Show();
        
    }    
}
