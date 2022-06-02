package collection;

import java.util.Vector;

public class Sample1 
{
	public static void main(String[] args)
	{
		Vector v1= new Vector();
		v1.add(10);
		v1.add(20.56);
		v1.add(true);
		v1.add('a');
		v1.add(10);
		v1.add(20.56);
		v1.add(true);
		v1.add('a');
		v1.add(10);
		v1.add(20.56);
		v1.add(true);
		v1.add('a');
		System.out.println(v1);
        System.out.println(v1.capacity());
	}

}
