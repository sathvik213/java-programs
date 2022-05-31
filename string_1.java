public class string_1 {
  public static void main(String[] args) {
    int aa=10;//primitive(stack memory)
    int[] arr={2,3,4,4};//arr presenty in stack is pointing to heap
    String name="raj";//most used class in java (all classes in java start with capital letter)
    //"raj" is an object of type string
    //name is reference variable
    //String is data type here
    //String pool- a group in heap memory
    //all the similar values of strings are no recreated in the pool
    //in arrays or int if we change values of ref variable ,ref variable with same values get changed if one ref variable val is changed
    //this above thing doesnot happen with strings 
    
    System.out.println(name);
    //strings have immutability-->you cannot change /modify an object in strings of java,immutability is present in java due to security reasons
    String a="new";
    System.out.println(a);
    a="old";
    System.out.println(a);
    //here you may get doubt that strings cant be changed as said before 
    //but it is done
    //solution-->so "old" is created and assigned to a and "new" is deleted(added to garbage collection)

    
;

  }
}
