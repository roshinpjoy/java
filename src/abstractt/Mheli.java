package abstractt;

public class Mheli {
    public static void main(String[] args) {
        abb s = new aero();
        abb s2 = new Heli();
        System.out.println("..............");
        s.quantity();
        s.speed();
        s.color();
        s.deep();
        /*((aero) s).message();*/

        System.out.println("..............");
        s2.speed();
        System.out.println("..............");
        s2.quantity();
        s2.color();
        s2.deep();
        /*((Heli) s2).heli();*/

       abb s3=new abb() {
           @Override
           void quantity() {
               System.out.println("inside abb");
           }
       };
        System.out.println(" ");
       s3.color();
       s3.speed();
       s3.deep();
        System.out.println(" ");
        s3.quantity();
    }
}
