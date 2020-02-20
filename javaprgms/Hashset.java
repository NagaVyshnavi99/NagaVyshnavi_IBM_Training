package javaprgms;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Varun");
       System.out.println(set);		
       set.remove("Ravi");
       System.out.println(set);		
       HashSet<String> set1=new HashSet<String>();
       set1.add("Ravi");
		set1.add("Ashok");
		set1.add("Deepak");
		set.addAll(set1);
		System.out.println(set);		
		set.removeAll(set1);  
        System.out.println("After invoking removeAll() method: "+set);  
        //Removing elements on the basis of specified condition  
        set.removeIf(str->str.contains("Vijay"));    
        System.out.println("After invoking removeIf() method: "+set);  
        //Removing all the elements available in the set  
        set.clear();  
        System.out.println("After invoking clear() method: "+set);  
       

	}

}
