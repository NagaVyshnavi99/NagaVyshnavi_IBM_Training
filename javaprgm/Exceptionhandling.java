package javaprgm;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	int a[]= {1,2,3};
	int i;
	System.out.println("program execution start");
	try
	{
		for(i=0;i<5;i++)
		{
		System.out.println(a[i]);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally//executes even if there is an exception or not
	{
	System.out.println("program execution end");
	}
	}
	
}
