package chap1_pr;
import java.util.Scanner;
public class chap1_Q1 {

	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (max > b)
			max = b;
		if (max < c)
			max = c;
		if (max < d)
			max =d;
		
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the four number");
		System.out.print("a is "); int a = sc.nextInt();
		System.out.print("b is "); int b = sc.nextInt();
		System.out.print("c is "); int c = sc.nextInt();
		System.out.print("d is "); int d = sc.nextInt();
		
		System.out.println("max is " + max4(a, b, c, d));
		
	}

}
