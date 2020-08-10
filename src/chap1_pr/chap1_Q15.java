package chap1_pr;

import java.util.Scanner;

public class chap1_Q15 {
	static void traiangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
		static void traiangleLU(int n) {
			for (int i = 1; i <= n; i++) {
				for (int j = n; j >= i; j--)
					System.out.print("*");
				System.out.println();
		}
	}
		static void traiangleRU(int n) {
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < i-1; j++)
					System.out.print(" ");
				for (int j = n; j >= i; j--)
					System.out.print("*");
				System.out.println();
		}
	}
		static void traiangleRB(int n) {
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < n-i; j++)
					System.out.print(" ");
				for (int j = 1; j <= i; j++)
					System.out.print("*");
				System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("print the triangle that left bottom is LB");
		
		do {
			System.out.print("height : ");
			n = sc.nextInt();
		} while (n <= 0);
		
		traiangleLB(n);
		System.out.println();
		traiangleLU(n);
		System.out.println();
		traiangleRU(n);
		System.out.println();
		traiangleRB(n);
	}

}
