package Collections;

import java.util.HashSet;

public class Shash {

    public static void main(String[] args) {
        Bbook b=new Bbook(1,"roshin","abcd");
        Bbook b1=new Bbook(2,"rishin","efgh");
        Bbook b2=new Bbook(2,"rishin","efgh");//hash code of b1 & b2 are similar

        System.out.println(b.hashCode());
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());

        HashSet<Bbook> h=new HashSet();
        h.add(b);
        h.add(b1);
        h.add(b2);


        for (Bbook p:h)
        {
            System.out.println(p.author+","+p.name+","+ p.id);
        }




    }
}
