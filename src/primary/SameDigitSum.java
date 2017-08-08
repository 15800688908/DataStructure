package primary;

import java.util.Scanner;

public class SameDigitSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int n = input.nextInt();
		System.out.println("请输入需要相加的个数：");
		int number = input.nextInt();
		input.close();
		System.out.println("计算输出结果为：");
		System.out.print("s=");
		System.out.print(count(n, number));
	}

	private static int count(int n, int number) {
		int s = 0;// s为每一个叠数
		int sum = 0;// sum为最后的总和
		for (int i = 1; i <= number; i++) {
			// 调用形成叠数的方法
			s = compute(n, i);
			// 区分是不是最后一个数
			if (i == number) {
				System.out.print(s);
			} else {
				System.out.print(s + "+");
			}
			sum += s;
		}
		System.out.print("=");
		return sum;
	}

	private static int compute(int n, int number) {
		int m = 0;
		for (int i = 0; i < number; i++) {
			// 从0次幂到number次幂形成叠数，如22222=2*10^4+2*10^3+2*10^2+2*10^1+2*10^0
			m += (int) (n * Math.pow(10, i));
		}
		return m;
	}
}
