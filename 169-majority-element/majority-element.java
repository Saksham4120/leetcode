class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
       
       HashMap<Integer,Integer>map = new HashMap<>();
       for(int i=0; i<n; i++){
        // map.put(nums[i],map.getordefault(nums[i],0)+1);
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
       }
       for (Integer key : map.keySet()) {
        if( map.get(key)>(n/2)){
            return key;
        }
       }

    return -1;
    }
}





 // for (int i=0;i<n;i++){
        //     for (int j=1;j<n;j++){
        //     if(nums[i]==nums[j]){
        //         c++;
        //         maxc=Math.max(c,maxc);//1
        //     }
        //     }
        // }