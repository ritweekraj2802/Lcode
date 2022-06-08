// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String str = sc.next();
            int index = new Solution().repeatedCharacter(str);
            if(index == -1)
                System.out.println("-1");
            else
                System.out.println(str.charAt(index));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find repeated character whose first appearance is leftmost.
    static final int CHAR=256;
    static int repeatedCharacter(String str)
    {
        // add your code here
     
    int[] count=new int[CHAR];
    for(int i=0;i<str.length();i++){
        count[str.charAt(i)]++;
    }
    for(int i=0;i<str.length();i++){
        if(count[str.charAt(i)]>1)return i;
    }
    return -1;
    } 
}