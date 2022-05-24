package java_activities;

public class StringExcercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Stephen Edwin King";
		String b = "Walter Winchell";
		String c = "Mike Royko";
		
		
		boolean equals1 = a.equalsIgnoreCase(b);
		boolean equals2 = a.equalsIgnoreCase(c);
		
		System.out.println("\"" + a + "\" equals \"" + b + "\"?" + equals1);
		System.out.println("\"" + a + "\" equals \"" + c + "\"?" + equals2);

	}

}
