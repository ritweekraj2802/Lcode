// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
        int t = Integer.parseInt(br.readLine().trim()); 
        while(t-->0){
            
            //size of array
            int N = Integer.parseInt(br.readLine().trim()); 
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for(int i = 0 ; i < N; i++){
                arr[i]=Integer.parseInt(inputLine[i]); 
            }
            int P= Integer.parseInt(br.readLine().trim());
            //calling frequncycount() function
            Solution ob = new Solution();
            ob.frequencyCount(arr, N, P); 
            
            //printing array elements
            for(int i = 0; i < N ; i++)
                System.out.print(arr[i] + " " );
            System.out.println();
        }
    }
}



// } Driver Code Ends


class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
               // code here
        //Decreasing all elements by 1 so that the elements
        //become in range from 0 to n-1.
        for (int j = 0; j < N ; j++) 
            arr[j] = arr[j]-1; 
        Arrays.sort(arr);
        int ind = N;
    	for(int i = 0 ; i < N ; i++)
    	{
    	   if(arr[i] >= N)
    	   {
    	       if(ind == N)
    	           ind = i;
    	       arr[i] = 0;
    	   }
    	}
        //Using every element arr[i] as index.
        //Updating the array elements using mathematical formula
        //to find the frequencies of all elements from 1 to N.
        for (int i = 0 ; i < ind; i++) 
            //Adding n to element present at arr[i]%n to keep 
            //track of count of occurrences of arr[i].
            arr[arr[i]%N] = arr[arr[i]%N] + N; 

         //Calculating the frequency of each element.
        for (int i =0; i<N; i++) 
            //Finally dividing the array elements by n to find the frequency.
            arr[i] = arr[i]/N;
    }
}
