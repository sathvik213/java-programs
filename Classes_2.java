import java.net.Inet4Address;

public class Classes_2 {
  public static void main(String[] args) {
    int a=10;
    Integer num1=45;
    Integer num2=5;
    System.out.println(num1+" "+num2);
swap(num1, num2);
System.out.println(num1+" "+num2);
 
final A sathvik=new A("sathvik");
sathvik.name="new nAMe";
// sathvik=new A("hello")
 ;//when final is declared for object we can change the values of the object but not change or redirect it to new object
 //same works reversely for primitives
 //when non primitve is final you cant reassign it
  }
  static void swap(Integer a,Integer b){
    int temp=a;
    a=b;
    b=temp;
  }
}
class A{
  final int num=10
  ;
  String name;
  public A(String name){
    this.name=name; 
  }

}
