package practices;

class Parent
{
  public  void m1()
  {
	  System.out.println("hi");
  }
}
class D extends  Parent
{
	public void m1()
	{
		System.out.println("hello");
	}
}
public class MOR
{
	public static void main(String[] args)
	{
		Parent mo=new Parent();
		    mo.m1();
		   
		    D d=new D();
            d.m1();
     //       mo.m1();
            Parent p=new D();
            mo.m1();
            
	}

}
