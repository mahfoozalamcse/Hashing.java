public class SubArraySumTarget {
    public static void subArraytarget(int arr[], int n, int sum){
        int currSum, i, j;
        for ( i = 0; i < n; i++) {
            currSum = arr[i];
            for (j = i+1; j <= n; j++) {
                if(currSum == sum){
                    int p = j - 1;
                    System.out.print("Sum exist between index " + i + " to " + p +" ");
                    
                }
                if(currSum > sum || j == n)
                    break;

                currSum = currSum + arr[j];
                
            }
        }
    
        
    }
    public static void main(String[] args) {
      int arr[] = {1, 4,  0, 0, 3, 10, 5};
      int sum = 7;
      int n = arr.length;
      subArraytarget(arr, n, sum);

    }
}
