package genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * ？：泛型通配符，即类型不确定。只能用在变量声明和方法形参上
 * @author Administrator
 *
 */
public class FanxingTongPeiFu {

	public static void main(String[] args) {
		List<?> list;//？用在声明上
		list=new ArrayList<Integer>();//使用的时候具体指明
		list=new ArrayList<String>();
		
		test(list);
	}
	
	/**
	 * ?用在方法形参上，调用的时候在具体指明
	 * @param list
	 */
	public static void test(List<?> list){
		
	}
}
