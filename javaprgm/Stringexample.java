package javaprgm;

public class Stringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="Helloworld";
   System.out.println(str.charAt(9));
   System.out.println(str.codePointAt(3));
   System.out.println(str.concat("Hi"));
   String str1="Sachin";
   str1=str1.concat("Tendulkar");
   System.out.println(str1);
   StringBuffer s1=new StringBuffer("str1");
   System.out.println(s1);
   
	}

}
