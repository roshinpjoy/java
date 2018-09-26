package threads;

public class T1x  extends Thread {

    @Override
    public void run() {

     System.out.println("thread in execution"+Thread.currentThread().getName());

        for (int i=0;i<4;i++)
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

    public static void main(String[] args) {

        T1x t=new T1x();
        T1x t1=new T1x();
        t.start();
        t1.start();

    }
}
