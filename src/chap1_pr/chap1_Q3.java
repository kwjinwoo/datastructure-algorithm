package chap1_pr;

import java.util.Scanner;

public class chap1_Q3 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;
		
		return min;
	}
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the four number");
		System.out.print("a is "); int a = sc.nextInt();
		System.out.print("b is "); int b = sc.nextInt();
		System.out.print("c is "); int c = sc.nextInt();
		System.out.print("d is "); int d = sc.nextInt();
		
		System.out.println("min is " + min4(a, b, c, d));

	}

}
