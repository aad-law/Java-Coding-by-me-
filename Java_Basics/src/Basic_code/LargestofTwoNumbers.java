package Basic_code;
import java.util.Scanner;

public class LargestofTwoNumbers {
	
	public static void main(String[] args) {
		
		System.out.println("Enter number 1:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.println("Enter number 2:");
		int num2 = sc.nextInt();
		
		int res = (num1>num2)? num1 :num2;
		System.out.println(res);

		
		
	}

}
