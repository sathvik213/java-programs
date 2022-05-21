import java.util.Scanner;

class reverseString{
  public static void main(String[] args) {
    Scanner st=new Scanner(System.in);
    String nwe=st.next();
    System.out.println(nwe);
    System.out.println(nwe);
    for(int i=nwe.length()-1;i>=0;i--){
      System.out.print(nwe.charAt(i));
    }

  }
}