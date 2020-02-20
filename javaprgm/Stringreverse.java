package javaprgm;
import java.util.*;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str="Vyshnavi";
		char temp;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		int len=str.length();
		char str1[]=str.toCharArray();
		int i,j;
		j=len-1;
		for(i=0;i<=(len/2)-1;i++)
		{
			temp=str1[i];
			str1[i]=str1[j];
			str1[j]=temp;
			j--;
		}
		str1.toString();
		System.out.println(str1);

	}

}
