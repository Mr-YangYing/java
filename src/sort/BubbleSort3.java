package sort;

import java.util.Arrays;

/**
 * 冒泡排序最终版：如果有的数组已经有顺序了，那就直接停止排序
 * @author Administrator
 *
 */
public class BubbleSort3 {

	//两个版本比较，最终版比较的趟数更少
	public static void main(String[] args) {
		
		int[] arr = { 1, 9, 4, 5, 7, 10 };
		System.out.println("---------优化版--------");
		sort2(arr);    //优化版 
		
		
		arr =new int[]{ 1, 9, 4, 5, 7, 10 };
		System.out.println("---------最终版--------");
		sort1(arr);   //最终版
	}

	/**
	 * 
	 * 冒泡排序最终版方法
	 * 
	 * @param arr
	 */
	public static void sort1(int[] arr) {
		int len = arr.length;// 数组长度
		boolean sorted = true;   //用于标识数组是否有序
		for (int i = 0; i < len - 1; i++) {
			sorted =true;        //每一趟比完之后都假设数组已经有序
			System.out.println("第" + (i + 1) + "趟比较");
			for (int j = 0; j < len - 1 - i; j++) {        //每比较一趟完后，就少一次比较，因为前面已经比较过了
				System.out.print("第" + (j + 1) + "次");
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					sorted = false;    //如果进入比较，就说明数组还是无序，还需要比较   ，上面的假设失败
				}
				System.out.println(Arrays.toString(arr));
			}
			
			//每一趟比较完之后，判断数组是否已经有序，如果有序，那么就直接跳出循环，这样就可以减少比较的趟数
			if(sorted==true){
				break;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	/**
	 * 
	 * 冒泡排序优化版方法
	 * 
	 * @param arr
	 */
	public static void sort2(int[] arr) {
		int len = arr.length;// 数组长度
		for (int i = 0; i < len - 1; i++) {
			System.out.println("第" + (i + 1) + "趟比较");
			for (int j = 0; j < len - 1 - i; j++) {        //每比较一趟完后，就少一次比较，因为前面已经比较过了
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
