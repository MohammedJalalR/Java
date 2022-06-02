package mani;

import java.util.Scanner;

public class Revase_position {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		String no = sc.nextLine();
		String[] arr = no.split(" ");
		for (int i = arr.length-1 ; i>=0; i--)
		{
			System.out.print(rev(arr[i])+" ");
		}
		
	}
	public static String rev(String s2)
	
	{
		String s1="";
		for (int i = s2.length()-1; i>=0; i--)
		{
			s1=s1+s2.charAt(i);
		}
		return s1;
	}


}
