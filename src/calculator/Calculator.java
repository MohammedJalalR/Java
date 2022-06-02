package calculator;

import java.util.Scanner;

public class Calculator {

	static Scanner sc = new Scanner(System.in);

	static void add() {

		System.out.println("***ADDITION***");
		System.out.println("Enter the value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("The addition of a and b is " + c);

	}

	static void sub() {
		System.out.println("***SUBRACTION***");
		System.out.println("Enter the value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a - b;
		System.out.println("The subraction of a and b is " + c);
	}

	static void mul() {
		System.out.println("***MULTIPLICATION***");
		System.out.println("Enter the value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a * b;
		System.out.println("The multiplication of a and b is " + c);
	}

	static void div() {
		System.out.println("***DIVISION***");
		System.out.println("Enter the value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a / b;
		System.out.println("The division of a and b is " + c);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("***Select your choice***");
		System.out.println("1.add");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.div");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			add();
           break;
		case 2:
			sub();
          break;
		case 3:
			mul();
           break;
		case 4:
			div();

			break;

		default:
			System.out.println("Invalid methods");
			break;
		}

	}

}
