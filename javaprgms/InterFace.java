package javaprgms;
interface runable
{
	void run();
}
interface Swimable extends runable
{
	double speed=34.9;
	//by default public static final
	//by default all the methods abstract
	//methods cannot be defined in interface
	void swim();
	void pause();
}
/*class Automobile
{

}*/
class WaterAuto /*extends Automobile*/ implements Swimable 
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run");
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("100 km/hr");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("pause for 30 mins");
		
	}
	
}






public class InterFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterAuto w=new WaterAuto();
		w.swim();
		w.pause();
		w.run();
		System.out.println(Swimable.speed);

	}

}
