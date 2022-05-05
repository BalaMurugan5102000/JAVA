package Com;

public class NonStaicNestedClassEg {
	 int a = 45;
	private  int b = 35;

	class Inner{
		 int res = a+b; 
		 void show() {
			System.out.println("Value of res:"+ res);
		}

	public static void main(String[] args) {
		NonStaicNestedClassEg obj = new NonStaicNestedClassEg();
		NonStaicNestedClassEg.Inner i = obj.new Inner();
	
	}

}
}
