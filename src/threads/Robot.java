package threads;

public class Robot {
    String name="roshin";//instance variable

    public Robot(String nam)//local variable
    {
        this.name=nam;
    }
    public Robot(){
        System.out.println("hai");
    }
    public void walk(int x) throws InterruptedException {
        for(int i=0;i<x;i++)
        {
            System.out.println(name+"Walks:"+i);
            Thread.sleep(6000);
        }
        System.out.println(" namm"+name);
    }

}
