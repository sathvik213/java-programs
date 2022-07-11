import java.util.Arrays;

public class Classes {
  public static void main(String[] args) {
    //store 5 roll numbers
    // int[] num=new int[5];
    // String[] names=new String[5];
    //data of 5 students
    //{roll name marks}
    
Student[] students=new Student[5];
Student sathvik;//this is just a reference of object of type student and not creating any variable,reference variable is created in the stack memory and does not point to anything except null for string values where int has 0 and float has 0.0
Student  stud1=new Student();
// ^^LHS is done in compile time.RHS is done in runtime
//dynamically allocates memory and returns reference to it
// sathvik.num=5;
// System.out.println(sathvik.num);
System.out.println(Arrays.toString(students));
  }

}
// class is a logical construct
// where object is physical reality
//variaibles inside the object are known as instance variables
//dot operator is used to access instance variables
  //creating a new class

class Student{
  int num;
    String names;
    float marks;
}