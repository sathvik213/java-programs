
public class min{
  public static void main(String[] args) {
    int[] arr={12,3,4,5};
    System.out.println(mi(arr));
  }
  static int mi(int[] a){
    int p=1000000;
    for(int i=0;i<a.length;i++){
      if (a[i]<p){
        p=a[i];
      }

    }
    return p;
  }
}