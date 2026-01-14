package Basic_code;
import java.util.Scanner;
public class EvenOdd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int a = sc.nextInt();
	
	String ans = (a%2==0)? "Even" :  "Odd";
	System.out.println(ans);
	
}
}
