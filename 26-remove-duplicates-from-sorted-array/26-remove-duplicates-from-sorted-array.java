class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k=1;
        int j=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[j])
            {
                
                j++;
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                k++;
            }
        }
        
        return k;
    }
}