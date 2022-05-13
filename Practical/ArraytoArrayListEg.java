package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArrayListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
		al.add("Rose");
		al.add("Sunflower");
		al.add("Lilly");
		al.add("Daisy");
		al.add("Marigold");
		al.add("Tulip");
		al.add("Jasmine");
		
		System.out.println("List to Array");
		String [] arr = al.toArray(new String[al.size()]);
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println("Array to List");
		List<String> all = new ArrayList<String>();
		all = Arrays.asList(arr);
		System.out.println(all);
	}
}
