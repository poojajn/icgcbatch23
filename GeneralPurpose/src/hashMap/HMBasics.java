package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HMBasics 
{
	public static void main(String[] args) 
	{
		 HashMap<String, String> hm = new HashMap<String, String>();
		 
	        //add key-value pair to hashmap
		 
	        hm.put("first", "FIRST INSERTED");
	        hm.put("second", "SECOND INSERTED");
	        hm.put("third","THIRD INSERTED");
	        hm.put("null", "null");
	        hm.put("null", "nullnull");
	        System.out.println("Size of HashMap : "+ hm.size() );
	        hm.replace("null", "nullify");
	        System.out.println(hm);
	        
	        Set<String> s=hm.keySet();
	        Set<Map.Entry<String, String>> ss=hm.entrySet();
	        
	        //getting value for the given key from hashmap
	        
	        System.out.println("Value of second: "+hm.get("second"));
	        System.out.println("Is HashMap empty? "+hm.isEmpty());
	        hm.remove("second");
	        System.out.println("Value of second : "+hm.get("second"));
	        System.out.println(hm);
	        System.out.println("Size of the HashMap: "+hm.size());

	}

}
