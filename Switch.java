import java.util.Scanner;
public class Switch {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String fruit=in.next();
    switch (fruit) {
      case "mango":System.out.println("king of fruits");
        
        break;
        case "grape":System.out.println("not king of fruits");
        
        break; case "water melon":System.out.println("watery of fruits");
        
        break;
      default: System.out.println("not a match\n mission terminating...");
        break;
    }
    }
  }
  

