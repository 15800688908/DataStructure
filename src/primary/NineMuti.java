package primary;

public class NineMuti {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + " ");
				if (j * i < 10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
