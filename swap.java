public class swap {
  public static void main(String[] args) {
    int a=10;
    int b=20;
    System.err.println("a and b before swap: "+a+" "+b);
    int temp=a;
    a=b;
    b=temp;
    System.err.println("a and b after swap: "+a+" "+b);
    swap(a,b);
    System.err.println("a and b after swap: "+a+" "+b);

  }
  static void swap(int a,int b){
    int temp=a;
    a=b; 
    b=temp;//does not swap the real a and b values
    
  }
  
}
