//package CoreJavaAssignment;
//import java.util.*;
 class DemoArr{
    public void disp()
        {
            System.out.println("hello World");   
        }
}
public class Q2 {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        DemoArr a[] = new DemoArr[4];
        for(int i=0;i<4;i++)
        {
            DemoArr d=new DemoArr();
            //d.disp();
            a[i]=d;
        }      
        for(DemoArr i:a){
            i.disp();
        } 

    }
    
}
