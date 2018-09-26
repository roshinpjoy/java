package p1;

public class PrivatExample {

        private int id=10;
        private String name="Ag";
        private void display(){
            System.out.println("IN private Method....");
        }
        public static void main(String[] args)
        {
            PrivatExample obj = new PrivatExample();
            System.out.println(obj.id);
            System.out.println(obj.name);
            obj.display();
        }
    }



