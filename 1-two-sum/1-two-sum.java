class Solution {
    public int[] twoSum(int[] nums, int target) {
        int f=nums.length;
        int[] a=new int[2];
        
        int i=0,j=0;
        for(i=0;i<f-1;i++)
        {
            for(j=i+1;j<f;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    a[0]=i;
                    a[1]=j;
                }
            }
        }
        
        return a;
    }
}