package p1;

public class Prott {

    protected int id;
    protected String name;


    protected void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }







    public static void main(String[] args) {
        Prott obj = new Prott();
        obj.id = 10;
        obj.name = "Ag";
        obj.display();
    }
}
