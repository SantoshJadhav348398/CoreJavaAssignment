//package practice;
import java.util.*;
class Shape{
    private int width;
    private int height;

    public void Get(int a,int b)
    {
        this.width=a;
        this.height=b;
    }
    public void Show()
    {
        System.out.println(width*height);
    }
    
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int width=sc.nextInt();
        int height=sc.nextInt();
        Shape s=new Shape();
        s.Get(width,height);
        s.Show();
    }
    
}
