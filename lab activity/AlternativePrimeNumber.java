package java_activities;
import java.util.Scanner;
public class AlternativePrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n;
     int status = 1;
     int num = 4;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the value of n :");
     n = s.nextInt();
     if(n>=1) {
    	 System.out.println("First " + num + " prime numbers are :");
    	 System.out.println(2); 
     }
     for(int i=2; i<=n; ) {
    	 for(int j=2; j<=Math.sqrt(num); j++) {
    		 if(num % j == 0) {
    			 status = 0;
    			 break;
    		 }
    	 }
    	 if(status != 0) {
    		 System.out.println(num);
    		 i++;
    	 }
    	 status = 1;
    	 num++;
     }
	}

}
