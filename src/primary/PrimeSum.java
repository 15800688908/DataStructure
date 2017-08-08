package primary;

public class PrimeSum {
	// 使用sqrt(n)的方法求出的素数不包括2和3
	public static void main(String[] args) {
		boolean b = false;
		// System.out.println(2 + " ");
		// System.out.println(3 + " ");
		// for (int i = 3; i < 100; i += 2) {
		// for (int j = 2; j < Math.sqrt(i); j++) {
		// if (i % j == 0) {
		// b = false;
		// break;
		// } else {
		// b = true;
		// }
		// }
		// if (b == true) {
		// System.out.println(i + " ");
		// }
		// }

		// 该程序使用除1位素数得2位方法，运行效率高通用性差
		int[] a = new int[] { 2, 3, 5, 7 };
		for (int j = 0; j < 4; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
		for (int i = 11; i < 100; i += 2) {
			for (int j = 0; j < 4; j++) {
				if (i % a[j] == 0) {
					b = false;
					break;
				} else {
					b = true;
				}
			}
			if (b == true) {
				System.out.println(i + " ");
			}
		}
	}
}
