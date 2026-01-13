package me;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();

		if (n <= 1) {
			System.out.println("Invalid number");
		} else {
			boolean isPrime = true;

			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0) {
					isPrime = false;
				}
				break;
			}

			System.out.println(isPrime ? "Prime number" : "Not a Prime number");
			sc.close();
		}
	}
}
