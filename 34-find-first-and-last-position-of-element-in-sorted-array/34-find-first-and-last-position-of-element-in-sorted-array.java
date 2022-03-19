class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int f=firstOcc(nums,0,nums.length-1,target);
        int l=lastOcc(nums, 0,nums.length- 1, target, nums.length);
        int[] a=new int[2];
        a[0]=f;
        a[1]=l;
        return a;
        
        
        
    }
    public static int firstOcc(int arr[], int low, int high, int x)
	{
		if(low > high)
			return -1;

		int mid = (low + high) / 2;

		if(x > arr[mid])
			return firstOcc(arr, mid + 1, high, x);

		else if(x < arr[mid])
			return firstOcc(arr, low, mid - 1, x);

		else
		{
			if(mid == 0 || arr[mid - 1] != arr[mid])
				return mid;

			else
				return firstOcc(arr, low, mid - 1, x);
		}
	}
    public static int lastOcc(int arr[], int low, int high, int x, int n)
	{
		if(low > high)
			return -1;

		int mid = (low + high) / 2;

		if(x > arr[mid])
			return lastOcc(arr, mid + 1, high, x, n);

		else if(x < arr[mid])
			return lastOcc(arr, low, mid - 1, x, n);

		else
		{
			if(mid == n - 1 || arr[mid + 1] != arr[mid])
				return mid;

			else
				return lastOcc(arr, mid + 1, high, x, n);
		}
	}
}