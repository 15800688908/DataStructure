package primary;

import java.util.Scanner;

public class JudgeDay {
	public static void main(String[] args) {
		int year, month, day;
		int days = 0;
		int d = 0;
		int e;
		Input fymd = new Input();
		do {
			e = 0;
			System.out.println("输入年：");
			year = fymd.input();
			System.out.print("输入月：");
			month = fymd.input();
			System.out.print("输入天：");
			day = fymd.input();
			if (year < 0 || month < 0 || month > 12 || day < 0 || day > 31) {
				System.out.println("输入错误，请重新输入");
				e = 1;
			}
		} while (e == 1);
		for (int i = 1; i <= month; i++) {
			switch (month) {
			case 1:
				days = day;
				break;
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:

			case 6:

			case 9:

			case 11:

				days = 30;

				break;

			case 2:
				// 判断闰年
				if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			}
			d += days;
		}
		System.out.println(year + "-" + month + "-" + day + "是这年的第" + d + "天");
	}

}

class Input {
	public int input() {
		int value = 0;
		Scanner scanner = new Scanner(System.in);
		value = scanner.nextInt();
		return value;
	}
}