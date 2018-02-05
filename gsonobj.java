package practice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

import com.google.gson.Gson;

public class gsonobj {
 
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = null;
		Gson gsonObj=new Gson();
		br = new BufferedReader(new FileReader("/home/avinash/a1.txt"));
        gson emp = gsonObj.fromJson(br, gson.class);
        System.out.println("Name: "+emp.getName());
        System.out.println("USN: "+emp.getUsn());
        System.out.println("Dept:"+emp.getDepartment());
        
        HashMap<String,Integer> a = new HashMap<>();
        a.put("USN", emp.getUsn());

        System.out.println(a.toString());
	}
	 
}
