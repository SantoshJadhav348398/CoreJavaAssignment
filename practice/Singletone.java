public class Singletone {
   private static Singletone s=new Singletone();        //Existing object
   private Singletone()
   {
       System.out.println("private constructor");
   }
   void Show()
   {
       System.out.println("printing inside singletone");
   } 
   static Singletone Get()
   {
       return s;
   }
}
class Main
{
    public static void main(String[] args) {
        Singletone ref=Singletone.Get();
        ref.Show();
    }
}
