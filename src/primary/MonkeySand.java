package primary;

//5只猴子分一堆桃子，怎么也不能分成5等份，只好先去睡觉，准备第二天再分。
//夜里1只猴子偷偷爬起来，先吃掉1个桃子，然后将其分成5等份，藏起自己的一份就去睡觉了；
//第2只猴子又爬起来，吃掉1个桃子后，也将桃子分成5等分，藏起自己的一份睡觉去了；
//以后的3只猴子都先后照此办理。问最初至少有多少个桃子？
/**
 * 要假设第5只猴子时，平均每个猴子得到n个桃子 第五吃猴子吃掉一个桃子后剩5n个 第四只猴子吃掉一个桃子后剩5（5n+1）/4=25n/4+5/4
 * 第三只猴子吃掉一个桃子后剩5(25n/4+5/4+1)/4=125n/16+45/16
 * 第二只猴子吃掉一个桃子后剩5(125n/16+45/16+1)/4=625n/64+305/64
 * 第一只猴子吃掉一个桃子后剩5(625n/64+305/64+1)/4=3125n/256+1845/256
 * 原来共有桃子3125n/256+1845/256+1=3125n/256+2101/256=(12n+8)+53(n+1)/256
 * 这里是突破口：53（n+1）/256 是整数 桃子数是整数 所以n=255 桃子总数3121个。
 */
public class MonkeySand {
	public static void main(String[] args) {
		int i, m, j = 0, k, count;
		for (i = 4; i < 10000; i += 4) {
			count = 0;
			m = i;
			for (k = 0; k < 5; k++) {
				j = i / 4 * 5 + 1;
				i = j;
				if (j % 4 == 0)
					count++;
				else
					break;
			}
			i = m;
			if (count == 4) {
				System.out.println("原有桃子 " + j + " 个");
				break;
			}
		}
		// 起始值无所谓
		// System.out.println(s(10));
	}

	// 绝佳算法
	// private static int s(int i) {
	// int u = i;
	// // 5个猴子
	// for (int x = 0; x < 5; x++) {
	// // 余1
	// if (i % 5 != 1)
	// return s(u + 1);
	// // 假设最后的那只猴子E拿走了1个桃子，那么包括它吃掉的那只，应该看到了6只桃子；
	// // 猴子D连吃带拿后剩下的桃子就是6个，显示不是4的倍数
	// i = (i - 1) / 5 * 4;
	//
	// }
	// return u;
	//
	// }
}
