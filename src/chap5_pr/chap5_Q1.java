package chap5_pr;
import java.util.Scanner;
public class chap5_Q1 {
	static int factorial(int x) {
		int result = 1;
		for (int i = 1; i <= x; i++)
			result *= i;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int x = sc.nextInt();
		
		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");

	}

}
