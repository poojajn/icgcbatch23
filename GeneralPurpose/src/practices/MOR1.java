package practices;


class ADI
{
	public static void m1()
	{
		System.out.println("hi");
	}
}

class ADI1 extends ADI
{
	public static  void m1()
	{
		System.out.println("hello");
	}
}
public class MOR1 {

	public static void main(String[] args)
	{
		ADI t=new ADI();
	    t.m1();
	    
	    
	    ADI1 t1=new ADI1();
	    t1.m1();
	    t.m1();

	    ADI t2=new ADI1();
	    t2.m1();
	}

}

