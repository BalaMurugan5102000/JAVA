import java.util.Scanner;

public class IfElseExample{
public static void main(String args[]){

int num;

Scanner s=new Scanner(System.in);
System.out.println("Enter a number:");
num=s.nextInt();

if(num>0){
System.out.println(num+"is positive");
}
else{
System.out.println(num+"is negative");
}

}
}