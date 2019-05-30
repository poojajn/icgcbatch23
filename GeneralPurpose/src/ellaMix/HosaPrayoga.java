package ellaMix;

class Aa
{
        static int a=10;
        static void disp()
        {
                 //int a=10;
                System.out.println(a);
        }        
}

abstract class HangaSumne extends Aa
{
        abstract void m1();
}
class B extends HangaSumne
{
	void m1()
    {
       System.out.println("hello");
    }
}

public class HosaPrayoga
{
     public static void main(String[] args) 
     {               
        B b=new B();
        b.m1();
        Aa.disp();
        System.out.println(Aa.a);

     }
}
