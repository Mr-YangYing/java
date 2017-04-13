package genericity;

/**
 * 泛型父类
 * 1.保留父类泛型
 * 		子类必须是泛型
 * 2.不保留父类泛型
 * 		子类可以按需而定
 * 
 * 属性及方法类型-->随位置而定
 * 
 * 1.子类重写父类方法-->随父类而定
 * 	子类自己方法-->随子类而定
 * 2.子类使用父类成员变量-->随父类而定
 * 子类自己的成员变量-->随子类而定
 * 
 * @author Administrator
 *
 */
public abstract class FanxingFatherClass<T1,T2> {
	T1 age;//泛型使用到成员变量上
	public abstract void test(T2 name);//泛型使用到抽象方法上
}






//不保留父类的泛型，按照自己的需求实现泛型
/**
 * 1.没有类型（泛型擦除） 类似于<Objext,Object>，不等同于<Objext,Object>
 * @author Administrator
 *
 */
class son1 extends FanxingFatherClass{

	@Override
	public void test(Object name) {
		Object age2 = this.age;
	}}

class son_1<T3,T4> extends FanxingFatherClass{//不保留时子类即可以是泛型类（可以扩充自己的泛型），也可以不是泛型类son1

	@Override
	public void test(Object name) {
		Object age2 = this.age;
	}} 
/**
 * 2.具体类型，按照自己的需求
 * @author Administrator
 *
 */
class son2 extends FanxingFatherClass<Integer, String>{

	@Override
	public void test(String name) {
		Integer age2 = this.age;
	}
	
}
class son_2<T3,T4> extends FanxingFatherClass<Integer, String>{//不保留时子类即可以是泛型类（可以扩充自己的泛型），也可以不是泛型类son2

	@Override
	public void test(String name) {
		Integer age2 = this.age;
	}
	
}


//保留父类的泛型--》泛型子类
/**
 * 1.部分保留，子类必须实现
 * @author Administrator
 *
 * @param <T2>
 */
class son3<T2> extends FanxingFatherClass<Integer, T2>{

	@Override
	public void test(T2 name) {
		Integer age2 = this.age;
	}
	
}
class son_3<T2,T3,T4> extends FanxingFatherClass<Integer, T2>{//保留时子类必须是泛型类，还可以扩充自己的泛型

	@Override
	public void test(T2 name) {
		Integer age2 = this.age;
	}
	
}
/**
 * 2.全部保留，子类必须全部实现
 * @author Administrator
 *
 * @param <T1>
 * @param <T2>
 */
class son4<T1, T2> extends FanxingFatherClass<T1, T2>{

	@Override
	public void test(T2 name) {
		T1 age2 = this.age;
	}
	
}
class son_4<T1,T2,T3,T4> extends FanxingFatherClass<T1, T2>{//保留时子类必须是泛型类，还可以扩充自己的泛型

	@Override
	public void test(T2 name) {
		T1 age2 = this.age;
	}
	
}