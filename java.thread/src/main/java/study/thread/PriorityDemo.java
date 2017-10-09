package study.thread;

/**
 * 线程优先级
 * @author ASUS
 * 创建时间  2017年9月17日 下午11:13:46
 *
 */
public class PriorityDemo {

	public static class HightPriority extends Thread{
		static int count =0;
		
		@Override
		public void run() {
			while(true) {
				 synchronized (PriorityDemo.class) {
					count++;
					if(count>1000000) {
						System.out.println("HightPriority is complete");
						break;
					}
				}
			}
		}
	}
	
	public static class LowPriority extends Thread{
		static int count =0;
		
		@Override
		public void run() {
			while(true) {
				 synchronized (PriorityDemo.class) {
					count++;
					if(count>1000000) {
						System.out.println("LowPriority is complete");
						break;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Thread high =new HightPriority();
		LowPriority lowPriority=new  LowPriority();
		high.setPriority(Thread.MAX_PRIORITY);
		lowPriority.setPriority(Thread.MIN_PRIORITY);
		lowPriority.start();
		high.start();
	}
}
