package thread;

/**
 * thread.Join()
 * 	把指定的线程加入到当前线程，可以将两个交替执行的线程合并为顺序执行的线程。
 * 	比如在线程B中调用了线程A的Join()方法，直到线程A执行完毕后，才会继续执行线程B。
 * 
 * Thread.yield()方法：是一个静态方法
	使当前线程从执行状态（运行状态）变为可执行态（就绪状态）。cpu会从众多的可执行态里选择，也就是说，当前也就是刚刚的那个线程还是有可能会被再次执行
	到的，并不是说一定会执行其他线程而该线程在下一次中不会执行到了。Java线程中有一个Thread.yield( )方法，很多人翻译成线程让步。顾名思义，就
	是说当一个线程使用了这个方法之后，它就会把自己CPU执行的时间让掉，让自己或者其它的线程运行。打个比方：现在有很多人在排队上厕所，好不容易轮到这个
	人上厕所了，突然这个人说：“我要和大家来个竞赛，看谁先抢到厕所！”，然后所有的人在同一起跑线冲向厕所，有可能是别人抢到了，也有可能他自己有抢到了。
	我们还知道线程有个优先级的问题，那么手里有优先权的这些人就一定能抢到厕所的位置吗? 不一定的，他们只是概率上大些，也有可能没特权的抢到了。
 * 
 * @author Administrator
 *
 */
public class JoinAndYield {
	
	public static void main(String[] args) throws InterruptedException {
			//创建一个线程
		Thread t1=new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i =0;i<1000;i++){
						System.out.println("join"+i);
					}
				}
			});
		
		//启动线程
		t1.start();
		
		//主线程
		for(int i =0;i<1000;i++){
			if(i==50){
				//t1.join();//在主线程种调用线程t1的jion()方法，那么要等到t1执行完毕后才能执行主线程
				
				Thread.yield();//主线程调用yield(),表示主线程暂停执行，并执行其他线程，不过只是让步，并不代表该线程下一次不会抢到执行权
			}
			System.out.println("main"+i);
		}
	}
}
