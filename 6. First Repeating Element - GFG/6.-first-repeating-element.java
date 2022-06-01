// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking total count of elements
            int n = sc.nextInt();

            // creating a new array of size n
            int arr[] = new int[n];

            // inserting elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            // calling firstRepeated method
            // and printing the result
            System.out.println(ob.firstRepeated(arr, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        ArrayList<Integer> ab=new ArrayList<Integer>();
        TreeMap<Integer,Integer> hm=new TreeMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            Integer c=hm.get(arr[i]);
            
            if(c==null)
            {
                hm.put(arr[i],1);
            }
            else
            {
                hm.put(arr[i],++c);
            }


        }
        for(Map.Entry<Integer,Integer> a:hm.entrySet())
        {
               if(a.getValue()!=1)
               {
                   ab.add(a.getKey());
               }

        }
        int x=-1;
        for(int k=0;k<n;k++)
        {
            if(ab.contains(arr[k]))
            {
                x=k+1;
                break;
            }
        }
        return x;
        
    }
}
