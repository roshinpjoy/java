package Thiss;

public class Thiis {
    String name;


    Thiis()
    {
        System.out.println("hai");
    }

    Thiis(String name)
    {
        this();
        this.name=name;
        System.out.println(name);
    }


    public static void main(String[] args) {

        //Thiss.Thiis t=new Thiss.Thiis();
        Thiis t1=new Thiis("roshin");

    }
}
