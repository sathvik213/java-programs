public class scope {
  public static void main(String[] args) {
    //block scope
    int a=10;
    {
      a=33;//initialilsed out side so cant initialise it again
      //here a is refered to 33 as value 
      System.out.println(a);
      int c=00;//initialilsed in side so cant use it outside
    }
    System.out.println(a);
  }
  
}
