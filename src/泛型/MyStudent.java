package 泛型;

/**
 * 自定义泛型类：只能使用在成员变量上，而且只能使用引用类型
 * <> 里面是单个字母
 * 最好是见名知意
 * T：type
 * K V: key value
 * E: element
 * @author Administrator
 *
 */
public class MyStudent<T> {

	private T score;//考试分数 ，可能是整数，可能是小数也可能是字符串（优，良等）
	
	//private static T score1;   泛型不能定义到静态变量上

	public MyStudent(T score) {
		super();
		this.score = score;
	}

	public T getScore() {
		return score;
	}

	public void setScore(T score) {
		this.score = score;
	}
	
	
}
