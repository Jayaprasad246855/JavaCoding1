package threads;

public class SYnchronisationDemo implements Runnable{
    static volatile long i=2l;
    @Override
    public synchronized void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(long j=0;j<2;j++) {
            i = i * 2;
        }
        System.out.println(i);
    }

    public static void main(String[] args) throws InterruptedException {
        SYnchronisationDemo r1=new SYnchronisationDemo();
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r1);
        Thread t3=new Thread(r1);
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(600);
        System.out.println("in main meth="+SYnchronisationDemo.i);
        
    }
}
