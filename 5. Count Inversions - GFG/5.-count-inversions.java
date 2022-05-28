// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return countInv(arr,0,(int)N-1);
    }
    static long countInv(long arr[], int l, int r)
    {
        long res = 0;
        if (l<r) {
           
            int m = (r + l) / 2;
     
            res += countInv(arr, l, m);
            res += countInv(arr, m + 1, r);
            res += countAndMerge(arr, l, m , r);
        }
        return res;
    }
    
    static long countAndMerge(long arr[], int l, int m, int r)
    {
    
        long[] left=Arrays.copyOfRange(arr,l,m+1);
        long[] right=Arrays.copyOfRange(arr,m+1,r+1);
        int n1=m-l+1;
        long res=0 ;
        int i=0,j=0,k=l;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j])
                {arr[k++]=left[i++];}
            else{
                arr[k++]=right[j++];
                res=res+n1-i;
            }
        }
        while(i<left.length)
            arr[k++]=left[i++];
        while(j<right.length)
            arr[k++]=right[j++];
        return res;
    }
}