package collectionexample;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

	public static void main(String[] args) {
		//stores in key value pair 
		HashMap<Integer,String> trainee= new HashMap<Integer,String>();
		trainee.put(-1, "Gobi");
		trainee.put(2, "chat");
		trainee.put(3, "samosa");
		trainee.put(6, ""); //"" = null
		trainee.put(4, "baramasala");
		trainee.put(5, "baramasala");//key cannot be duplicate but value can be duplicate
		
		System.out.println(trainee.get(2));
		System.out.println(trainee.containsKey(4));
		System.out.println(trainee);
		trainee.remove(3);
		System.out.println(trainee);
		//USING ENTRY SEARCH
		for(Map.Entry<Integer,String> entry: trainee.entrySet()){
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}
		
		//using key set
		for(int key:trainee.keySet()) {
			System.out.println(+key);
		}
		
	}

}
