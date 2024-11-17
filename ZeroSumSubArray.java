import java.util.HashSet;

public class ZeroSumSubArray {
     public static boolean zeroSumSubArray(int arr[]){
        int n = arr.length;
        int sumSoFor = 0;

        HashSet<Integer> sumSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            sumSoFor += arr[i];
            
            if(sumSoFor == 0 ||  sumSet.contains(sumSoFor)){
                return true;
            }
            sumSet.add(sumSoFor);
        } 
        return false;

     }
    public static void main(String[] args) {
       int arr[] = {4, 2, -3, 1, 6};
       System.out.println(zeroSumSubArray(arr)); 
    }
}