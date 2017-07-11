import java.util.*;

public class AppleStocks {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();   
        // Array has to have at least 2 elements
        if (n < 2){
            System.out.println("Must be at least 2 elements in the array");
            sc.close();
            return;
        }
        // Declare array a here
        int[] stock_prices_yesterday = new int[n];
        for(int i = 0 ; i < n; i++){
            int val = sc.nextInt();
            // Fill array a here
            stock_prices_yesterday[i] = val;
        }
        sc.close();

    	int low_position = 0;
    	int low = stock_prices_yesterday[0];
    	// The last possible chance to buy is one less than the last point in the array
    	for(int i = 1; i < (stock_prices_yesterday.length - 2); i++){
    		if (stock_prices_yesterday[i] < low){
    			low = stock_prices_yesterday[i];
    			// Save the buy position in the array 
    			low_position = i;
    		}
    	}
    	// Find the sell position. It must be after the buy (low) position
    	int high = stock_prices_yesterday[low_position + 1];
    	for(int i = (low_position + 2) ; i < (stock_prices_yesterday.length); i++){
    		if (stock_prices_yesterday[i] > high){
    			high = stock_prices_yesterday[i];
    		}
    	}
    	int max_profit = high - low;
        System.out.println(max_profit);
        
	}
	

}
