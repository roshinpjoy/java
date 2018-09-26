package oride;

public class Oridemain {
    public static void main(String[] args) {
        Orideve v = new Orideve();// If a Parent type reference refers to a Parent object

         //v.clutch();
         /*v.drive();
        v.wheel();*/

        System.out.println("Method Overriding...");

        v=new Oridecar();//If a Parent type reference refers  to a Child object

        v.wheel();
        ((Oridecar) v).speed();


           v.drive();
           v.clutch();

        Orideswift s = new Orideswift();
        /*s.clutch();
        s.drive();
        s.speed();
        s.wheel();*/
    }
}