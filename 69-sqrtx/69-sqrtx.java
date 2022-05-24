class Solution {
    public int mySqrt(int x) {
        long low = 1, high = x, ans = 0;

		while(low <= high)
		{
			long mid = (low + high) / 2;

			long mSq = mid * mid;

			if(mSq == x)
				return (int )mid;
			else if(mSq > x)
				high = mid - 1;
			else
			{
				low = mid + 1;
				ans = mid;
			}
		}

		return (int )ans;
    }
}