package programs;

 public class DefaultEx {

    int id=10;
    String name="asa";

    public  void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }

}


class MainDefaultEx{
    public static void main(String[] args)
    {
        DefaultEx obj = new DefaultEx();
        obj.display();


    }
}





