package Basic_code;
import java.util.Scanner;

public class SumofFirstNNaturalNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Print a Number");
		int num = sc.nextInt();
		
		
		int i = 0;
		int sum = 0;

		while (num >= i) {
			sum = sum +i;
			i++;
		}
		System.out.println(sum);

	}

}
