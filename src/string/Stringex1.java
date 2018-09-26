package string;

public class Stringex1 {
    public static void main(String[] args) {
        String str="Big Data";
        char[] ch=new char[10];

        str.getChars(0,3,ch,5);
        System.out.println(ch);
        System.out.println(str.hashCode());
        System.out.println(str.indexOf('D'));

    }
}
