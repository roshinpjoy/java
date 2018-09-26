package Collections.cblerator;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    float salary;

    public Employee(int id,String name,float salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;


    }

    @Override
    public int compareTo(Employee o) {
        if (id>o.id)
            return 1;
        else if (id<o.id)
            return  -1;
        else
            return  0;

    }
}
