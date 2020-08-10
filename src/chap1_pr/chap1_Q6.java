package chap1_pr;
import java.util.Scanner;

public class chap1_Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sum of 1 to n");
		System.out.print("n is : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=n) {
			sum += i;
			i++;
		}
		System.out.println("i is : " + i);
	}
	}


