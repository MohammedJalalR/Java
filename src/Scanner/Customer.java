package Scanner;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur choice");
		System.out.println("1.shoes");
		System.out.println("2.bags");
		int input = sc.nextInt();

		Nike n1 = new Nike();

		switch (input) {

		case 1:
			System.out.println(n1.shoes());

			break;
		case 2:
			System.out.println(n1.bags());
			break;
		default:
			System.out.println("Invalid ");
			break;
		}  
	}

}