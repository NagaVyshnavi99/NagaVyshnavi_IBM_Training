
package com;
import java.util.*;

public class factorial {
	int n;
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}else
		{
			return n*fact(n-1);
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num,factorial;
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      sc.close();
      factorial=fact(num);
      System.out.println(factorial);
	}

}
