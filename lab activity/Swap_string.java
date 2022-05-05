package java_activities;



public class Swap_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1 = "Rocky";
        String str2 = "Bala";
        System.out.println("Strings before swapping:"+ str1 +" "+ str2);
        
        str1 = str1 + str2;
        str2 = str1.substring(0,(str1.length()- str2.length()));
        str1 = str1.substring(str2.length());
        
        System.out.println("Strings after swapping:"+ str1 +" "+str2);
	}
}
