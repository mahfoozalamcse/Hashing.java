import java.util.*;
public class HashMapImp{
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>(); // hashmap is unorderd map 
        
        // insert O(1)

        hm.put("India", 140);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Indonesia", 6);
        hm.put("Bhutan", 3);
        hm.put("Iran", 17);

        System.out.println(hm + " ");

        // get O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Bangladesh"));
        

        // containsKey O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Rus"));

      /*  output

       * {USA=50, Bhutan=3, Iran=17, China=150, India=140, Indonesia=6} 
        140
        null
        true
        false
       */

       // Remove O(1)
       System.out.println(hm.remove("India"));
       System.out.println(hm);

       // size
       System.out.println(hm.size());

       // Is Empty
       System.out.println(hm.isEmpty());

       // clear
       hm.clear();
       System.out.println(hm.isEmpty());
    }
}