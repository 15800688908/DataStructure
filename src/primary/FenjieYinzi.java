package primary;

import java.util.Scanner;

public class FenjieYinzi {
	public static void main(String[] args) {
		int x;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		x = in.nextInt();
		new PrimeSplit(x);// 匿名初始化一个对象，还有参数的构造函数
	}
}

class PrimeSplit {
	int k = 2;// 将最小的质数赋值给K

	public PrimeSplit(int x) {
		if (x <= 1) {
			System.out.println(x + "是无效的被分解数");
		} else if (x == 2) {
			// 如果是最小的质数2
			System.out.println(x + "分解后的质因数为：1*" + x);
		} else {
			// 1是所有的正整数的质数
			System.out.println(x + "分解后的质因数为：1");
			while (k <= x) {// 输入的数可以被k整除
				if (x % k == 0) {
					System.out.println("*" + k);// 将K添加到结果中
					x = x / k;// 除以最小的质数后重新循环
				} else {
					k++;
				}
			}
		}
	}
}