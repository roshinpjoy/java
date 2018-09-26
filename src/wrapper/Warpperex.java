package wrapper;

public class Warpperex {


    public static void main(String[] args) {
        {   //primitive to object
            int a=100;

            //Integer val=new Integer(a);//using constructor
            Integer b=new Integer(a);//Converting int in to integer
            int e=b.valueOf(45);
            Integer c=a;//auto boxing  now compiler will write Integer.valueOf(a) internally
            System.out.println(a+" "+b+" "+c+" "+e);



           //object to primitive
            Integer d=new Integer(3);
            int i=d.intValue();//converting Integer to int
            int j=d;//unboxing, now compiler will write a.intValue() internally
            System.out.println(d+" "+i+" "+j);


            //string object to numeric object
            String K=new String("7000");
            Integer  ival=Integer.valueOf(K);
            System.out.println(ival+100);
            //object to primitive
            int nm=ival.intValue();
            System.out.println(nm);







            //numbers to Strings using String() method

            int g=5000;
            String ss=Integer.toString(g);
            System.out.println(g+1000);
            System.out.println(g+ss);







           //Convert char data type to Character object
            char ch = 'a';

            Character cObj = new Character(ch);
            System.out.println(cObj);

            //character object to char

            Character cob=new Character('r');
            char h=cob;
            System.out.println(h);












        }
    }
}
