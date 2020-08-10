package chap2_pr;

import java.util.Scanner;

public class chap2_Q3 {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("the number of array : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		for (int i = 0; i< num; i++) {
			System.out.print("x[" + i +"] : ");
			x[i] = sc.nextInt();
		}
		System.out.println("sum is " + sumOf(x));
	}

}
