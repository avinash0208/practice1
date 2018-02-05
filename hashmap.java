package practice;
import java.util.*;

public class hashmap {
	public static void main(String[] args) {
		
      HashMap hm=new HashMap();  
      hm.put(100,"Banglore");  
      hm.put(101,"Jaipur");  
      hm.put(102,"Kolkata");
      hm.put(103,"Delhi");
      hm.put(104,"Mumbai"); 
      Set<Map.Entry<Integer,String>> mapping=hm.entrySet();
      for(Map.Entry<Integer,String> m:mapping){  
       System.out.println(m.getKey()+" "+m.getValue());  
      } 
     }  
}

