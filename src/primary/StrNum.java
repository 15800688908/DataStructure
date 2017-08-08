package primary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrNum {
	public static void main(String args[]) {

		// Scanner s = new Scanner(System.in);
		//
		// System.out.print("请输入字符串：");
		//
		// String str1 = s.nextLine();
		//
		// System.out.print("请输入子串：");
		//
		// String str2 = s.nextLine();
		//
		// int count = 0;
		//
		// if (str1.equals("") || str2.equals(""))
		//
		// {
		//
		// System.out.println("你没有输入字符串或子串,无法比较!");
		//
		// System.exit(0);
		//
		// }
		//
		// else
		//
		// {
		//
		// for (int i = 0; i <= str1.length() - str2.length(); i++)
		//
		// {
		//
		// if (str2.equals(str1.substring(i, str2.length() + i)))
		//
		// // 这种比法有问题，会把"aaa"看成有2个"aa"子串。
		//
		// count++;
		//
		// }
		//
		// System.out.println("子串在字符串中出现: " + count + "次");
		//
		// }

		String srcText = "Hello World";
		String findText = "e";
		int num = appearNumber(srcText, findText);
		System.out.println(num);

	}

	// public static int appearNumber(String srcText, String findText) {
	// int count = 0;
	// Pattern p = Pattern.compile(findText);
	// Matcher m = p.matcher(srcText);
	// while (m.find()) {
	// count++;
	// }
	// return count;
	// }

	public static int appearNumber(String srcText, String findText) {
		int count = 0;
		int index = 0;
		while ((index = srcText.indexOf(findText, index)) != -1) {
			index = index + findText.length();
			count++;
		}
		return count;
	}
}
