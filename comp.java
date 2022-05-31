public class comp {
  public static void main(String[] args) {
    String a="raj";
    String d="raj";
    //this above snippet shows about a string pool
    System.out.println(a==d);//comparing both values of strings are same or not
    //here == checks for both values 
    //and also checks if reference variables are pointing to both objects(values) or not
    //then only true is returned

    //scenario in which diff objects of same value
  //by explicitly creating new objects
  String x =new String("raj")
;    String y =new String("raj")
;//so here the values of object are outside of string pool
System.out.println(x==y);//false means two referece point to different string objects
//when you need to check value use .equals method
//irrespective of same reference 
System.out.println(x.equals(y));//true because of same value
String p=new String("testWithoutSpace");
String q=new String("testWithoutSpace ");
System.out.println(p.equals(q));//false becaue both values are very different due to space added at the end



  }
}



 