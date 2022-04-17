import java.util.Arrays;
import java.util.Scanner;

public class Arr2d {
  public static void main(String[] args) {
    //1 2 3
    //4 5 6
    //7 8 9
    int[][] arr=new int[3][2];//here number of columns are not mandatory
    //it is like an array of arrays
    // int[][] example={
    //   {1,2},
    //   {23,3,3}
    // };
    // System.out.println(Arrays.toString(example[1]));//prints the array for row 2
    System.out.println(arr.length);
    Scanner in= new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
      for(int j=0; j < arr[i].length ;j++){
        arr[i][j]=in.nextInt();
      }
    }
    for(int i=0;i<arr.length;i++){
      for(int j=0; j < arr[i].length ;j++){
        System.out.println("arr["+i+"]"+"["+j+"] : "+arr[i][j]);
      }
    }
for(int p=0;p<arr.length;p++){
  System.out.println(Arrays.toString(arr[p]));
}

  }
}
