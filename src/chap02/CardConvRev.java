package chap02;
import java.util.Scanner;
public class CardConvRev {
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
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
			dno = cardConvR(no, cd, cno);
			
			System.out.print(cd + "진수로는 ");
			for (int i = dno - 1; i >= 0; i--)
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.print("retry? (1. yes/ 2. no) : ");
			retry = sc.nextInt();
		} while(retry == 1);

	}

}
