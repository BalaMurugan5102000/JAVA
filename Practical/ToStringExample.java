package Com;

import java.util.Scanner;

public class ToStringExample{
	
	int rollno;
	String name,address;
	
	ToStringExample(int rollno, String name, String address){
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	public String toString() {
		return rollno+" " + name + " " + address;
	}

	public static void main(String[] args) {
		
		
		ToStringExample s = new ToStringExample(1,"Rocky","Chennai");
		ToStringExample s1 = new ToStringExample(2, "Bala", "Australia");
		
		System.out.println(s);
		System.out.println(s1);
		
		
		

	}

}
