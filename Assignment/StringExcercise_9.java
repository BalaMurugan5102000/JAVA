package java_activities;

public class StringExcercise_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "gibblegabbler";
		System.out.println("The given string is : "+ str);
		for(int i=0; i<str.length(); i++) {
			boolean unique = true;
			for(int j=0; j<str.length(); j++) {
				if(i != j && str.charAt(i) == str.charAt(j)) {
					unique = false;
					break;
				}
			}
			if(unique) {
				System.out.println("The first non repeated character in a string is :"+str);
				break;
			}
		}

	}

}
