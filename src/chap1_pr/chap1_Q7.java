package chap1_pr;

import java.util.Scanner;

public class chap1_Q7 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Sum of 1 to n");
		System.out.print("n is : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i);
			sum += i;		
			if (i != n)
				System.out.print(" + ");
		}
		System.out.println(" = " + sum);
	}

}
