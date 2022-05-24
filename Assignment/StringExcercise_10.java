package java_activities;

import java.util.ArrayList;
import java.util.List;

public class StringExcercise_10 {
	
	static void checkExistance(String str, String str_to_search) {
		int chk = 0;
		char chhr = ' ';
		int[] a = new int[Character.MAX_VALUE + 1];
		
		for(int i=0; i<str_to_search.length(); i++) {
			chhr = str.charAt(i);
			++a[chhr];
		}
		for (int i=0; i<str_to_search.length(); i++) {
			chhr = str_to_search.charAt(i);
			if (a[chhr] >= 1)
				chk = 1;
		}
		if (chk == 1)
			System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Rabbit");
		list.add("Bribe");
		list.add("Dog");
		System.out.println("The given strings are : ");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)+ " ");
		}
		System.out.println("\nThe given word is : bib ");
		System.out.println("\nthe strings containing all the letters of the given words are:");
		for(int j=0; j<list.size(); j++) {
			checkExistance(list.get(j), "bib");
		}

	}

}
