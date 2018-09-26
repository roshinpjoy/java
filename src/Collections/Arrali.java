package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrali{

    public static void main(String[] args) {
        Stud s1=new Stud(1,"roshin");
        Stud s2=new Stud(2,"rishin");

        ArrayList <Stud> a=new ArrayList();
        a.add(s1);
        a.add(s2);
        Iterator i=a.iterator();

        while (i.hasNext())
        {
            Stud st=(Stud)i.next();
            System.out.println(st.name+" "+st.id);
        }

        /*
        for (Stud ob:a)
        {
            System.out.println(ob.id);
            System.out.println(ob.name);
        }
*/


    }






}
