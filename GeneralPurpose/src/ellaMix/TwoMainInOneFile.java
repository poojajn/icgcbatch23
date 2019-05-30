package ellaMix;

class Parent
{
	public static void main(String[] args) 
	{
		System.out.println("parent main");
	}
}


public class TwoMainInOneFile extends Parent 
{

	public static void main(String[] args) 
	{
		
		System.out.println("child main");

	}

}
