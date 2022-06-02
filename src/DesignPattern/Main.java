package DesignPattern;

class Sample {
	static Sample s1;
	int x = 10;

	static int count = 0;

	private Sample() {
		count++;
	}

	public static Sample getInstance() {
		if (count < 1) {
			s1 = new Sample();
		}
		return s1;
	}

	public static void setInstance(int y) {
		s1.x = y;
	}
}

public class Main {

	public static void main(String[] args) {

		Sample s2 = Sample.getInstance();
		System.out.println(s2.x);
		Sample s3 = Sample.getInstance();
		System.out.println(s3.x);
	     Sample.setInstance(100);
	     Sample s4= Sample.getInstance();
		System.out.println(s4.x);

	}

}
