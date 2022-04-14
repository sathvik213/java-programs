
import java.util.Scanner;
class universe{
 public static void main (String[] args) {
int count=0;
String a="129272";
int n=0;
while (n<=a.length()){ 
	if (a.indexOf(n)==50){
		count++;
	}
	n++;

}

System.out.println(count);

 } // end main method
} // end class

