public class Hashex  extends Object{
    public static void main(String[] args) {


        Hashex ob = new Hashex();
        Hashex ob1 = new Hashex();
        System.out.println(ob);
        System.out.println(ob1);

        Hashh h1=new Hashh(10,"roshi");
        Hashh  h2=new Hashh(10,"roshin");
        Hashh h3=new Hashh(50,"abc");

        System.out.println(h1.equals(h2));
        System.out.println(h3.equals(h2));
        System.out.println(h1==h2);
        System.out.println();
        System.out.println(h1.hashCode());
        System.out.println(h2.hashCode());

    }

}




