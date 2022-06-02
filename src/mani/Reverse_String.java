package mani;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		String no = sc.nextLine();
		String[] arr = no.split(" ");
		for (int i = arr.length-1 ; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
