class A
{
    int a;
    static int aa;
    public void Get(int a,int aa)
    {
        this.a=a;
        A.aa=aa;
    }
    public void Show()
    {
        System.out.println(a);
        System.out.println(aa);
    }
}
class B
{
    int b;
    static int bb;
    public void Get(int b,int bb)
    {
        this.b=b;
        B.bb=bb;
    }
    public void Show()
    {
        System.out.println(b);
        System.out.println(bb);
    }
}
class C 
{
    int c;
    static int cc;
    public void Get(int c,int cc)
    {
        this.c=c;
        C.cc=cc;
    }
    public void Show()
    {
        System.out.println(c);
        System.out.println(cc);
    }
}

public class Q7 {
    public static void main(String[] args) {
        A obj1=new A();
        obj1.Get(1,2);
        obj1.Show(); 
        
        B obj2=new B();
        obj2.Get(3,4);
        obj2.Show();

        C obj3=new C();
        obj3.Get(5,6);
        obj3.Show();
    }
    
}
