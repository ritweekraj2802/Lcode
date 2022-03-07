class Solution {
    public boolean isPalindrome(int x) {
        
        int num=x;
        int sum=0;
        while(x>0)
        {
            sum=sum*10+x%10;
            x=x/10;
        }
        if(sum==num)
        {
            return true;
        }
        return false;
    }
}