import java.util.Arrays;

public class changeVal {
  public static void main(String[] args) {
   int[] arr={1,2,3,4,5};
   change(arr);
   System.out.println(Arrays.toString(arr)); 

  }
  static void change(int[] arr){
    arr[0]=99;//copy of reference is passed
    //strings are immutable and cant be modified by void functions  
    //arrays can be modified(they are non primitive stuff)
  }
}
