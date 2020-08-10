package chap3_pr;
import java.util.Scanner;
public class chap3_Q2 {
	static int seqSearch(int[] a, int n, int key){
		int i = 0;
		
		while (true) {
			if (i == n)
				return -1;
			if (a[i] == key)
				return i;
			i++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.print("요솟소 : ");
		int num = sc.nextInt();
		
		int x[] = new int[num];
		for(int i = 0; i < num; i++){
			System.out.print("x["+ i+ "] : ");
			x[i] = sc.nextInt();
		}
		System.out.print("찾을 값 : ");
		int key = sc.nextInt();
		
		
		System.out.print("\n   |");
		for(int i = 0; i < num; i++)
			System.out.printf("%3d", i);
		System.out.println();
		System.out.print("---+");
		for(int i = 0; i < num; i++)
			System.out.print("----");
		System.out.println();
		
		for (; count < num; count++){
			System.out.printf("  %d|", count);
			for(int i = 0; i < num; i++)
				System.out.printf("%3d", x[i]);
			System.out.println("\n   |");
		}
	}

}
