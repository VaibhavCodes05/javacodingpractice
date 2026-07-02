package org.com.javaprograms.arrays;


import org.springframework.beans.factory.parsing.Problem;

//Problem: Best Time to Buy and Sell Stock
//You are given an array where:
//arr[i]
//represents the stock price on day i.
public class StockBuySell {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};

        int maxProfitBruteForce = calculateMaxProfitBruteForce(arr);
        int maxProfitOptimized =  calculateMaxProfitOptimized(arr);

        System.out.println("Max Profit Brute Force: " + maxProfitBruteForce);
        System.out.println("Max Profit Optimized: " + maxProfitOptimized);
    }

    private static int calculateMaxProfitOptimized(int[] arr) {
        int minPriceSeenSoFar = arr[0];
        int maxProfitSeenSoFar = 0;

        for(int i =1; i<arr.length; i++){

            if(arr[i]<minPriceSeenSoFar){
                minPriceSeenSoFar = arr[i];
            }
            int currentProfit = arr[i] - minPriceSeenSoFar;
            if(maxProfitSeenSoFar<currentProfit){
                maxProfitSeenSoFar = currentProfit;
            }
        }
        return maxProfitSeenSoFar;
    }

    private static int calculateMaxProfitBruteForce(int[] arr) {
        int maxProfit = 0;

        for(int buyDay = 0; buyDay <arr.length; buyDay++){
            for(int sellDay = buyDay+1;sellDay < arr.length; sellDay++){
               int profit = arr[sellDay] - arr[buyDay];
               if(profit > maxProfit){
                   maxProfit = profit;
               }
            }
        }
        return maxProfit;
    }
}
