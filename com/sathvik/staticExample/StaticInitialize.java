package com.sathvik.staticExample;

public class StaticInitialize {
  static int a=4;
  static int b;
  //will run only once when first object is created 
  static{
    System.out.println("this is static block");
    b=a*5;
  }
  public static void main(String[] args) {
    StaticInitialize obj=new StaticInitialize();
    System.out.println(obj.a+" "+obj.b);
    obj.b+=1
    ;
    
    System.out.println(obj.a+" "+obj.b);
    StaticInitialize obj2=new StaticInitialize();
    System.out.println(obj2.a+" "+obj2.b);
  }
}
