package primary;

public class IsPrime {
	public static void main(String[] args) {
		// n用来存储余数，m用来统计具体一个数的因子
		int n = 0, m = 0, x = 0;
		// x用来统计素数的个数
		for (int i = 101; i <= 200; i++) {
			for (int j = 1; j <= i; j++) {
				n = i % j;
				if (n == 0) {
					m = m + 1;
				}
			}
			if (m == 2) {
				System.out.println(i + "");
				x = x + 1;
			}
			m = 0;// 一定要清零，不然会继续累加
		}
		System.out.println("一共有素数：" + x + "个");
	}
}
