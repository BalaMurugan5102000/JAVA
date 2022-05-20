package java8eg;

public class LambdaExpressionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceEg d = (a,b)->{
			//System.out.println(a+b);
			return (a+b);
		};
		System.out.println(d.add(40, 50));
		//d.add();

	}

}
