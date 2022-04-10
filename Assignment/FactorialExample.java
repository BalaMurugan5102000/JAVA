import java.util.Scanner;

class FactorialExample{

public static void main(String args[]){
System.out.println("Enter the no for which the factorial is to be done");
Scanner s=new Scanner(System.in);
int number=s.nextInt();
s.close();
int fact=1;

for(int  i=1; i<=number; i++){
fact=fact*i;
}
System.out.println("factorial is" + fact);
}
}