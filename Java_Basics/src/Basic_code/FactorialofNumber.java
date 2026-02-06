package Basic_code;
import java.util.Scanner;

public class FactorialofNumber {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	int i = 1;
	int factorial = 1;
	while(num>=i){
		
		 factorial =factorial* i;
		i++;
	}
	System.out.println(factorial);
	
}
}
