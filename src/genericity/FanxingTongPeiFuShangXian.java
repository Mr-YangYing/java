package genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * ？ extends 泛型通配符--->上限，<=  即只能是子类或者实现类来实现
 * @author Administrator
 *
 */
public class FanxingTongPeiFuShangXian {

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
	public static void test(List<? extends Fruit> list){
		//报错，因为还不确定它的实现，所以也不能确定里面放的东西
		/*list.add(new Fruit());
		list.add(new Apple());
		list.add(new Pear());
		list.add(new HongFuShi());*/
		
	};
	
	public static void main(String[] args) {
		List<? extends Fruit> list1 = new ArrayList<Fruit>();
		test(list1);//同样的
		List<Fruit> list2 = new ArrayList<Fruit>();
		test(list2);//等于Fruit
		List<Apple> list3 = new ArrayList<Apple>();
		test(list3);//子类
		List<? extends Apple> list4 = new ArrayList<Apple>();
		test(list4);
		
		//报错 ？等同于  ？ extends Object
		/*List<?> list5 = new ArrayList<Fruit>();
		test(list5);*/
		
  	}
	
}
