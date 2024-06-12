class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int swap;
        // for(int i=0; i<n; i++){
        // for(int j=1; i<n; i++){
        // if(nums[i] > nums[j]){
        // swap = nums[i];
        // nums[j] = nums[i];
        // nums[i] = swap;
        // }
        // }
        // }
        int l = 0;
        int r = n - 1;
        int mid = 0;

        while (mid <= r) {
            if (nums[mid] == 0) {
                swap = nums[mid];
                nums[mid] = nums[l];
                nums[l] = swap;
                mid++;
                l++;
            } else if (nums[mid] == 1) {
                  mid++;
            } else {// nums[mid]==2
                swap = nums[mid];
                nums[mid] = nums[r];
                nums[r] = swap;
              
                r--;
            }
        }

    }
}