package Collections;


import java.lang.*;
import java.io.*;
import java.util.*;

// Class of ReverseString
class ReverseString
{
   static String input;
    static void reversee( String inp) {
         input = inp;
          char[] hello = input.toCharArray();
          List<Character> trial1 = new ArrayList<>();

          for (char c : hello)
              trial1.add(c);

          Collections.reverse(trial1);
          ListIterator li = trial1.listIterator();
          while (li.hasNext())
              System.out.print(li.next());
      }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
          reversee(s);


    }
}
