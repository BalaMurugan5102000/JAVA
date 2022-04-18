public class OverloadingExample{
static int pulseMe(int x, int y){
return x+y;
}
static int pulseMe(int x, int y, int z){
return x+y+z;
}
static double pulseMe(double x, double y){
return x+y;
}
    public static void main(String[]args){
	int a = pulseMe(354,456);
	int c = pulseMe(234,3435,23);
	double b = pulseMe(88.34, 99.45);
	System.out.println("int 2 argument :"+ a);
	System.out.println("int 3 argument :"+ c);
	System.out.println("double 2 argument :"+ b);
	}
}