package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating arraylist
		List<String> al = new ArrayList<String>();
		
		//adding object to arraylist
		al.add("Rose");
		al.add("Sunflower");
		al.add("Rose");
		al.add(0,"Lilly");
		al.add(2,"Daisy");
		al.add("Marigold");
		al.add(6,"Tulip");
		al.add("Jasmine");
		al.add("Orchid");
		al.add("Lotus");
		al.add(5,"Lavender");
		
		//printing arraylist object
		System.out.println(al);
		System.out.println("Size of arraylist :"+ al.size());
		
		//removing object
		al.remove(5);
		//printing arraylist after remove
		System.out.println(al);
		System.out.println("Size of arraylist :"+ al.size());
		
		al.add("Lavender");
		al.add("Lotus");
		System.out.println(al);
		System.out.println("Size of arraylist :"+ al.size());
		System.out.println("element of index value is :"+ al.get(6));
		
		
		
	}

}
