package fex;

public class finalizex {


    public void finalize() {
        System.out.println("finalize called");
    }

    public static void main(String[] args) {
        finalizex f1 = new finalizex();
        finalizex f2 = new finalizex();
        f1 = null;
        f2 = null;
        System.gc();
    }
}