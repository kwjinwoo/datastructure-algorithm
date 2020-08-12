package chap6_pr;
import java.util.Scanner;
public class chap6_Q1 {
	static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSortLeft(int x[], int len) {
		for (int i = 0; i < len -1 ; i++)
			if (x[i] > x[i + 1])
					swap(x, i, i + 1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : "); int n = sc.nextInt();
		int x[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		bubbleSortLeft(x, n);
		
		System.out.println("오름차순으로 정렬");
		
		for (int i = 0; i < n; i++){
			System.out.println("x[i" + i + "] = " + x[i]);
		}

	}

}
