class Solution {
    public int missingNumber(int[] nums) {
        int sumofn = 0;
        int n = nums.length;
        int result = n*(n+1)/2;
         for (int i=0; i<n; i++){
            sumofn = nums[i] + sumofn;
         }
          return result-sumofn;
        }
       
}
