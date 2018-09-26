package threads;

public class Trex implements  Runnable{

    @Override
    public void run() {


     //   System.out.println("Thread in execution");

        for (int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {


                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {

        Trex o1=new Trex();
        Trex o2=new Trex();
       Thread t=new Thread(o1);
        Thread t1=new Thread(o1);
        t.start();
        t.join();//for execute first thread
        t1.start();
    }
}
