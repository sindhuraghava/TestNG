package demo;

public class Arrayexample {

	public static void main(String[] args) {
		double mylist[] = {1.2,6.7,8.0,7,9.8};
		for( int i =0;i< mylist.length;i++) {      //.length is similar to mylist[5]
		System.out.println("my list is "+mylist[i]);
		}
		 double total=0;
		for(int i = mylist.length-1;i>=0;i--) {
			//System.out.println("mylist"+mylist[i]);
			total=total+mylist[i];
		}
		System.out.println(total);   
	}

}
