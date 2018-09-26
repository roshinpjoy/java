package p1;

public class ProtectedExp {

        protected int id;
        protected String name;


        protected void display(){
            System.out.println("Id:"+id);
            System.out.println("Name:"+name);
        }


    }


class PMain extends ProtectedExp {//in one class only one public allowed

    public static void main(String[] args) {
        ProtectedExp obj = new ProtectedExp();
        obj.id = 10;
        obj.name = "Ag";
        obj.display();
    }
}

















