class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int arr1[] = new int[n];
        for(int i=0; i<n; i++){
           arr1[(i+k)%n] = nums[i];
        }
  for(int i=0; i<n; i++){
           nums[i]=arr1[i];
        }
    }
}