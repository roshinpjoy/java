package Collections.mapp;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap <String,Long> map=new HashMap<>();

        map.put("ros",9898987686l);
        map.put("roh",9898987686l);
        map.put("roj",9898987686l);
        map.put("null",9898957686l);
        map.put("roe",9898947686l);
        map.put(null,null);
        map.put("ros",98949440404l);



        for (Map.Entry m:map.entrySet())
        {
            System.out.println("Names:  "+m.getKey()+  "  phone:  "+m.getValue());
        }
        System.out.println(map.get("ros"));






    }
}
