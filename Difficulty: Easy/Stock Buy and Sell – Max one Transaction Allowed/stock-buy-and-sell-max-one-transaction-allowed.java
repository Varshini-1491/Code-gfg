//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String arr[] = br.readLine().split(" ");
            int prices[] = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                prices[i] = Integer.parseInt(arr[i]);
            }
            Solution obj = new Solution();
            int res = obj.maximumProfit(prices);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        if(prices==null || prices.length == 0)
        return 0;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price:prices){
            if(price<minPrice){
                minPrice = price;
            }else{
                maxProfit = Math.max(maxProfit,price-minPrice);
            }
        }
        return maxProfit;
    }
}