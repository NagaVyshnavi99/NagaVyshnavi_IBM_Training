package javaprgm;
class A
{
	
}

public class ByRunnable extends A implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByRunnable r=new ByRunnable();
		Thread t=new Thread(r);
		t.start();
		Thread t1=new Thread(r);
		t1.start();
		

	}
	@Override
	public void run() {//r+ctrl+spacebar
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
		
	}

}
