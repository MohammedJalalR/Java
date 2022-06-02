package otp;

public class Sample {

	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			double x = Math.random() * 10000;
			int y = (int) x;
			if(y>=1000)
			{
			System.out.println(y);
			}
		}

	}

}
