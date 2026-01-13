package me;
import java.util.Scanner;
public class Evenodd {
public static void main(String[] args) {
while(true) {
	System.out.println("Enter number to find its even or odd");	
	Scanner sc = new Scanner(System.in);
	int a1 =sc.nextInt();
	
	if(a1%2 == 0) {
		System.out.println("Even number");
	}else {
		
		System.out.println("Odd number");
	}
	
}
}	
}
