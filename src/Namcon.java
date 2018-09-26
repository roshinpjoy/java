public class Namcon {
    public static void main(String[] args) {


    String str="100";
    //parsing numeric string to primitive numbers
    int i=Integer.parseInt(str);

        System.out.println(str+100);
        System.out.println(i+100);


        String s2="100.100";
        Float f=Float.parseFloat(s2);
        System.out.println(f+100);
        System.out.println(s2+43.345);


        int i2=300;
        String s3=String.valueOf(i2);//any type can convert
        String s4=Integer.toString(i2);//what is difference

        System.out.println(s3+s4);

        System.out.println(i2+100);
        System.out.println(s4+i2);


}
}
