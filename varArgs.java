import java.util.Arrays;

public class varArgs {
  public static void main(String[] args) {
    fun(1,2,3,3);
    mul(2,3,"k","d");
  }
  static void fun(int ...v){
    System.out.println(Arrays.toString(v));
  }
  static void mul(int a,int b,String ...v){
    System.out.println(Arrays.toString(v));
  }
}
