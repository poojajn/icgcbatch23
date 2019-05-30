package recursions;

public class FibRec 
{

	public static void main(String[] args) 
	{
		System.out.print(0+" ");
		System.out.print(1+" ");
		rm(0,1,10);
	}
	
	public static void rm(int i,int j, int count)
	{
		if(count==0)
		{
			return;
		}
		
		int k=i+j;
		System.out.print(k+" ");
		i=j;
		j=k;
		rm(i,j,count-1);
	}

}
