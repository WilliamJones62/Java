import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraylen = in.nextInt();
        int[] arr = new int[arraylen];
        for(int i = 0; i < arraylen; i++){
            arr[i] = in.nextInt();
        }        
        in.close();
        
        int negsubs = 0;
        
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int k = j; k < arr.length; k++) {
                sum += arr[k];
                if (sum < 0) {
                    negsubs++;
                }
            }
            sum = 0;
        }
        
        System.out.println(negsubs);

    }
}
