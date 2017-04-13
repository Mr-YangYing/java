package 泛型;

/**
 * 泛型接口：只能使用在抽象方法上
 * @author Administrator
 *
 */
public interface FanxingInterface<T> {

	/*public static final*/ int MAX_VALUE=33333;
	/*public static final*/ //T MAX_VALUE2=44444; 在接口中，泛型不能使用在常量上面
	
	/*public abstract*/ void compare(T t);
	public abstract T compare2(T t);
	
}
