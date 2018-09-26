package p1;

public class Privare2 {



        private int id=10;
        private String name="Ag";

        public void display(){
            System.out.println("IN Display---private...");
            System.out.println("Id:"+id);
            System.out.println("Name:"+name);

        }

    }

    class PrivateMain{
        public static void main(String[] args) {
            Privare2 obj = new Privare2();
            obj.display();
        }
    }

