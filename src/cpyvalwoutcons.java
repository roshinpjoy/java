class cpyvalwoutcons{
    int id;
    String name;
    cpyvalwoutcons(int i,String n){
        id = i;
        name = n;
    }
    cpyvalwoutcons(){}
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        cpyvalwoutcons s1 = new cpyvalwoutcons(111,"Karan");
        cpyvalwoutcons s2 = new cpyvalwoutcons();
        s2.id=s1.id;
        s2.name=s1.name;
        s1.display();
        s2.display();
    }
}  