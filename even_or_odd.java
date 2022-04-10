import java.util.*;
public class even_or_odd{
public static void main(String[] args) {
  System.out.println("Enter a number to check whether it is a even or odd number: ");
  Scanner in= new Scanner(System.in);
  int n=in.nextInt();
  if (n%2==0){
    System.out.println(n+" is an even number");
  }
  if (n%2!=0){
    System.out.println(n+" is a odd number");
  }


}
}