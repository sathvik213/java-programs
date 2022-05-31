public class searchInStrings {
  public static void main(String[] args) {
    String name="sathvik";
    char target='u';
    System.out.println(search(name,target));
    
  }//length() for string
  static boolean search(String name, char target){
    if (name.length()==0){
      return false;
       
    }
    for(int i=0;i<name.length();i++){
      if (target==name.charAt(i)){
        return true;
      }
    }
    return false;
  }
}
