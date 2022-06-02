// { Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

class Gfg {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking total count of testcases
        int testcases = sc.nextInt();

        while (testcases-- > 0) {
            // taking size of array
            int N = sc.nextInt();
            int arr[] = new int[N]; // array declaration

            for (int i = 0; i < N; i++) arr[i] = sc.nextInt(); // Input the
                                                               // array

            int sum = 0;

            // taking value of sum
            sum = sc.nextInt();

            // Creating an object of class Geeks
            Geeks obj = new Geeks();

            // Calling sumExists method of class Geeks
            // and printing the result
            System.out.println(obj.sumExists(arr, N, sum));
        }
    }
}

// Position this line where user code will be pasted.
// } Driver Code Ends


// User function Template for Java

class Geeks {
    // Complete this function
    // Function to check if two numbers in array have sum equal to the given
    // sum.
    public static int sumExists(int arr[], int n, int X) {

        // Your code here
        HashSet<Integer> us = new HashSet<>();
        for(int i = 0; i < n; i++)
        {
            if(us.contains(X - arr[i]))
              return 1;
              
            us.add(arr[i]);
        }
        return 0;
    }
}