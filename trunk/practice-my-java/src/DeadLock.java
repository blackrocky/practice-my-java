/**
 * DeadLock example
 * @author blackrocky
 *
 */
public class DeadLock {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				synchronized(Integer.class) {
					System.out.println("thread 1: lock on Integer");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(String.class) {
						System.out.println("thread 1: lock on String");
					}
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				synchronized(String.class) {
					System.out.println("thread 2: lock on String");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(Integer.class) {
						System.out.println("thread 2: lock on Integer");
					}
				}
			}
		});

		t1.start();
		t2.start();
	}
}
