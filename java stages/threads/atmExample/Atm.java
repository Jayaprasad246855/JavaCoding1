package threads.atmExample;

public class Atm extends Thread{
    static volatile Integer totalMoney=60000;
    Benificiary b;
    Atm(Benificiary b)
    {
       this.b=b;
    }
    @Override
    public void run()
    {synchronized (totalMoney) {
        System.out.println(totalMoney);
        if (b.requiredAmount <= totalMoney) {
            System.out.println(b.name + " received money of rupees: " + b.requiredAmount);
            totalMoney = totalMoney - b.requiredAmount;
        } else {
            System.out.println("money not sufficient in atm. so please try again, " + b.name);
        }
//        System.out.println("in run meth current Thread is -->"+Thread.currentThread().getName()+" and priority -->"+Thread.currentThread().getPriority());
//        Thread.yield();
//        System.out.println("in run meth after yield Thread is -->"+Thread.currentThread().getName()+" and priority -->"+Thread.currentThread().getPriority());

    }
    }

    public static void main(String[] args) throws InterruptedException {
        //creating benificiary
        Benificiary b1=new Benificiary("pragnaya",10000);
        Benificiary b2=new Benificiary("sai",15000);
        Benificiary b3=new Benificiary("jay",50000);
        Benificiary b4=new Benificiary("yugu",20000);
        Benificiary b5=new Benificiary("priya",1000);
        Benificiary b6=new Benificiary("prasad",25250);

        //creating Threads
        Atm t1=new Atm(b1);
        Atm t2=new Atm(b2);
        Atm t3=new Atm(b3);
        Atm t4=new Atm(b4);
        Atm t5=new Atm(b5);
        Atm t6=new Atm(b6);
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t6.setPriority(Thread.MAX_PRIORITY);
        
        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");
        t4.setName("thread 4");
        t5.setName("thread 5");
        t6.setName("thread 6");

        //starting thread
        t1.start();
        Thread.sleep(10);
        t2.start();
        Thread.sleep(10);
        t3.start();
        Thread.sleep(10);
        t4.start();
        Thread.sleep(10);
        t5.start();
        Thread.sleep(10);
        t6.start();
        Thread.sleep(10);
        System.out.println("remaining money in Atm ="+totalMoney);
        System.out.println("program completed");
    }
}
