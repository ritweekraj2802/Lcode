class Solution {
    public int singleNumber(int[] nums) {
        
        Arrays.sort(nums);
        if(nums.length==1)
        {
            return nums[0];
        }
        int sum=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                sum1=sum1+(nums[i]+nums[i-1]);
            }
            
        }
        return sum-sum1;
    }
}