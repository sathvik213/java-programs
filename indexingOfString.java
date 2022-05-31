public class indexingOfString {
  
  public static void main(String[] args) {
    String s=new String("New test");
    //we cant use s[0] to get first char as in array
    //we use CharAt(<indexnumber>)
    System.out.println(s.charAt(0));//fun thing is that it works like array
    //but external to the working case we use CharAt for programming syntax
    //println actually converts any value into a string 
    //null basica
  }
}
