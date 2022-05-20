package java_activities;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveThirdElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("AUDI");
		listStrings.add("BMW");
		listStrings.add("BUGATTI");
		listStrings.add("FORD");
		listStrings.add("HONDA");
		listStrings.add("HYUNDAI");
		
		System.out.println(listStrings);
		listStrings.remove(2);
		
		System.out.println("After removing third element from the list:\n"+listStrings);
		

	}

}
