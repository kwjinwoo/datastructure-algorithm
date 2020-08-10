package chap01;
import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		
		System.out.println("enter the two digits number");
		
		do {
			System.out.print("enter : ");
			no  = sc.nextInt();
		} while (no<10||no>99);
		 
		System.out.println("value no is became " + no);

	}

}
