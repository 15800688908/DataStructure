package sort;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		int[] array = { 23, 34, 5, 7, 56 };
		// bort sort
		// for (int i = 0; i < array.length - 1; i++) {
		// for (int j = 0; j < array.length - 1 - i; j++) {
		// int temp;
		// if (array[j] > array[j + 1]) {
		// System.out.println(i + "," + j);
		// temp = array[j];
		// array[j] = array[j + 1];
		// array[j + 1] = temp;
		// }
		// }
		// }

		// select sort（record index)
		// for (int i = 0; i < array.length - 1; i++) {
		// int selectElement = array[i];
		// for (int j = i; j < array.length - 1; j++) {
		// int temp;
		// if (selectElement > array[j + 1]) {
		// System.out.println(i + "," + j);
		// //key step
		// selectElement = array[j + 1];
		// temp = array[i];
		// array[i] = array[j + 1];
		// array[j + 1] = temp;
		//
		// }
		// System.out.println(Arrays.toString(array));
		// }
		// System.out.println(Arrays.toString(array));
		// }
		//
		// for (int i = 0; i < array.length - 1; i++) {
		// int min = i;
		// for (int j = i; j < array.length - 1; j++) {
		// int temp;
		// if (array[min] > array[j + 1]) {
		// System.out.println(i + "," + j);
		// temp = array[min];
		// array[min] = array[j + 1];
		// array[j + 1] = temp;
		// }
		// System.out.println(Arrays.toString(array));
		// }
		// System.out.println(Arrays.toString(array));
		// }

		for (int i = 0; i < array.length - 1; i++) {
			int min = i;// 未排序序列中最小数据数组下标
			for (int j = i + 1; j < array.length; j++)// 在未排序元素中继续寻找最小元素，并保存其下标
				if (array[min] > array[j]) {
					System.out.println(i+","+j);
					min = j;
				}
			int temp = array[min]; // 将最小元素放到已排序序列的末尾
			array[min] = array[i];
			array[i] = temp;
			System.out.println(Arrays.toString(array));
		}

		System.out.println(Arrays.toString(array));
	}

}
