package collection;


import java.util.PriorityQueue;

public class Sample2 {

	public static void main(String[] args) {
		PriorityQueue l1 = new PriorityQueue();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println("before");
		System.out.println(l1);
		System.out.println("***polling***");
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println("***peeking***");
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1);

		

	}

}