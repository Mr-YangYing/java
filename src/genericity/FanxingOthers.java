package genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的其他注意事项
 * @author Administrator
 *
 */
public class FanxingOthers {

	static class Fruit{}
	static class Apple extends Fruit{}
	static class Pear extends Fruit{}
	static class HongFuShi extends Apple{}
	
	public static void main(String[] args) {
		//1.泛型没有多态
		List<Fruit> list = new ArrayList<Fruit>();
		//List<Fruit> list = new ArrayList<Apple>();
		//2.泛型没有数组
		Fruit[] fruits = new Fruit[10];
		//Fruit<String>[] fruits = new Fruit<String>[10];
		//3.泛型jdk1.7新写法,后面不用指定类型
		List<Fruit> list2 = new ArrayList<Fruit>();
		List<Fruit> list3 = new ArrayList<>();
	}
}
