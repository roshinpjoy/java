package Collections;

public class Bq implements Comparable<Bq> {

    int id;
    String name;

    Bq(int id,String name)
    {
        this.id=id;
        this.name=name;
    }


    @Override
    public int compareTo(Bq o) {


        if (id>o.id)
            return 1;
        else if (id<o.id)
            return  -1;
        else
            return  0;
    }
}
