package chap2_pr;

import java.util.Random;

public class chap2_Q1 {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++)
			if(a[i]>max)
				max=a[i];
		return max;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("find max of height");
		int num = rand.nextInt(10);
		System.out.println("the number of people : " + num);
		
		
		int[] height = new int[num];
		
		System.out.println("heights is below");
		for (int i = 0; i < num; i++){
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("the max is : " + maxOf(height));


	}

}
