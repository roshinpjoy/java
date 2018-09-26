package Collections.cblerator;

import java.util.ArrayList;
import java.util.Collections;

public class Empma {
    public static void main(String[] args) {


        Employee e1 = new Employee(100, "ab", 30000);
        Employee e2 = new Employee(99, "ad", 50000);
        Employee e3 = new Employee(101, "ac", 20000);


        ArrayList<Employee> a1 = new ArrayList();
        a1.add(e1);
        a1.add(e2);
        a1.add(e3);

       Collections.sort(a1);

        //Collections.sort(a1,new Idcomparator());

        for (Employee emp:a1)
        {
            System.out.println(emp.id+" "+emp.salary+" "+emp.name);
        }





    }





}
