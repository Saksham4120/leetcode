class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count=0;
        int maxy=0;
        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                count++;
                maxy = Math.max(count,maxy);
            }
            else{
            count = 0;}

            }
             return maxy;
        }
       
    }
