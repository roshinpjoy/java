package Collections.cblerator;

import java.util.Comparator;
public class Namecomparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        Employee e1=(Employee) o1;
        Employee e2=(Employee) o2;



       return e1.name.compareTo(e2.name);

    }
}
