import java.util.Arrays;

public class passfunc {
  public static void main(String[] args) {
    int[] num={1,2,3};
    System.out.println(Arrays.toString(num));
    change(num)
    ;
    System.out.println(Arrays.toString(num));

  }
  //strings are immutable in java
  //arrays are mutable in java
  static void change(int[] arr){
    arr[0]=99;
  }
}
