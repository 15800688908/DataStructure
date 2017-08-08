package primary;

public class DiguiJiecheng {
	public static void main(String[] args) {
		int n = 5;
		Rec fr = new Rec();
		System.out.println(n + "!=" + fr.rec(n));
	}
}

class Rec {
	public long rec(int n) {
		long value = 0;
		if (n == 1) {
			value = 1;
		} else {
			value = n * rec(n - 1);
		}
		return value;
	}
}