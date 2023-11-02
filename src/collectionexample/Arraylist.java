package collectionexample;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> rollno = new ArrayList<Integer>();
		rollno.add(1001);
		rollno.add(1005);
		rollno.add(1002);
		
		//now i want 1000 roolno
		rollno.add(2, 1000);
		System.out.println(rollno);
		System.out.println(rollno.contains(1002));
		Collections.sort(rollno);
		System.out.println(rollno);
		System.out.println(rollno.size());

		//to print
		for(int i=0;i<rollno.size();i++) {
			System.out.println(rollno.get(i));
		}
		//array stores duplicate values
		//in order to store unique values we have collection caled hashset

	}

}
