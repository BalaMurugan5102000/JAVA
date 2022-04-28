package Com;

public class ExceptionExample1 {
	
	static void mFunc() {
		try {
			
			int i = 50/8;
			System.out.println(i);
			
			int arr[] = new int [3];
			arr[4] = 24;
		}
		
		catch(ArithmeticException e) {
			
			System.out.println(e);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
		finally {
			
			System.out.println("I am finally block code");
		}
		
	   
   }
	public static void main(String[] args) {
		ExceptionExample1 obj = new ExceptionExample1();
		obj.mFunc();
	
	}

}
