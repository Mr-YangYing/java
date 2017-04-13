package thread;

/**
 * 多线程第二种实现方式：代理模式
 *		实现Runnable接口，实现Run方法
 *		1、创建真实角色
 *		2、创建代理角色（Jdk已经提供了）  即Thread类+真实角色的引用
 *		3、代理角色.start();
 * @author Administrator
 *
 */
public class ThreadImplementsRunnable {
	
	/**
	 * 真实类
	 * @author Administrator
	 *
	 */
	static class RealThread implements Runnable{
		@Override
		public void run() {
			int tiket=50;
			while (true) {
				if(tiket<0){
					break;
				}
				System.out.println(Thread.currentThread().getName()+tiket);
				tiket--;
			}
		}		
	} 
	

	public static void main(String[] args) {
		
		//创建真实类对象
		RealThread realThread = new RealThread();
		//创建代理类
		Thread t1= new Thread(realThread, "1号窗口");
		Thread t2= new Thread(realThread, "2号窗口");
		Thread t3= new Thread(realThread, "3号窗口");
		
		//启动
		t1.start();
		t2.start();
		t3.start();
	}
}
