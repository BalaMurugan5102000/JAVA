package java_activities;

import java.util.Scanner;

public class Swap_without {

	public static void main(String[] args) {
		int x;
		int y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values:");
		x = s.nextInt();
		y = s.nextInt();
		
		x = x+y;
		y = x-y;
		x= x-y;
		System.out.println("x="+ x+ " and y="+y);
	}
}
