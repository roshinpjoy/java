package string;

public class Stringme {


    public static void main(String[] args) {
        String str="Exper";
        String str5="Exper";
        String str9="Exper";
       String str4=new String("Exper");
       StringBuffer sbb=new StringBuffer("Exper");
       StringBuilder sbu=new StringBuilder("Exper");
        String str2="Expertzla";
        String str3="EXPERTZLA";
        System.out.println(str.charAt(1));//x
        System.out.println(str.compareTo(str2));//-4
        System.out.println(str2.compareToIgnoreCase(str3));//0
        System.out.println(str5.contentEquals(str4));//tr
        System.out.println(str4.equals(sbb));//fal equals check both co & ob
        System.out.println(str5.equals(str9));//true both points to single value

        System.out.println(str4.contentEquals(sbb));//tru
        System.out.println(str5.equals(str4));//tru
        System.out.println("........................");
        System.out.println(sbb.equals(sbu));//fal

        char[] ch={'r','o','s','h','n'};
        String str8=String.copyValueOf(ch,1,3);
        System.out.println(str8);//osh


    }
}
