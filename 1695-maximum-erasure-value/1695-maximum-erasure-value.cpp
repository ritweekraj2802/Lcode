class Solution {
public:
    int maximumUniqueSubarray(vector<int>& nums) {
        set<int> st;
        int left = 0, right = 0; // nums[left...right] = the range of the subarray
        int curSum = 0, maxSum = 0;
        while( right < nums.size() ){
            while( st.find(nums[right]) != st.end() ){
                st.erase(nums[left]);
                curSum -= nums[left];
                left++;
            }
            st.insert(nums[right]);
            curSum += nums[right];
            maxSum = std::max(curSum, maxSum);
            right++;
        } return maxSum;
    }
};