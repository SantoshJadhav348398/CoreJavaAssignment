class A
{
    static
    {
        System.out.println("A block");
    }
}
class B
{
    static
    {
        System.out.println("B block");
    }
}
class C
{
    static
    {
        System.out.println("C block");
    }
}
public class Q8 {
 public static void main(String[] args) {
     new A();
     new B();
     new C();
     
 }   
}
