package javaprgram;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Serial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			  //Creating the object  
			  Serializableinterface s1 =new Serializableinterface(211,"ravi");  
			  //Creating stream and writing the object  
			  FileOutputStream fout=new FileOutputStream("D:\\f.txt");  
			  ObjectOutputStream out=new ObjectOutputStream(fout);  
			  out.writeObject(s1);  
			  out.flush();  
			  //closing the stream  
			  out.close();  
			  System.out.println("success");  
			  }catch(Exception e){System.out.println(e);}  

	}

}