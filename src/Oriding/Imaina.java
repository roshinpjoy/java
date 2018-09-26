package Oriding;

public class Imaina {
    public  static void main(String[] args) {
        Ianimal animal = new Ianimal();
        animal.talk();
        animal.walk();

        System.out.println();

        System.out.println("Object for Child Class...");
        I1animal cat = new I1animal();
        cat.eat();
        cat.walk();
        cat.talk();

        System.out.println();

        System.out.println("Ref. by Parent Class ...");

        Ianimal animal2 = new I1animal();
        animal2.walk();
        animal2.talk();
        animal2.eat();



    }


}
