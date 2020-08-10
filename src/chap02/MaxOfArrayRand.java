package chap02;
import java.util.Random;
import java.util.Scanner;
public class MaxOfArrayRand {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++)
			if(a[i]>max)
				max=a[i];
		return max;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("find max of height");
		System.out.print("the number of people : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		System.out.println("heights is below");
		for (int i = 0; i < num; i++){
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("the max is : " + maxOf(height));

	}

}
