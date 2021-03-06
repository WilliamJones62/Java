import java.util.*;

public class PalindromeFinder {
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
        char[] all = new char[n];
        for (int i = 0; i < n; i++){
        	char val = sc.next().charAt(0);
            // Fill array all here
            all[i] = val;
        }
        
        sc.close();
        LinkedList<String> arrl = new LinkedList<String>();
        boolean q;
        String a;
        
        for (int i = 0; i < n; i++){
    		a = Character.toString(all[i]);
        	if (arrl.contains(a)){
        		// remove matching character from linked list
        		q = arrl.remove(a);
        	}
        	else{
        		// add new character to linked list
        		a = Character.toString(all[i]);
        		arrl.push(a);
        	}
        }
        
        if (arrl.size() == 0 || arrl.size() == 1){
            System.out.println("Palindrome");
        }
        else{
        	System.out.println("Not a palindrome");
        }
    }
 }
