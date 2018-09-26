package threads;

public class Thredex {




    public static void main(String[] args) {
        First t1=new First();
        //t1.run();
        t1.start();
        Second t2=new Second();
        t2.start();
        //t2.run();

    }
}


class  First extends Thread {

    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("F thread");
            /*try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

        }
    }
}

class Second extends Thread {
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("S thread");
            /*try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
*/
        }
    }


}





