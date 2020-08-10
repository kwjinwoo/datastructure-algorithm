package chap2_pr;

import java.util.Scanner;

public class chap2_Q6 {
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		int lenth = 0;
		int tx = x;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		while(tx != 0) {
			lenth++;
			tx /= r;
		}
		digits = lenth--;
		do {
			d[lenth--] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);
		
		return digits;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("decmical is converted to cardinal number");
		do {
			do {
				System.out.print("enter the number that is not minus number");
				no = sc.nextInt();
			} while (no < 0);
			do {
				System.out.print("what kind of cardinal number is changed (2~36) : ");
				cd = sc.nextInt();
			} while (cd <2 || cd > 36);
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd + "진수로는 ");
			for (int i = 0; i < dno; i++)
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.print("retry? (1. yes/ 2. no) : ");
			retry = sc.nextInt();
		} while(retry == 1);


	}

}
