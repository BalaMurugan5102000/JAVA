import java.util.Scanner;


public class WhileLoopExample{
public static void main(String args[]){

int i=1;
int n;
Scanner s=new Scanner(System.in);
System.out.println("How many stars do you want");
n=s.nextInt();

while(i<=n){
System.out.println("*");
i++;
}
}

}