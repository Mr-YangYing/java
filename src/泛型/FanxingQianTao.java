package 泛型;

/**
 * 泛型嵌套
 * @author Administrator
 *
 */
public class FanxingQianTao {
	
	/**
	 * 学生类
	 * @author Administrator
	 *
	 * @param <T>
	 */
	static class Student<T>{
		private T score;

		public T getScore() {
			return score;
		}

		public void setScore(T score) {
			this.score = score;
		}
		
	}
	/**
	 * 班级类
	 * @author Administrator
	 *
	 * @param <T>
	 */
	static class Grade<T>{
		private T stu;

		public T getStu() {
			return stu;
		}

		public void setStu(T stu) {
			this.stu = stu;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Student<String> student = new Student<>();
		student.setScore("优秀");
		
		//泛型嵌套
		Grade<Student<String>> grade = new Grade<>();
		Student<String> stu = grade.getStu();
		String score = stu.getScore();
	}
}
