import java.util.Scanner;

public class DefangIP {
  public static void main(String[] args) {
      Scanner n=new Scanner(System.in);
      String a=n.next();
      String s=new String();
      for(int i=0;i<a.length();i++){
          if(a.charAt(i)=='.'){
              a+=a.substring(0,i)+"[.]";
          }
          else{
            a+=a.charAt(i);
          }
      }
      System.out.println(a);
  }
}