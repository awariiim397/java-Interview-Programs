class ArrayTest{
public static void main (String args[]){
  int[]  arr={1,3,2,4};
int i,sum=0;
 for( i=1;i<arr.length-1;i++){
   sum+=arr[i];
System.out.println("those numbers are :"+arr[i]);}
System.out.println(sum);
}
}