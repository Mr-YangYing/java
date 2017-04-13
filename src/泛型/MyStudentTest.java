package 泛型;

/**
 * 自定义泛型类测试
 * @author Administrator
 *
 */
public class MyStudentTest {

	public static void main(String[] args) {
		
		MyStudent<Integer> myStudent = new MyStudent<Integer>(99);
		
		MyStudent<String> myStudent2 = new MyStudent<String>("优");	
		
		//MyStudent<int> myStudent3 = new MyStudent<int>(99); 泛型的使用不能用普通类型，只能是引用类型
 		
		System.out.println(myStudent.getScore());
		
		System.out.println(myStudent2.getScore());
		
	}
}
