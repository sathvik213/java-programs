import java.util.*;
public class nestedswitch {
  public static void main(String[] args) {
System.out.println("Enter id and name of department: ");
    Scanner in =new Scanner(System.in);
int empID=in.nextInt();
String dept=in.next();
switch(empID){
  case 1:System.out.println("Sundar pichai");break;
  case 2:System.out.println("Mark zuckerberg");break;
  case 3:
  switch(dept){
    case "CSE":System.out.println("Mark computer");break;
    case "CE":System.out.println("Mark civil");break;
    case "EEE":System.out.println("Mark electro");break;
    case "ECE":System.out.println("Mark comms");break;
    default:System.out.println("wrong input ");break;
  }break;
  default:System.out.println("wrong input for empID ");break;

  
}


  }
}
