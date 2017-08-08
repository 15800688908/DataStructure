package primary;

import java.util.Scanner;

public class HuiWen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		do {
			System.out.println("请输入一个5位正整数：");
			a = scanner.nextInt();
		} while (a < 10000 || a > 99999);
		String ss = String.valueOf(a);
		char[] ch = ss.toCharArray();
		if (ch[0] == ch[4] && ch[1] == ch[3]) {
			System.out.println("这是一个回文数");
		} else {
			System.out.println("这不是一个回文数");
		}
		/**j=ch.length;
		 * for(int i=0;i<j/2;i++)
		 * if(ch[i]=ch[j-i-1])
		 */
	}
}
