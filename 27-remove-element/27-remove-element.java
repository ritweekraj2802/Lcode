class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
               int t=nums[j]; 
               nums[j]=nums[i];
                nums[i]=t;
                j++;
                k++;
            }
        }
        
        return k;
    }
}