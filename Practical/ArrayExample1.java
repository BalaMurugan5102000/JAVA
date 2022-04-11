class ArrayExample1{

public static void main(String args[]){
String[]names={"Mamta","Ram","kiran","Ajay","Bala"};
for(int i=0; i<names.length; i++){
System.out.println(names[i]);
}
System.out.println();

int[]phone={123,234,345,456,567,678,890};
for(int n:phone){
System.out.println(n);
}
}
}