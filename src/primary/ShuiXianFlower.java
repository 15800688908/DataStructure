package primary;

public class ShuiXianFlower {
	// public static void main(String[] args) {
	// int i, j, k, sum;
	// for (int n = 100; n < 1000; n++) {
	// i = n / 100;
	// j = (n - i * 100) / 10;
	// k = n - i * 100 - j * 10;
	// sum = i * i * i + j * j * j + k * k * k;
	// if (sum == n) {
	// System.out.println(sum);
	// }
	// }
	// }
	public static void main(String[] args) {
		int sum;
		int i, j, k;
		for (i = 1; i <= 9; i++) {
			for (j = 0; j <= 9; j++) {
				for (k = 0; k <= 9; k++) {
					sum = i * i * i + j * j * j + k * k * k;
					if (i * 100 + j * 10 + k == sum) {
						System.out.println(sum);
					}
				}
			}
		}
	}
}
