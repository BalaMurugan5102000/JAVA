package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ReverseArraListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
		al.add("Rose");
		al.add("Sunflower");
		al.add("Rose");
		al.add("Lilly");
		al.add("Daisy");
		al.add("Marigold");
		al.add("Tulip");
		al.add("Jasmine");
		
		System.out.println("Before reversing");
		System.out.println(al.toString());
		Collections.reverse(al);
		System.out.println("After reversing");
		System.out.println(al);

	}

}
