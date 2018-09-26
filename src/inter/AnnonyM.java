package inter;

public class AnnonyM  {
    public static void main(String[] args) {


        Annony a=new Annony() {
            @Override
            public void message() {
                System.out.println("annonymous");

            }
        };
       a.message();
    }
}
