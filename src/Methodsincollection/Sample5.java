package Methodsincollection;

import java.util.ArrayList;

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList L1=new ArrayList();
	    L1.add(10);
	    L1.add("Hello");
	    L1.add('A');
	    L1.add(10.56);
	    L1.add(true);
	    System.out.println("Before");
	    
	    System.out.println(L1);
	    L1.remove(1);
	    System.out.println("After");
	    System.out.println(L1);
	}

}
