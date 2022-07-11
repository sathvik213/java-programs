public class Construct {
  public static void main(String[] args) {
    Student  stud1=new Student();
//here constructor is by default ,that creates an object and it allocates some variables

Student_with_constructor s;
s=new Student_with_constructor();
s.names="sathvik";
s.greet();

  }
}//constructor basically defines what happens when object is created

class Student{
  int num;
    String names;
    float marks;
}
class Student_with_constructor{
  int num;
    String names;
    float marks;
    Student_with_constructor  (){
      this.num=123;
      this.names="sathvik";
      this.marks=33.3f;
    }
    void greet(){
      System.out.println("hello my name is: "+this.names);
    }//here this.names and names both outpput value is same   
}
//note : primitives are stored in stack memory in java,this is used to make java fast