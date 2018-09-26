package te;

class Fresh{
    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
    FreshJuiceSize size;
}

public class Freshj {

    public static void main(String args[]) {
        Fresh j1 = new Fresh();
        j1.size = Fresh.FreshJuiceSize.LARGE ;
        System.out.println("Size: " + j1.size);
    }
}