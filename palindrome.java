public class palindrome {
  public static void main(String[] args) {
    String s="sas";
    System.out.println(isp(s));;
    System.out.println(isp(s+'s'));;

    
  }
  static boolean isp(String str){
    str=str.toLowerCase();
    for(int i=0;i<str.length()/2;i++){
      if (str.charAt(i)!=str.charAt(str.length()-i-1)){
        
        return false;
      }
    }
    return true;
  }
}
