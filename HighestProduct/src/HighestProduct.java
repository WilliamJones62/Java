import java.util.*;

public class HighestProduct {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();   
        // Array has to have at least 3 elements
        if (n < 3){
            System.out.println("Must be at least 3 elements in the array");
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
            // Fill array all here
            all[i] = val;
        }
        
        sc.close();
        
    	int highest = 0;
    	int product = 0;
        for (int i = 0; i < (n - 2); i++){
            for (int j = (i + 1); j < (n - 1); j++){
                for (int k = (i + 2); k < n; k++){
                	product = all[i] * all[j] * all[k];
                	if (product > highest){
                		highest = product;
                	}
                }
            }
        }
        System.out.println(highest);

    }
}