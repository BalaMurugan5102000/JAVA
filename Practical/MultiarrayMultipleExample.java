class MultiarrayMultipleExample{
public void display(){
int arr[][]={{1,1,1},{2,2,2},{3,3,3}};
int arr1[][]={{1,1,1},{2,2,2},{3,3,3}};

//matrix to store sum of matrices
int result[][] = new int[3][3];

//adding & print multiplication of 2 matrices
for(int i=0; i<3; i++){
   for(int j=0; j<3; j++){
   result[i][j]=0;
   
for(int k=0; k<3; k++){
result[i][j] += arr[i][k]*arr1[k][j];
System.out.print(result[i][j] +" "); 
}   
   }
   System.out.println();
}
}
public static void main(String args[]){
MultiarrayMultipleExample obj = new MultiarrayMultipleExample();
obj.display();
}
}