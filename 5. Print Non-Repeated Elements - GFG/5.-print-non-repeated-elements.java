// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])throws IOException
    {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- >0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n=Integer.parseInt(str[0]);
            int arr[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
                
            ArrayList<Integer> v = new Solution().printNonRepeated(arr, n);
            
            for(int i=0;i<v.size();i++){
                System.out.print(v.get(i)+" ");
            }
            
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return non-repeated elements in the array.
    static ArrayList<Integer> printNonRepeated(int arr[], int n)
    {
        // add your code here
        ArrayList<Integer> ab=new ArrayList<Integer>();
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<Integer,Integer>();
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
               if(a.getValue()==1)
               {
                   ab.add(a.getKey());
               }

        }
        
        return ab;
    }
}

