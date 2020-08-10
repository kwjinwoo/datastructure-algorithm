package chap1_pr;
import java.util.Scanner;
public class Chap1_Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the a : ");
		int a = sc.nextInt();
		System.out.print("enter the b : ");
		int b = sc.nextInt();
		
		while (b <= a) {
			System.out.print("enter the b greater than a : ");
			b = sc.nextInt();
		}
		
		System.out.println("b - a is : " + (b-a));

}
}