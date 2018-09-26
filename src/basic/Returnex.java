package basic;

public class Returnex {
    int speed;
    String name;
    public int getspeed()

    {
        return  speed;
    }
    public String getname()
    {
        return name;
    }
    public static void main(String[] args) {
        Returnex obj=new Returnex();
        obj.speed=100;
        int i=obj.getspeed();
        System.out.println("speed"+i);

        obj.name="roshin";
        String str =obj.name;
        System.out.println(str);




    }
}
