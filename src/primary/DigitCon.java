package primary;

public class DigitCon {
	public static void main(String[] args) {
		// int count = 0;
		// for (int i = 1; i < 5; i++) {
		// for (int j = 1; j < 5; j++) {
		// for (int k = 1; k < 5; k++) {
		// if (i != j && j != k && i != k) {
		// count++;
		// System.out.println(i * 100 + j * 10 + k);
		// }
		// }
		// }
		// }
		// System.out.println("共有" + count + "个");

		int[] a = { 1, 2, 3, 4 };
		System.out.println("满足条件的三位数是：");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (j == i)
					continue;
				for (int k = 0; k < a.length; k++) {
					if (k == i || k == j)
						continue;
					for (int h = 0; h < a.length; h++) {
						if (h == i || h == j || h == k)
							continue;
						System.out.println(a[j] * 100 + a[k] * 10 + a[h]);
					}
				}
			}
		}
	}
}
