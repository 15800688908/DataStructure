package primary;

/**
 * 
 * 2/1,3/2,5/3,8/5,13/8,21/13
 *
 */
public class DivideSum {
	public static void main(String[] args) {
		int x = 2, y = 1, t;
		double sum = 0;
		for (int i = 1; i <= 20; i++) {
			sum = sum + (double) x / y;
			t = y;
			y = x;
			x = y + t;
		}
		System.out.println("前20项的和是：" + sum);
	}
}
