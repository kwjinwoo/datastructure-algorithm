package chap01;
import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("three number of max");
		System.out.print("a is "); int a = stdIn.nextInt();
		System.out.print("b is "); int b = stdIn.nextInt();
		System.out.print("c is "); int c = stdIn.nextInt();
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("max is " + max);
		
	}

}
