package collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vc = new Vector<String>();
		vc.add("Dog");
		vc.add("Cat");
		vc.add("Tiger");
		vc.add("Lion");
		vc.add("Black Panther");
		vc.add("Jaguar");
		
		System.out.println(vc);
		if(vc.contains("Jaguar")) {
			System.out.println("element present");
		}
		else
			System.out.println("not present");
	}

}
