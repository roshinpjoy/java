package Collections.cblerator;

import java.util.Comparator;


public class Idcomparator  implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        Employee e1=(Employee) o1;
        Employee e2=(Employee) o2;



        if (e1.id>e2.id)
            return 1;
        else if (e1.id<e2.id)
            return  -1;
        else
            return  0;






    }
}
