class SmallestAndLargestExample{

public static void main(String args[]){

int arr[]={23,34,45,56,98,23,12,76,87};

int min=arr[0];
int max=arr[0];

for(int i=0; i<arr.length; i++){
if(arr[i]<min){
min=arr[i];
}
if(arr[i]>max){
max=arr[i];
}
}
System.out.println("Smallest"+ min +"Largest"+ max);
}
}