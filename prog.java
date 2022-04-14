public class prog {
  public static void main(String[] args) {
    int a=sum(1,2);
    System.out.println(a);
    String per=myGreet(" robin");
  System.out.println(per); 
  }

  static String myGreet(String name){
    return "hello"+name;
  }
  static int sum(int a, int b){
    return a+b;
  }
}
