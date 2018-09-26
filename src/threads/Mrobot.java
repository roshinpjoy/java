package threads;

public class Mrobot {
    public static void main(String[] args) throws InterruptedException {
        Robot c=new Robot();
        Robot cat =new Robot("cat");
        cat.walk(5);

        Robot dog=new Robot("dog");
                dog.walk(10);

    }
}
