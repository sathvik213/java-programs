import java.util.Arrays;
import java.util.Scanner;

public class array2 {
 public static void main(String[] args) {
   Scanner in=new Scanner(System.in);
   int[] arr= new int[4];
   arr[0]=23;
   arr[1]=23;
   arr[2]=23;
   arr[3]=23;
System.out.println(arr[0]);
//input  using for loop for saving time
for(int i=0;i<arr.length;i++){
  arr[i]=in.nextInt();
  System.out.println("arr["+i+"] = "+arr[i]);
}
for(int num: arr){//for each loop
  System.out.print(num+" ");
}
// System.out.println(arr[4]);//error index out of bound
System.out.println(Arrays.toString(arr)); 
 } 
}
