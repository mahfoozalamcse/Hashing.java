import java.util.HashSet;

public class HashSet1 {  // unique  add not add duplicate
    // hashset implement by hashmap
 public static void main(String[] args) {
     HashSet<Integer> set = new HashSet<>();

     set.add(1);
     set.add(2);
     set.add(3);
     set.add(2);
     set.add(1);

     System.out.println(set);

     if(set.contains(2)){
        System.out.println("Set contains 2");
     }

     set.remove(2);
    

   } 
}
