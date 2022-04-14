public class newScope {
  
  public static void main(String[] args) {
    String name="Aneesh";
    System.out.println(name);

    {
      name="rahul";
      System.out.println(name);   
    }
    System.out.println(name);
  }
}
