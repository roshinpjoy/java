package abstractt;

public abstract class abb implements inter {



    void speed(){
        System.out.println("Speed in SkyTravel");

    }
   final void color(){
        System.out.println("Color in Sky Travel");


    }
    abstract  void quantity();

    @Override
    public void deep() {
        System.out.println("haiiiiii");
    }
}
