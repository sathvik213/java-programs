import java.util.Arrays;

import javax.swing.text.PlainView;

public class SB {
  public static void main(String[] args) {
    StringBuilder b=new StringBuilder();
    for(int i=0;i<26;i++){
      char ch=(char)('a'+i);
      b.append(ch);
    System.out.println(b);
    }
    System.out.println(b.reverse());;
String name=" sathvik ";
System.out.println(Arrays.toString(name.toCharArray()));
System.out.println(name.indexOf('a'));
System.out.println("   name    ".strip());
  }
}
