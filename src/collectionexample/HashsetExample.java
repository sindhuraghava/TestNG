package collectionexample;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample{

	public static void main(String[] args) {
		HashSet<String> trainee = new HashSet<>();
		trainee.add("Menu");
		trainee.add("action");
		trainee.add("Menu");
		trainee.remove("action");
		trainee.add("action");// which does not follow sequential manner also   it is possible in array but not in hashset
		System.out.println(trainee);
		Iterator<String> itr = trainee.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			}
		
	}

}
