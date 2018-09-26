package Thiss;

public class ThisEx {

    public  void  display()
    {
        System.out.println(this);

    }

    public static void main(String[] args) {
        ThisEx t=new ThisEx();
        t.display();
        System.out.println("hash code for object"+t);//why

    }


}
