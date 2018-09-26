package basic;

public class Student {

    int  num=2;
    String id;
    String name;
    Float total;
    Float average;

    public Student(String idd,String nam,float tot)
    {

        id=idd;
        name=nam;
        total=tot;

    }

    public void calculate()
    {
        average=total/num;
    }

    public void display()
    {
        System.out.println("id"+id+"name"+name+"total"+average);
    }



}
