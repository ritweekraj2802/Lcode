/*  Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 

Follow-up: Could you solve the problem in linear time and in O(1) space?
*/

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