// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = "", p = "";
            s = sc.next();
            p = sc.next();
            
            Solution obj = new Solution();
            
            if(obj.search(p, s) ==  true)
              System.out.println("Yes");
            else
              System.out.println("No");
        }
    }
}// } Driver Code Ends




class Solution
{
    //Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt)
    {
            // Your code here
        int M = pat.length();
        int N = txt.length();
        boolean x=false;
        /* A loop to slide pat one by one */
        for (int i = 0; i <= N - M; i++) {

            int j;

            /* For current index i, check for pattern 
              match */
            for (j = 0; j < M; j++)
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;

            if (j == M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
                x=true;
        }
        return x;
    }
    
}