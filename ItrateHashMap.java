import java.util.HashMap;
import java.util.Set;

public class ItrateHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 140);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Indonesia", 6);
        hm.put("Bhutan", 3);
        hm.put("Iran", 17);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
           //  if(max > 5){} logic perform on keys like array

            System.out.println("Keys = " + k + ", Value is : " + hm.get(k));
        }

        // hm.entrySet()  give pair of key
    }
}
