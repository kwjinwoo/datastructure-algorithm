package chap3_pr;

import java.util.Scanner;

public class chap3_Q1 {
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		a[n] = key;
		
		
		for(; i < a.length; i++){
			if (a[i] == key && i != (a.length -1))
				return i;
		}	
			return -1;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];
		
		for (int i = 0; i < num; i++){
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� ��");
		int ky = sc.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");

	}

}
