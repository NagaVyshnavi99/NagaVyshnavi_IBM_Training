package javaprgms;

import java.util.*;
public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(20);
		ArrayList<Integer> brr=new ArrayList<>();
		brr.add(30);
		brr.add(40);
		arr.addAll(brr);
		System.out.println(arr);
		arr.remove(3);
		System.out.println(arr);
		Iterator itr=arr.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}
	}

}
