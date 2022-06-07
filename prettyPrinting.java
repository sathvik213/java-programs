import java.nio.file.ProviderMismatchException;
import java.util.ArrayList;

public class prettyPrinting {
  
  public static void main(String[] args) {
    float a=3.3353f;
    System.out.printf("formattted number is %.2f\n",a);
//also rounds off
System.out.printf("formattted number of PI is %.2f\n",Math.PI);
System.out.printf("hello my name is %s and i am %s\n","sathvik","cool");
System.out.println('a'+'b');//195
// adds to give ascii value
System.out.println((char)('a'+3));
//char and int can be added
//string and int cant be added numberically
System.out.println("a"+1);//integer will be converted to Integer(wrapper class) that wil call toString()
// System.out.println(new Integer(59)+new ArrayList<>());//gives out an error because thsi method works with either primitives or with combination of a string
System.out.println(new Integer(59)+""+new ArrayList<>());
  }
}
