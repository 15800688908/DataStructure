package primary;

/**
 * 
 * 题目要求很多
 *
 */
public class EightAndNine {
	public static void main(String[] args) {
		int a = 809, b;
		for (int i = 10; i < 13; i++) {
			b = i * a;
			if (8 * i < 100 && 9 * i >= 100)
				System.out.println("809*" + i + "=" + "800*" + i + "+" + "9*" + i + "=" + b);
		}
	}
}
