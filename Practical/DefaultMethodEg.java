package java8eg;

public  class DefaultMethodEg implements Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodEg d = new DefaultMethodEg();
		d.display("Good Morning");
        d.display1();
        Sample.my();
	}

	@Override
	public void display(String a) {
		// TODO Auto-generated method stub
		System.out.println(a);
		
	}
	

}
