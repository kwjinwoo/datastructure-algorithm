package chap5_pr;

import java.util.Scanner;

public class chap5_Q2 {
	static int gcd(int x, int y) {
		while (y != 0) {
			int tempx = x;
			x = y;
			y = tempx % y;
		}
		return x;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : "); int x = sc.nextInt();
		System.out.print("정수를 입력하세요 : "); int y = sc.nextInt();
		
		System.out.println("두 수의 최대공약수는 " + gcd(x, y) + "입니다.");

	}

}
