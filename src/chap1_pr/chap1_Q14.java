package chap1_pr;
import java.util.Scanner;
public class chap1_Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("print the square");
		System.out.print("enter the height : ");
		int h = sc.nextInt();
		
		for (int i = 0; i < h; i ++) {
			for (int j = 0; j < h; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
