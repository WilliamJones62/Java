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
            // Fill array all here
            all[i] = val;
        }
        
        sc.close();
        
    	int highest = 0;
    	int biggest = 0;
    	int second_biggest = 0;
    	int third_biggest = 0;
    	int smallest = 0;
    	int second_smallest = 0;

        for (int i = 0; i < n; i++){
        	if (all[i] > biggest){
        		third_biggest = second_biggest;
        		second_biggest = biggest;
                biggest = all[i];
            }
        	else{
            	if (all[i] > second_biggest){
            		third_biggest = second_biggest;
                    second_biggest = all[i];
                }
            	else{
            		if (all[i] > third_biggest){
                        third_biggest = all[i];
            		}
            		else{
                		if (all[i] < smallest){
                            second_smallest = smallest;
                            smallest = all[i];
                		}
                		else{
                    		if (all[i] < second_smallest){
                                second_smallest = all[i];
                    		}
                		}
                	}
            	}
            }
        }
    	// Two negative numbers can result in a positive product
        if (smallest < 0 & second_smallest < 0){
        	// Convert to positive values
        	smallest *= -1;
        	second_smallest *= -1;
        	// If the converted smallest numbers are bigger than the biggest numbers replace them
        	if (smallest > biggest){
        		third_biggest = second_biggest;
        		second_biggest = biggest;
        		biggest = smallest;
        	}
        	else{
        		if (smallest > second_biggest){
        			third_biggest = second_biggest;
        			second_biggest = smallest;
        		}
        		else{
            		if (smallest > third_biggest){
            			third_biggest = smallest;
            		}
            	}
        	}

        	if (second_smallest > second_biggest){
        		third_biggest = second_biggest;
        		second_biggest = smallest;
        	}
        	else{
            	if (smallest > third_biggest){
            			third_biggest = smallest;
            	}
        	}
        }
        
        highest = biggest * second_biggest * third_biggest;
        System.out.println(highest);

    }
}
