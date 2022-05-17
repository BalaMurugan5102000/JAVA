package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new TreeSet<String>();
		s.add("Pen");
		s.add("Pencil");
		s.add("Mouse");
		s.add("Phone");
	//	s.add(null);
		s.add("Ac");
		s.add("Bottle");
		s.add("Earphone");
		s.add("Pen"); // duplicate not allowed
		
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Set<Integer> s1 = new TreeSet<Integer>();
		s1.add(39);
		s1.add(90);
		s1.add(30);
		s1.add(88);
		s1.add(15);
		s1.add(99);
		
		//Iterator<Integer> itr1 = ((TreeSet<Integer>)s1).descendingIterator();
		Iterator<Integer> itr1 = s1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("lowest : "+ ((TreeSet<Integer>)s1).pollFirst());
		System.out.println("highest : "+((TreeSet<Integer>)s1).pollLast());

	}

}
