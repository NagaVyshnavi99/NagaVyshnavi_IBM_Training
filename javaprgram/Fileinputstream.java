package javaprgram;
import java.io.FileInputStream;  
public class Fileinputstream {
	  public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("D:\\testout.txt");    
            int i=fin.read();  
            System.out.println((char)i);  //reading single character  
            int j=0;    
            while((j=fin.read())!=-1){    
             System.out.print((char)j);    //reading all characters
            }    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    

}
