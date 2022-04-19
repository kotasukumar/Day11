package com.company;

public class StockPortfoilo{
    float totalStockValue = 0;
    public void stockPrinter(String[] nameOfTheStock, int[] noOfShares, float[] shareValue, int noOfStocks){
        System.out.println("Stock report");
        for (int i = 0; i <= noOfStocks - 1; i++) {
            float stockValue = 0;
            stockValue = noOfShares[i] * shareValue[i];
            System.out.println("Name of the stock: " + nameOfTheStock[i] + " " + "No of shares available: " + noOfShares[i] + " " + "Per share value is: "
                    + shareValue[i] +" " + "Value of the stock: " + stockValue);
            totalStockValue = totalStockValue + stockValue;
        }
        System.out.println("Total value of all stocks is: " + totalStockValue);
    }
}
