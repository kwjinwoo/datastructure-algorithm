package chap01;
import java.util.Scanner;
public class SumFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sum of 1 to n");
		System.out.print("n is : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++)
			sum += i;
		
		System.out.println("sum of 1 to " + n + " is " + sum);

	}

}
