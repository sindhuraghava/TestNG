package collectionexample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Studenthashmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> student= new HashMap<Integer,String>();
		student.put(1, "67");
		student.put(2, "89");
		student.put(3, "90");
		student.put(4, "78");
		String max = Collections.max(student.values());
		System.out.println(max);
		for(Map.Entry<Integer,String> entry: student.entrySet()){
			if(entry.getValue()== max) {
				System.out.println(entry.getKey());
			}
		}
		
	}

}
