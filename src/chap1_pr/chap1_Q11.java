package chap1_pr;
import java.util.Scanner;
public class chap1_Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the positive number : ");
		int n  = sc.nextInt();
		int digit = 0;
		int div = 1;
		while (n / div != 0) {
			digit += 1;
			div *= 10;
		}
		System.out.println("the digit is " + digit);
	}

}
