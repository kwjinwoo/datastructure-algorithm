package chap01;
import java.util.Scanner;

public class Median {
	static int med3(int a, int b, int c) {
		if (a>=b)
			if (b>=c)
				return b;
			else if (a<=c)
				return a;
			else
				return c;
		else if (a>c)
			return a;
		else if (b>c)
			return c;
		else
			return b;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("find median in tree number");
		System.out.print("a is "); int a = stdIn.nextInt();
		System.out.print("b is "); int b = stdIn.nextInt();
		System.out.print("c is "); int c = stdIn.nextInt();
		
		System.out.println("median is " + med3(a, b, c));
		

	}

}
