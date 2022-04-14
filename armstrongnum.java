import java.util.Scanner;

public class armstrongnum {
  public static void main(String[] args) {
   
    System.out.println("Checking for armstrong number: ");
   for(int i=0;i<=1000000;i++){
     if(arm(i)){
       System.out.println(i+ " is an armstrong number ");
     }

   }
  }
  
  static boolean arm(int num){
    int temp=num;
    int rem;
    int sum=0;
    while (num!=0){
      rem=num%10;
      sum+=cube(rem);
      num/=10;
    }
    if (sum==temp){
      return true;
    }
    else{
return false;
    }
  }
  
  static int cube(int n){
    return n*n*n;
  }
  
}
