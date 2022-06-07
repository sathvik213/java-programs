public class performance {
  public static void main(String[] args) {
    String series=""
    ;
    for(int i=0;i<26;i++){
      char ch=(char)('a'+i);
      
      series+=ch;
      System.out.println(series);//here O(n^2) space is getting wasted where for each iteration string new obj is created
    }
  }
}
