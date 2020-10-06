class DemoOb
{
    int a;

    void Get(int a)
    {
        this.a=a;
    }
    void Show()
    {
        System.out.println(a);
    }
}
public class Q6 {

    public static void main(String[] args) {
        DemoOb o1=new DemoOb();
        DemoOb o2=o1;
        o1.Get(10);
        o1.Show();
        o2.Get(20);
        o2.Show();

    }

    
}
