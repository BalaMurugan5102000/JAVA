package Com;

import java.util.StringTokenizer;


public class StringTokenizerExample {
	
	
	public void show() {
		
		StringTokenizer	 t = new StringTokenizer("Anudip Foundation Skill Development Center"," ");
		while(t.hasMoreTokens()) {
			System.out.println(t.nextToken());
		}
		
		StringTokenizer t1 =  new StringTokenizer("I am bala,Staying in Chennai,Working in tcs");
		while(t1.hasMoreTokens()) {
			System.out.println("Next Token:" + t1.nextToken(","));
		}
		
	}
	public static void main(String[]args) {
		StringTokenizerExample obj = new StringTokenizerExample();
		obj.show();
		
		
	}

}
