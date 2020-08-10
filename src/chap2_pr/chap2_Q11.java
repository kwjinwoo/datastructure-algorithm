package chap2_pr;

public class chap2_Q11 {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30 ,31, 30, 31}
	};
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	static class YMD {
		int y;
		int m;
		int d;
		
		YMD(int y, int m, int d){
			this.y = y;
			this.m = m;
			this.d = d;
		}
		void after(int n){
			d += n;
			if (mdays[isLeap(y)][m-1] < d){
				d -= mdays[isLeap(y)][m-1];
				m += 1;
			}
			System.out.println(y+"년 "+m+"월 "+d+"일");
			
		}
		void before(int n){
			d -= n;
			if(d<=0){
				d += mdays[isLeap(y)][m-2];
				m -= 1;
			}
			System.out.println(y+"년 "+m+"월 "+d+"일");
		}
	}
	public static void main(String[] args) {
		YMD a = new YMD(2019, 2, 3);
		a.after(3);
		a.before(1);
	}

}
