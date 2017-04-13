package sort;

import java.util.Arrays;

/**
 * 冒泡排序简易版,每一趟都是5次比较，第一次以后的都有重复的比较
 * 第1趟比较
	第1次[8, 9, 4, 5, 7, 2]
	第2次[8, 4, 9, 5, 7, 2]
	第3次[8, 4, 5, 9, 7, 2]
	第4次[8, 4, 5, 7, 9, 2]
	第5次[8, 4, 5, 7, 2, 9]
        第2趟比较
	第1次[4, 8, 5, 7, 2, 9]
	第2次[4, 5, 8, 7, 2, 9]
	第3次[4, 5, 7, 8, 2, 9]
	第4次[4, 5, 7, 2, 8, 9]
	第5次[4, 5, 7, 2, 8, 9]
       第3趟比较
	第1次[4, 5, 7, 2, 8, 9]
	第2次[4, 5, 7, 2, 8, 9]
	第3次[4, 5, 2, 7, 8, 9]
	第4次[4, 5, 2, 7, 8, 9]
	第5次[4, 5, 2, 7, 8, 9]
       第4趟比较
	第1次[4, 5, 2, 7, 8, 9]
	第2次[4, 2, 5, 7, 8, 9]
	第3次[4, 2, 5, 7, 8, 9]
	第4次[4, 2, 5, 7, 8, 9]
	第5次[4, 2, 5, 7, 8, 9]
       第5趟比较
	第1次[2, 4, 5, 7, 8, 9]
	第2次[2, 4, 5, 7, 8, 9]
	第3次[2, 4, 5, 7, 8, 9]
	第4次[2, 4, 5, 7, 8, 9]
	第5次[2, 4, 5, 7, 8, 9]
 * 
 * @author Administrator
 *
 */
public class BubbleSort1 {
	public static void main(String[] args) {
		// int[] arr = new int[]{8,9,4,5,7,2};
		int[] arr = { 8, 9, 4, 5, 7, 2 };
		sort(arr);
	}

	/**
	 * 
	 * 冒泡排序方法
	 * 
	 * @param arr
	 */
	public static void sort(int[] arr) {
		int len = arr.length;// 数组长度
		for (int i = 0; i < len - 1; i++) {
			System.out.println("第" + (i + 1) + "趟比较");
			for (int j = 0; j < len - 1; j++) {
				System.out.print("第" + (j + 1) + "次");
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
