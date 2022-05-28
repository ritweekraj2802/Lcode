class Solution {
    public int missingNumber(int[] nums) {
        boolean[] a = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i ++) {
            a[nums[i]] = true;
        }
        for (int i = 0; i < a.length; i ++) {
            if (!a[i]) {
                return i;
            }
        }
        return 0;
    }
}