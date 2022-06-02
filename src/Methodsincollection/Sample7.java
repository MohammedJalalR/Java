package Methodsincollection;

import java.util.ArrayList;

public class Sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList L1 = new ArrayList();
		L1.add(10);
		L1.add("Hello");
		L1.add('A');
		L1.add(10.56);
		System.out.println("Before");
		System.out.println(L1);

		ArrayList L2 = new ArrayList();
		L2.add(10);
		L2.add("Bye");
		L2.add('A');
		L2.add(20.56);
		
		System.out.println(L2);
		System.out.println("After");

		L1.removeAll(L2);
		System.out.println(L1);
	}

}
