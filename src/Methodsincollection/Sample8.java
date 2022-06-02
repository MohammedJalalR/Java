package Methodsincollection;

import java.util.ArrayList;

public class Sample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList L1=new ArrayList();
	    L1.add(10);
	    L1.add("Hello");
	    L1.add('A');
	    L1.add(10.56);
	    L1.add(true);
	    for (int i = 0; i <L1.size(); i++) {
	    	
	    	System.out.println(L1.get(i));
			
		}
	}

}
