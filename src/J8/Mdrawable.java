package J8;

public class Mdrawable {
    public static void main(String[] args) {
        final  String color="white";
        Drawable d=(name)->{                /* new  Drawable() {*/

           /* public void fly() */
            {
               // System.out.println("can fly"+color);
                return "welcome lamda "+name;
            }
        };
        System.out.println( d.fly("haiiiiii"));

        Drawable d1=(name)->{
            return name;
        };
        System.out.println(d1.fly("hoooooooo"));

    }
}
