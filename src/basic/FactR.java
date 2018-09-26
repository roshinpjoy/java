package basic;

public class FactR {

    public int fact(int x){
        //int f=0;
        if(x==1)
            return 1;

        else if(x>1)

            return x* fact(x - 1);

        return 0;

    }

    public static void main(String[] args) {

        //int val=fact(5);
        FactR obj = new FactR();
        int val=obj.fact(0);

        System.out.println("factorial:"+val);


    }




}
