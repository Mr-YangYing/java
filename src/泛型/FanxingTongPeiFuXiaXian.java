package 泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * ? super 泛型通配符上限， >=   即只能是自己或者父类来实现
 * @author Administrator
 *
 */
public class FanxingTongPeiFuXiaXian {
	/**
	 * 继承体系
	 * 		Fruit		
	 * 		/	\
	 *  Apple  	 Pear
	 * 		/
	 * HongFuShi
	 * 
	 * @author Administrator
	 *
	 */
	static class Fruit{}
	static class Apple extends Fruit{}
	static class Pear extends Fruit{}
	static class HongFuShi extends Apple{}
	
	

	
	/**
	 * 泛型方法
	 * @param list
	 */
	public static void test(List<? super Apple> list){
		
		//list.add(new Fruit());//如果是 new ArrayList<Apple>()，就不能放了
		//list.add(new Pear());//如果是 new ArrayList<Apple>()，就不能放了
		list.add(new Apple());
		list.add(new HongFuShi());
		
	};
	
	public static void main(String[] args) {
		List<? super Apple> list1 = new ArrayList<Fruit>();
		test(list1);//同样的
		List<Fruit> list2 = new ArrayList<Fruit>();
		test(list2);//等于Fruit,父类
		List<Apple> list3 = new ArrayList<Apple>();
		test(list3);//自己
		List<? super Fruit> list4 = new ArrayList<Object>();
		test(list4);
		
		//报错 ？等同于  ？ extends Object
		/*List<?> list5 = new ArrayList<Fruit>();
		test(list5);*/
		
  	}
}
