package Com;

public class ExceptionEx {
	public static void myDisplay(int a)throws ArithmeticException{
		if(a>=0 && a<35) {
			throw new ArithmeticException("value cannot be less than 35");
		}else
			System.out.println("You are pass");
	} 

	public static void main(String[] args) {
		myDisplay(25);
		

	}

}
