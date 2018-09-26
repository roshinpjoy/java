package inter;

public class Imain {
    public static void main(String[] args) {
        inrerx p=new Child1();
        inrerx p1=new Child2();

        System.out.println("c1 behaviours");

        p.walk();
        p.talk();
        p.smile();





        System.out.println("c2 behaviours");

        p1.smile();
        p1.talk();
        p1.walk();





    }
}
