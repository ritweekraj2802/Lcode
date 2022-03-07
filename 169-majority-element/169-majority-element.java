class Solution {
    public int majorityElement(int[] nums) {
        int p=(int)Math.floor(nums.length/2);
        int c=1;
        int q=0;
        int j=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[j])
            {
                c++;
            }
            else
            {
                c--;
            }
            if(c==0)
            {
                c=1;
                j=i;
            }
        }
        
        c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[j])
            {
                c++;
            }
        }
        if(c<=p)
        {
            return -1;
        }
        return nums[j];
    }
}