package java_activities;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLab{
	
	public static void main(String[]args) {
		List<String> al = new ArrayList<String>();
		al.add("Fortuner");
		al.add("Ciaz");
		al.add("Civic");
		al.add("Range rover");
		al.add("Jaguar");
		al.add("Polo");
		al.add("City");
		
		String element = al.get(3);
		System.out.println("Get index :" +element);
		System.out.println("Array list is :" + al.isEmpty());
		
		String element1 = al.remove(4);
		System.out.println("Remove index: "+ element1);
		System.out.println("traversing using for loop");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}