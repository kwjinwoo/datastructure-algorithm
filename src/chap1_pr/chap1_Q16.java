package chap1_pr;
import java.util.Scanner;
public class chap1_Q16 {
	static void spira(int n) {
		for (int i = 0; i < n; i++) {
			for (int s = 0; s < n-1-i; s++)
				System.out.print(" ");
			for (int s = 0; s < (2*i)+1; s++)
				System.out.print("*");
			for (int s = 0; s < n-1-i; s++)
				System.out.print(" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the n : ");
		int n = sc.nextInt();
		
		spira(n);

	}

}
