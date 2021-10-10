
import java.util.Scanner;
class RT1 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to reverse:");
 String a = s.nextLine();
 StringBuffer sb = new StringBuffer(a);
System.out.println(a);
sb.reverse(a);
System.out.println(a);
}
}