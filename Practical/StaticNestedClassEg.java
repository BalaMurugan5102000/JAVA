package Com;

public class StaticNestedClassEg {
	
	static int a = 45;
	private static int b = 35;

	static class Inner{
		static int res;
		static void show() {
			System.out.println("Value of res:"+ (a+b));
		}
		
		
	}
	public static void main(String[] args) {
		StaticNestedClassEg.Inner.show();
		

	}

}
