class Solution {
    public int romanToInt(String s) {
        int n=s.length();
        int sum=0;
        int p=0;
        while(p<n)
        {
            int x=fun(s.charAt(p),p,n,s);
            if(x==4||x==9||x==40||x==90||x==400||x==900)
            {
                p=p+2;
                sum+=x;
            }
            else
            {
                sum+=x;
                p++;
            }
            
        }
        return sum;
    }
    public int fun(char a,int p,int n,String s)
    {
        
        if(a=='I'&& p<n-1)
        {
            if(s.charAt(p+1)=='V')
            {
                return 4;
            }
            if(s.charAt(p+1)=='X')
            {
                return 9;
            }
            
        }
         if(a=='X'&& p<n-1)
        {
            if(s.charAt(p+1)=='L')
            {
                return 40;
            }
            if(s.charAt(p+1)=='C')
            {
                return 90;
            }
            
        }
         if(a=='C'&& p<n-1)
        {
            if(s.charAt(p+1)=='D')
            {
                return 400;
            }
            if(s.charAt(p+1)=='M')
            {
                return 900;
            }
            
        }
        if(a=='I')
        {
            return 1;
        }
        else if(a=='V')
        {
            return 5;
        }
        else if(a=='X')
        {
            return 10;
        }
        else if(a=='L')
        {
            return 50;
        }
        else if(a=='C')
        {
            return 100;
        }
        else if(a=='D')
        {
            return 500;
        }
        else if(a=='M')
        {
            return 1000;
        }
        else
        {
            return 0;
        }
    }
}