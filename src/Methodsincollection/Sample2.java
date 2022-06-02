package Methodsincollection;

import java.util.ArrayList;

public class Sample2 {

	public static void main(String[] args) {

		ArrayList L1 = new ArrayList();
		L1.add(10);
		L1.add("Hello");
		L1.add('A');
		L1.add(10.56);
		L1.add(true);
		System.out.println("before");
		System.out.println(L1);
		System.out.println("After");
		L1.add(1, "Bye");
		System.out.println(L1);

	}

}
