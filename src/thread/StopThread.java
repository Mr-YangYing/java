package thread;

/**线程5大状态：新建状态、就绪状态、运行状态、阻塞状态及死亡状态
 * 
 * 线程运行状态：新生状态（创建）-->就绪状态-->运行状态-->阻塞状态-->就绪状态-->运行状态-->死亡状态（终止）
 * 
 *1.新建状态(New)： 
        当用new操作符创建一个线程时， 例如new Thread(r)，线程还没有开始运行，此时线程处在新建状态。 当一个线程处于新生状态时，程序还没有开始运行线程
        中的代码
  2.就绪状态(Runnable)
        一个新创建的线程并不自动开始运行，要执行线程，必须调用线程的start()方法。当线程对象调用start()方法即启动了线程，start()方法创建线程运行的
        系统资源，并调度线程运行run()方法。当start()方法返回后，线程就处于就绪状态。
        处于就绪状态的线程并不一定立即运行run()方法，线程还必须同其他线程竞争CPU时间，只有获得CPU时间才可以运行线程。因为在单CPU的计算机系统中，不可
        能同时运行多个线程，一个时刻仅有一个线程处于运行状态。因此此时可能有多个线程处于就绪状态。对多个处于就绪状态的线程是由Java运行时系统的线程调度程
        序(thread scheduler)来调度的。
  3.运行状态(Running)
        当线程获得CPU时间后，它才进入运行状态，真正开始执行run()方法.
  4.阻塞状态(Blocked)
        线程运行过程中，可能由于各种原因进入阻塞状态:
        1>线程通过调用sleep方法进入睡眠状态；
        2>线程调用一个在I/O上被阻塞的操作，即该操作在输入输出操作完成之前不会返回到它的调用者；
        3>线程试图得到一个锁，而该锁正被其他线程持有；
        4>线程在等待某个触发条件；
        ......           
        所谓阻塞状态是正在运行的线程没有运行结束，暂时让出CPU，这时其他处于就绪状态的线程就可以获得CPU时间，进入运行状态。
  5. 死亡状态(Dead)
        有两个原因会导致线程死亡：
        1) run方法正常退出而自然死亡，
        2) 一个未捕获的异常终止了run方法而使线程猝死。
        为了确定线程在当前是否存活着（就是要么是可运行的，要么是被阻塞了），需要使用isAlive方法。如果是可运行或被阻塞，这个方法返回true； 如果线程仍旧
        是new状态且不是可运行的， 或者线程死亡了，则返回false
        
         
  终止线程的三种方法 

    有三种方法可以使终止线程。 

    1.  使用退出标志，使线程正常退出，也就是当run方法完成后线程终止。 
    2.  使用stop方法强行终止线程（这个方法不推荐使用，因为stop和suspend、resume一样，也可能发生不可预料的结果）。 
    3.  使用interrupt方法中断线程。
    
 * @author Administrator
 *
 *	使用第一种方式
 *		1、在线程类中定义线程体使用的标志
 *		2、线程体使用该标志
 *		3、提供对外的方法改变该标志
 *		4、外部根据条件调用该方法即可
 *
 *
 */
public class StopThread {

	/**
	 * 线程测试类
	 * @author Administrator
	 *
	 */
	static class ThreadDemo implements Runnable{
		//1、在线程类中定义线程体使用的标志
		private boolean flag=true;
		@Override
		public void run() {
			//2、线程体使用该标志
			while (flag) {
				System.out.println(Thread.currentThread().getName());
			}
		}
		//3、提供对外的方法改变该标志
		public void stop() {
			this.flag=false;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		//开启一个线程
		new Thread(t1).start();
		
		//主线程执行
		for(int i =0;i<1000;i++){
			//4、外部根据条件调用该方法
			while (i==500) {
				t1.stop();
			}
			System.out.println(Thread.currentThread().getName()+i);
		}
	}

}
