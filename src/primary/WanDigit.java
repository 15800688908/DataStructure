package primary;

/**
 * 
 * 6 =1+2+3
 */
public class WanDigit {
	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			int t = 0;
			for (int j = 1; j <= i / 2; j++) {
				// 能被整除是因子
				if (i % j == 0) {
					t = t + j;
				}
			}
			if (t == i) {
				System.out.println(i + "是完数");
			}
		}
	}
}
