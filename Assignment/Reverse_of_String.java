package java_activities;
import java.util.Scanner;

public class Reverse_of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_of_String  rev= new Reverse_of_String();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = s.nextLine();
		System.out.println("Reverse of a String is : "+ rev.reverse(str));
	}
	static String reverse(String s) {
		String rev = " ";
		for(int j=s.length();j>0; --j) {
			rev = rev+(s.charAt(j-1));
		}
		return rev;
	}
}
