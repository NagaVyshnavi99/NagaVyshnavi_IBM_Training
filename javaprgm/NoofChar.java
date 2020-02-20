package javaprgm;

import java.util.Scanner;

public class NoofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//String s1=sc.nextLine();
		sc.close();
		char ch=' ';
		int len=str.length();
		int num=0,i,j;
		for(i=0;i<len;i++)
		{
			if(ch!=str.charAt(i))
			{
			ch=str.charAt(i);
			num=1;
			for(j=i+1;j<len;j++)
			{
			if(ch==str.charAt(j))
			{
				num++;
			}
			}
			System.out.println(" "+ch+"="+num);
			}
		}
		
		
		

	}

}
