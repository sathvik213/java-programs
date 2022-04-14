public class funcOverload {
  
  public static void main(String[] args) {
    call("whats my name");
    call(2);
  }
  static void call(int num){
    System.out.println("there is number: "+num);
  }
  static void call(String name){
    System.out.println(name);
  }
}
