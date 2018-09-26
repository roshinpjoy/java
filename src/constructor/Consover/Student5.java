package constructor.Consover;

class Student5{
    int id;
    String name;
    int age;
    Student5(int id,String name){
       this. id = id;
        this.name = name;
    }
    Student5(int i,String n,int a){
        id = i;
        name = n;
        age=a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}

    public static void main(String args[]){
        Student5 s1 = new Student5(111,"Karan");
        Student5 s2 = new Student5(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}