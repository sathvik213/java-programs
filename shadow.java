public class shadow {
 static int a=10;
 
  public static void main(String[] args) {
    System.out.println(a);
int a=40;
System.out.println(a);//when you are accessing something the variable in higher level scope is hidden
//shadowing begins when the local varible is initialised
print();
  }
  static void print(){System.out.println(a);}
}
