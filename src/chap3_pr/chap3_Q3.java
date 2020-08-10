package chap3_pr;
import java.util.Scanner;
public class chap3_Q3 {
	static int searchIdx(int[] a, int n, int key, int[] idx){
		int count = 0;
		for(int i = 0; i < n; i++){
			if (a[i] == key){
				idx[count] = a[i];
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿ä¼Ú ¼ö : ");
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] idx = new int[n];
		for(int i = 0; i < n; i++){
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		System.out.print("key : ");
		int key = sc.nextInt();
		System.out.print("idx : "+searchIdx(x, n, key, idx));
		
	}

}
