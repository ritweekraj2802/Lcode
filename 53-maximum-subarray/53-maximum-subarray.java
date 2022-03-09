class Solution {
    public int maxSubArray(int[] nums) {
        
        
        int k=nums[0];
        int p=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            k=Math.max(nums[i],k+nums[i]);
            p=Math.max(p,k);
        }
        return p;
    }
}