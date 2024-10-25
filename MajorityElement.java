import java.util.*;

public class MajorityElement { // O(n)
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 1, 1, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            // if(map.containsKey(arr[i])){
            //     map.put(arr[i], map.get(arr[i])+1);
            // }else{
            //     map.put(arr[i], 1);
            // }

            // mimize 4 line in one line
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

       // Set<Integer> keySet = map.keySet();
        for (Integer key : map.keySet()) {  // also store 
            if(map.get(key) > arr.length/3){
                System.out.println(key);
            }
        }
    }
}
