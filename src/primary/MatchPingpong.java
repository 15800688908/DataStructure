package primary;

import java.util.ArrayList;

/**
 * 
 * a不和x比，c不和x,z比
 *
 */
public class MatchPingpong {
	// static char[] m = { 'a', 'b', 'c' };
	// static char[] n = { 'x', 'y', 'z' };
	//
	// public static void main(String[] args) {
	// for (int i = 0; i < m.length; i++) {
	// for (int j = 0; j < n.length; j++) {
	// if (m[i] == 'a' && n[j] == 'x') {
	// continue;
	// } else if (m[i] == 'a' && n[j] == 'y') {
	// continue;
	// } else if ((m[i] == 'c' && n[j] == 'x') || (m[i] == 'c' && n[j] == 'z'))
	// {
	// continue;
	// } else if ((m[i] == 'b' && n[j] == 'z') || (m[i] == 'b' && n[j] == 'y'))
	// {
	// continue;
	// } else {
	// System.out.println(m[i] + " vs " + n[j]);
	// }
	// }
	// }
	// }

	// String a, b, c;
	//
	// public static void main(String[] args) {
	// String[] op = { "x", "y", "z" };
	// ArrayList<MatchPingpong> arrayList = new ArrayList<MatchPingpong>();
	// for (int i = 0; i < 3; i++)
	// for (int j = 0; j < 3; j++)
	// for (int k = 0; k < 3; k++) {
	// MatchPingpong match = new MatchPingpong(op[i], op[j], op[k]);
	// if (!match.a.equals(match.b) && !match.b.equals(match.c) &&
	// !match.a.equals("x")
	// && !match.c.equals("x") && !match.c.equals("z")) {
	// arrayList.add(match);
	// }
	// }
	// for (Object match : arrayList) {
	// System.out.println(match);
	// }
	// }
	//
	// public MatchPingpong(String a, String b, String c) {
	// super();
	// this.a = a;
	// this.b = b;
	// this.c = c;
	// }
	//
	// @Override
	// public String toString() {
	// // TODO Auto-generated method stub
	// return "a的对手是" + a + "," + "b的对手是" + b + "," + "c的对手是" + c + "\n";
	// }

	public static void main(String[] args) {
		Character[] b = { 'x', 'y', 'z' };
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 3; k++) {
				if (j == k)
					continue;
				for (int h = 0; h < 3; h++) {
					if (h == j || h == k)
						continue;
					if (b[j] != 'x' && b[h] != 'x' && b[h] != 'z') {
						String s1 = b[j].toString();
						String s2 = b[k].toString();
						String s3 = b[h].toString();
						System.out.println(" a" + "(vs)" + s1 + " b" + "(vs)" + s2 + " c" + "(vs)" + s3);
					}
				}
			}
		}
	}

}
