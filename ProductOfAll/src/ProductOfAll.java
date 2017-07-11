import java.util.*;

public class ProductOfAll {


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
        int[] all = new int[n];
        for (int i = 0; i < n; i++){
            int val = sc.nextInt();
            // Element has to be greater than zero
            if (val < 1){
                System.out.println("Must be greater than zero");
                sc.close();
                return;
            }
            // Fill array a here
            all[i] = val;
        }
        
        sc.close();
        int[] products = new int[n];
        Arrays.fill(products, 1);
        for (int i = 0; i < n; i++){
        	for (int j = 0; j < n; j++){
        		if (i != j){
        			products[j] *= all[i];
        		}
        	}
        }
        
        for (int i = 0; i < n; i++){
            System.out.println(products[i]);
        }
        
    }
}
