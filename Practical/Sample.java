package java8eg;

public interface Sample {
	void display(String a); // abstract method
	
	default void display1() { // default method
		System.out.println("I am default method");
	}
	
	static void my() {   // static method
		System.out.println("I am static method");
	}

}
