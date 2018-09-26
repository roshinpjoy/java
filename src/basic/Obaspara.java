package basic;

public class Obaspara {
    int id;
    String name;
    String address;
    public  Obaspara(int id,String name,String address)
    {
        this.id=id;
        this.name=name;
        this.address=address;

    }

    public  void display(Obaspara obj)
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);

    }


}

class Maa
{
    public static void main(String[] args) {
        Obaspara o=new Obaspara(11,"ris","pu");
        Obaspara o1=new Obaspara(11,"ris","pu");
        //basic.Obaspara o3=new basic.Obaspara(); is it possible to make simple object
        o.id=20;
        o.name="joy";
        o.address="add";
        o.display(o);
        o1.display(o1);
    }

}
