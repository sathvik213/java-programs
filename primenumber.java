import java.util.*;
public class primenumber {
  public static void main(String[] args) {
    System.out.println("Enter a number to check whether it is a prime number or not: ");
  Scanner in= new Scanner(System.in);
  int n=in.nextInt();
  int p=1;
  if(n==2){
    System.out.println("it is a prime number");
  }else{
for(int i=2;i<=n-1;i++){
        
          
          if(n%i==0){
            System.out.println("It is not a prime number");
        break;
          }
          else{
            p++;
          }
}
if(p==(n-1)){
  System.out.println("It is a prime");
}


  }
}
}