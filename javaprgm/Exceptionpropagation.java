package javaprgm;

public class Exceptionpropagation {
	void m(){  
	    int data=50/0;  
	    System.out.println(data);
	  }  
	  void n(){  
		  try
		  {
	    m(); 
		  }catch(Exception e){System.out.println("exception handled");}
	  }  
	  void p(){  
	  // try{  
	    n();  
	   //}
	  //catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
	   Exceptionpropagation obj=new Exceptionpropagation();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  

}
