package wrapper;

public class wrapEx {
    public static void main(String[] args) {

        int v1=200;//primitive type
        Integer v2=v1;//wrapper class auto boxing
        System.out.println(v1+" "+v2);

        Integer v3=new Integer(v1);
        Integer v4=Integer.valueOf(v1);
        System.out.println(v3+" "+v4);





    }
}
