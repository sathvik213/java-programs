class Dog{
  int size;
  String breed;
  String name;
  void bark(){
    System.out.println("Ro!Ruff!!Ruff!");
  }
}
public class first_class {//testing class
  public static void main(String[] args) {
    Dog d=new Dog();//instantiating an object
    d.size=40;//using dot operator to set size of dog
    d.bark();//calling method of class Dog
  }
  
}
