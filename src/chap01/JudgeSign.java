package chap01;
import java.util.Scanner;
public class JudgeSign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the integer : ");
		int n = sc.nextInt();
		
		if(n>0)
			System.out.println("this number is +nuber");
		else if(n<0)
			System.out.println("this number is -number");
		else
			System.out.println("this number is zero");
	}

}
