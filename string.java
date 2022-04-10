import java.util.Scanner;

public class string {
    public static void main(String[] args){
        String code=greet();
        System.out.println(code);
    }
    static String greet() {
        System.out.println("Enter some text: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
