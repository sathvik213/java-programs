 class Dog {

  String name;
  public static void main(String[] args) {
    Dog dog1=new Dog();
    dog1.bark();
    dog1.name="Bart";
    Dog[] myDogs=new Dog[3];
    myDogs[0]=new Dog();
    myDogs[1]=new Dog();
    myDogs[2]=dog1;
    myDogs[0].name="Fred";
    myDogs[1].name="Marge";
              for(int x=0;x<myDogs.length;x++){
            myDogs[x].bark();
          }
            }
          
            public void bark(){
  System.out.println(name+" says ruff!!");}}
  


