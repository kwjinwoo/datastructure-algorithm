package chap02;
import java.util.Scanner;
public class ArrayEqual {
	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length)
			return false;
		
		for (int i = 0; i < a.length; i++)
			if (a[i] != b[i])
				return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("array a length : ");
		int na = sc.nextInt();
		
		int[] a = new int[na];
		
		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("array b length : ");
		int nb = sc.nextInt();
		
		int[] b = new int[nb];
		
		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("array a and b is " + 
							(equals(a, b) ? "same"
										   : "not same"));
		
	}

}
