package javaprgm;


public class Joinmethod implements Runnable {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		Joinmethod r=new Joinmethod();
		Thread t=new Thread(r);
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t.start();
		t.join();
		/*try
		{
		t.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}*/
		t1.start();
		t2.start();
		

	}
	@Override
	public void run() {//r+ctrl+spacebar
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{
			try
			{
			Thread.sleep(500);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("i"+i);
		}
		
	}

}

