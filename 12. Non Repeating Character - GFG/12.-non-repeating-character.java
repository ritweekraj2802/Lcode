// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static final int CHAR=256;
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        int i=nonRep(S);
        char x='$';
        if(i!=-1)
        {
            x=S.charAt(i);
        }
        return x;
    }
    static int nonRep(String str) 
    {
        int[] fI=new int[CHAR];
        Arrays.fill(fI,-1);

        for(int i=0;i<str.length();i++){
            if(fI[str.charAt(i)]==-1)
                fI[str.charAt(i)]=i;
            else
                fI[str.charAt(i)]=-2;
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<CHAR;i++){
            if(fI[i]>=0)res=Math.min(res,fI[i]);
        }
        return (res==Integer.MAX_VALUE)?-1:res;
    } 
}

