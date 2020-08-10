package chap1_pr;

import java.util.Scanner;

public class chap1_Q2 {
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		
		return min;
	}
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("three number of max");
		System.out.print("a is "); int a = stdIn.nextInt();
		System.out.print("b is "); int b = stdIn.nextInt();
		System.out.print("c is "); int c = stdIn.nextInt();
		
		
		System.out.println("min is " + min3(a, b, c));

	}

}
