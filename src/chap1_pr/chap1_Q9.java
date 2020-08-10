package chap1_pr;
import java.util.Scanner;
public class chap1_Q9 {
	static int sumof(int a, int b) {
		int tem;
		if(a>b) {
			tem = a;
			a = b;
			b = tem;
		}
		int sum = 0;
		for (int i = a; i <= b; i++)
			sum += i;
	
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the a : ");
		int a = sc.nextInt();
		System.out.print("enter the b : ");
		int b = sc.nextInt();
		
		System.out.println("sum of a to b is " + sumof(a, b));
	}

}
