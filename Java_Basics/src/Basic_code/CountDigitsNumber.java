package Basic_code;
import java.util.Scanner;

public class CountDigitsNumber {
      public static void main(String[] args) {
    	  
    	  
    	  Scanner sc = new Scanner(System.in);
    	  
    	  int num = sc.nextInt();
//    	  int res = 0;
		   int counter = 0;

    	  while(num>0) { 	
    		  num = num/10;
    		  counter++;
    }
		  System.out.println(counter);

}
}
