package Collections;

import java.util.PriorityQueue;

public class Pqbq {
    public static void main(String[] args) {

        PriorityQueue<Bq> p=new PriorityQueue<>();

        Bq b1=new Bq(1,"ab");
        Bq b2=new Bq(2,"cb");
        Bq b3=new Bq(3,"bb");

        p.offer(b1);
        p.offer(b2);
        p.offer(b3);

        for (Bq b:p)
        {
            System.out.println(b.id+" "+b.name);
        }





    }
}
