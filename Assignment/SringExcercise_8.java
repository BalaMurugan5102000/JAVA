package java_activities;

import java.util.*;

public class SringExcercise_8 {
	
	static final int NOOFCHARS = 256;
	static char get2ndmostFreq(String str1) {
		
		int[] ctr = new int[NOOFCHARS];
		int i;
		for(i=0; i<str1.length(); i++)
			(ctr[str1.charAt(i)]) ++;
		
		int ctr_first = 0, ctr_second = 0;
		for(i=0; i<NOOFCHARS; i++) {
			if(ctr[i] > ctr[ctr_first]) {
				ctr_second = ctr_first;
				ctr_first = i;
			}
			else if(ctr[i] > ctr[ctr_second] && ctr[i] != ctr[ctr_first])
				ctr_second = i;
		}
		return(char) ctr_second;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Successes";
		System.out.println("The given string is :" +str1);
		char res = get2ndmostFreq(str1);
		if(res != '\0')
			System.out.println("The second most frequent char in the string : "+ res);
		else
			System.out.println("No second most frequent char found in the string.");	
	}
}
