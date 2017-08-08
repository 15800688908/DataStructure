package primary;

public class MaxAndMinGCDLCM {
	public static void main(String[] args) {
		GCDLCM t = new GCDLCM();
		System.out.println("两数的最大公约数是：" + t.gcd(10, 16));
		System.out.println("两数的最小公倍数是：" + t.lcm(16, 10));
	}
}

class GCDLCM {

	int gcd(int i, int j) {
		if (i < j) {// 这个是将大数放在前面
			int temp = j;
			j = i;
			i = temp;
		}
		if (i % j == 0) {
			return j;
		} else {
			i = i % j;
			return gcd(i, j);
			// 这里可以写成gcd（j,i），就省掉了前面的判断，会快一点
		}
	}

	int lcm(int i, int j) {
		int k = 1;
		if (i < j) {// 这个是将大数放在前面
			int temp = j;
			j = i;
			i = temp;
		}
		int lcm = i;
		while (lcm % j != 0) {// 直到可以除尽小的数为止
			lcm = i * k;
			k++;
		}
		return lcm;
	}

}