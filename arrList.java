import java.util.ArrayList;

public class arrList {
  public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>(10);//integer is the wrapper class
    list.add(2);
    list.add(22);
    list.add(222);
    list.add(2222);
    list.add(22222);
    list.add(222222);
  
    
    System.out.println(list);
    System.out.println(list.contains(33));
list.set(0,99);
System.out.println(list);

  }
}
