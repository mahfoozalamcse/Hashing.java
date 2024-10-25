import java.util.HashSet;

public class UnionInterSection {  // O(n+m)
    // union and itersection of two arrray 

    public static void main(String[] args) {
         int num[] = {4, 3, 2, 5}; 
         int num2[] = {3, 7, 7, 8};
      HashSet<Integer> set = new HashSet<>();
       
      // union
      for (int i = 0; i < num.length; i++) {
           set.add(num[i]);
      }

      for (int i = 0; i < num.length; i++) {
        set.add(num2[i]);
       }
     System.out.println("union = " + set.size());

     // intersection
     set.clear();
     for (int i = 0; i < num.length; i++) {
        set.add(num[i]);
      }
      int count = 0;
      for (int i = 0; i < num.length; i++) {
        if(set.contains(num2[i])){
        count++;
        set.remove(num2[i]);
       }
    }
    System.out.println("Intersection = " + count);
  }
}

// hw print value both union and inttersect
