class Emp
{
    private static int cnt;


    public static int Get()
    {
        return cnt;
    }

    public static void Set(int a)
    {
       cnt=a;
    }
}
class Q5
{
    public static void main(String[] args) {
        Emp.Set(10);
        System.out.println(Emp.Get());
    }
}