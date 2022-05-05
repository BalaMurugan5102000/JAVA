package Com;

import java.util.Scanner;

public class NestedExceptionEx {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		
		try {
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println(x+y);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
