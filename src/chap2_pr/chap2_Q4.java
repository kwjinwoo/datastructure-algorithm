package chap2_pr;

import java.util.Scanner;

public class chap2_Q4 {
	static void copy(int[] a, int[] b) {
		if (a.length != b.length)
			System.out.println("a.length is not equal b.length");
		for (int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}
				
		
	}
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("array a length : ");
		int na = sc.nextInt();
		
		int[] a = new int[na];
		
		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("array b length : ");
		int nb = sc.nextInt();
		
		int[] b = new int[nb];
		
		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		copy(a, b);
		System.out.println("copy is completed");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

	}

}
