package java_activities;

public class StringExcercise_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brown fox jumps over the lazy dog.";
		
		// get a substring of the above string starting from index 10 and ending at index 26.
		String new_str = str.substring(10, 26);
		
		//Display the two string for comparison.
		System.out.println("old =" + str);
		System.out.println("new =" + new_str);

	}

}
