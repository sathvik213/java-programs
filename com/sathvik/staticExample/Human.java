package com.sathvik.staticExample;

public class Human {
  int age;
  String name;
  int salary;
  boolean married;
  static long population;//this is common to every object of human class and initially here long values have default value as 0
  public Human(int age,String name,int salary,boolean married){
            this.age=age;
            this.name=name;
            this.salary=salary;
            this.married=married;
            Human.population+=1;
  }
}
//NOTE: why static is used before main method?
// here we can create main method without even creating object of that class
//if we hide main by commenting we cant be able to run this program