package statics;

class S1 {

    int id;
    String name;


    public  static void see()
    {
        System.out.println("haiii");
    }

    public void display()
    {
        System.out.println("a"+id);
        System.out.println("b"+name);


    }


}



public class Sample
{
    public static void main(String[] args) {
        S1 s=new S1();
        s.id=10;
        s.name="roshin";
        s.display();
        //System.out.println(s1.see());
        S1.see();

    }
}
