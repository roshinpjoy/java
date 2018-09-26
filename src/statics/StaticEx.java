package statics;

public class StaticEx {
    static  int count = 0;//with out static output will be 111

    StaticEx() {
        count++;
        System.out.println("count" + count);

    }

    public static void main(String[] args) {
        StaticEx e = new StaticEx();
        StaticEx e1 = new StaticEx();
        StaticEx e2 = new StaticEx();


    }
}





