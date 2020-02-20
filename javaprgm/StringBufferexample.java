package javaprgm;

public class StringBufferexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Naga";
		StringBuffer str=new StringBuffer(s);
		str.append("Vyshnavi");
		System.out.println(str);
		StringBuilder str1=new StringBuilder(s);
		str1.append("Vyshnavi");
		System.out.println(str1);

	}

}
