package genericity;

import java.util.List;

/**
 * 泛型方法
 * @author Administrator
 *
 */
public class FanxingMethod {

	public static <T> void test1(){
		
	}
	/**
	 * extends 使用的时候T必须是List的实现类 
	 * @param t
	 */
	public static <T extends List> void test2(T t){
		t.add(1);
	}
}
