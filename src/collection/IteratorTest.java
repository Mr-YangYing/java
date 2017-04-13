package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器遍历List和Set
 * Set只能用迭代器遍历和增强for遍历,不能用普通for，因为是无序的
 * 
 * 迭代器遍历的时候还可以对遍历的元素进行操作，而for循环不行
 * @author Administrator
 *
 */
public class IteratorTest {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(6);
		list.add(9);
		IteratorTest iteratorTest = new IteratorTest();
		iteratorTest.listByFor(list);
		iteratorTest.listByIterator1(list);
		iteratorTest.listByIterator2(list);
	}
	
	/**
	 * for循环遍历list
	 * @param list
	 */
	public void listByFor(List<Object> list){
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	/**
	 * while循环遍历List
	 * @param list
	 */
	public void listByIterator1(List<Object> list){
		Iterator<Object> iterator = list.iterator();
		while (iterator.hasNext()) {	//判断是否还有下一个元素
			Object object = (Object) iterator.next(); //返回当前遍历到的元素，然后将游标移动指向下一个元素
			System.out.println(object);
		}
	}
	/**
	 * for循环遍历List
	 * @param list
	 */
	public void listByIterator2(List<Object> list){
		for (Iterator<Object> iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			iterator.remove();//遍历的过程中还可以对元素进行操作
			System.out.println(object);
			
		}
	}
}
