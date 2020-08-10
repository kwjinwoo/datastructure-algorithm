package chap1_pr;
import java.util.Scanner;
public class chap1_Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the n : ");
		int n = sc.nextInt();
		
		int sum = n*(1 + n) / 2;
		
		System.out.println("sum is " + sum);
	}
}
