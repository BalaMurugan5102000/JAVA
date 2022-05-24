package java_activities;

public class StringExcersie_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Stephen Edwin King";
		String b = "Walter Winchell";
		String c = "Mike Royko";
		
		//Any of the above Strings are equal to one another
		boolean equals1 = a.equals(b);
		boolean equals2 = b.equals(c);
		
		//display the results of the equality checks.
		System.out.println("\"" + a + "\" equals \"" + b + "\"?" + equals1);
		System.out.println("\"" + a + "\" equals \"" + c + "\"?" + equals2);

	}

}
