package practices;

public class Test implements Runnable
{
	public void run()
	{
		System.out.println("hi");
	}
	void start()
	{
		System.out.println("bye");
	}

	public static void main(String[] args) {
		
		
		Test t=new Test();
		Thread t2=new Thread(t);
		
		t2.start();
	}

}
