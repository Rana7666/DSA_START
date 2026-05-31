package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class hashmap {
    static void main() {
        HashMap<Integer,String> m=new HashMap<>();
        m.put(10,"rana");
        m.put(20,"anar");
        System.out.println(m);
        m.put(32,"lena");
        m.put(80,"sanket");
        System.out.println(m);
        //sepecfic jo value print karana hai
        System.out.println(m.get(20));
        // using for get the size of an
        System.out.println(m.size());
        //remove the specfic key
        System.out.println(m.remove(10));
        //check the key is present or not
        System.out.println(m.containsKey(0));
        System.out.println(m.containsValue("rana"));

        m.put(10,"rana");
        m.put(32,"lena");
        m.put(80,"sanket");
        Set<Integer> kyes=m.keySet();
        System.out.println(kyes);
        for(Integer key: kyes){
            System.out.println(key+" "+m.get(key));

            // to get the single entry

            Set<Map.Entry<Integer,String>> entries=m.entrySet();
            for(Map.Entry<Integer,String> entry: entries){
                System.out.println(entry);
            }

        }

    }
}
