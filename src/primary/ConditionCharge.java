package primary;

public class ConditionCharge {
	public static void main(String[] args) {
		int score = 90; // 分数的值可以随便修改
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 60) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}
}
