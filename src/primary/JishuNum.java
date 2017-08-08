package primary;

public class JishuNum {
	public static void main(String[] args) {
		int sum = 4;
		int j;
		System.out.println("组成1位数是" + sum + "个");
		sum = sum * 7;
		System.out.println("组成2位数是" + sum + "个");

		for (j = 3; j <= 8; j++) {
			sum = sum * 8;
			System.out.println("组成" + j + "位数是" + sum + "个");
		}
	}
}
