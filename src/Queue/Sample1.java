package Queue;

import java.util.PriorityQueue;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue P1=new PriorityQueue();
		P1.add(10);
	    P1.add(20);
	    P1.add(30);
	    P1.add(40);
	    P1.add(50);
	    System.out.println(P1);
	    System.out.println("***Polling***");
	    System.out.println(P1.poll());
	    System.out.println(P1);
	    System.out.println("***Polling***");
	    System.out.println(P1.poll());
	    System.out.println(P1); 
	    System.out.println("***Peeking***");
	    System.out.println(P1.peek());
	    System.out.println(P1);
	    System.out.println(P1.peek());
	    System.out.println(P1);

	}

}
