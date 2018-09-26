
package Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Hashsetx {

    public static void main(String[] args) {
        HashSet <String> hs=new HashSet();
        hs.add("AB");
        hs.add("bc");
        hs.add("cd");

     //   Collections.sort(hs);
        TreeSet<String> set = new TreeSet(hs);

        for (String ts:set)
        {
            System.out.println(ts);
        }


        int i=hs.size();
        System.out.println(i);

    }
}
