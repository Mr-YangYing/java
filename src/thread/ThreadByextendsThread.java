package thread;

/**
 * 多线程实现第一种方式：
 * 		1、继承thread类
 * 		2、实现run()方法
 * 		3、创建对象，调用start()方法
 * @author Administrator
 *
 */
public class ThreadByextendsThread{

	/**
	 * 模拟第一个线程
	 * @author Administrator
	 *
	 */
	static class Thread1 extends Thread{
		
		@Override
		public void run() {
			for(int i =0;i<100;i++ ){
				System.out.println("thread1"+"------"+i);
			}
		}
	}
	
	/**
	 * 模拟第二个线程
	 * @author Administrator
	 *
	 */
	static class Thread2 extends Thread{
		@Override
		public void run() {
			for(int i =0;i<100;i++ ){
				System.out.println("thread2"+"------"+i);
			}
		}
	}
	
	/**
	 * 主线程
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		
		//启动线程
		thread1.start();
		thread2.start();
	}
	
	
}
