class OddAndEvenExample{

public static void main(String args[]){

int[]arr={12,23,344,45,56,67,78,89,90};
System.out.println("Even numbers in the given array are");

for(int i=0; i<arr.length; i++){
if(arr[i]%2==0){
System.out.println(arr[i]);
}
System.out.println("Odd numbers in the given array are");
for(int j=0; j<arr.length; j++){
if(arr[j]%2 != 0){
System.out.println(arr[j]);
}

}

}
}
}