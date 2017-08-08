package primary;

public class MonkeyEat {
	public static void main(String[] args) {
		int x = 1;
		// 逆推
		for (int i = 2; i <= 3; i++) {
			x = (x + 1) * 2;
		}
		System.out.println("猴子第一天摘了" + x + "个桃子");
	}
}
