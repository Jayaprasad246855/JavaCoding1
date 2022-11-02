package threads;

public class RunnableInterface implements Runnable {

	Thread t;

	@Override
	public void run() {
		System.out.println("thread by runnable is running");
	}

	RunnableInterface(Runnable r, String threadName) {
		this.t = new Thread(r, threadName);
		t.start();
	}

	RunnableInterface() {

	}

	public static void main(String[] args) throws InterruptedException {
		new RunnableInterface(new RunnableInterface(), "thread1");

	}
}
