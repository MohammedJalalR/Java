package Methodsincollection;

import java.util.ArrayList;

public class Sample3 {

	public static void main(String[] args) {

		ArrayList L1 = new ArrayList();
		L1.add(10);
		L1.add("Hello");
		L1.add('A');
		L1.add(10.56);
		System.out.println("Before");
		System.out.println(L1);

		ArrayList L2 = new ArrayList();
		L2.add(20);
		L2.add("Bye");
		L2.add('B');
		L2.add(20.56);
		System.out.println("After");

		L1.addAll(L2);
		System.out.println(L1);

	}

}
