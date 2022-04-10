import java.util.Scanner;

class FibonacciExample{
public static void main(String args[]){

int num1=0;
int num2=1;
int nextNum;
int lengthofseries;
System.out.println("Enter length of the series");
Scanner s=new Scanner(System.in);
lengthofseries=s.nextInt();
s.close();
for(int i=0; i<lengthofseries; i++){
   System.out.println(num1+"   ");
   nextNum=num1+num2;
   num1=num2;
   num2=nextNum; 
}

}
}