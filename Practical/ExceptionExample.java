package Com;

public class ExceptionExample {
	
	public void show() {
		String a = "I am a error";
		System.out.println(a);
		
		try {
			int i = 50/1; //ArithmaticException
			System.out.println(i);
			
			String b ="Balamurugan"; //NullpointerException
			System.out.println(b.length());
			
			int arr[] = new int[3];
			arr[1] = 24; //ArrayIndexOutOfBoundException
			
			int m = Integer.parseInt(b); //NumberFormatException
			System.out.println(m);			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
		
		String b = "I cannot be handle";
		System.out.println(a + " " + b );
		
		
		
	}

	public static void main(String[] args) {
		ExceptionExample obj = new ExceptionExample();
		obj.show();
	}

}
