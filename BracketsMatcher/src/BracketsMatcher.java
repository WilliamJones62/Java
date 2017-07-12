import java.util.*;

public class BracketsMatcher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();   
        // Array has to have at least 3 elements
        if (n < 2){
            System.out.println("Must be at least 2 elements in the array");
            sc.close();
            return;
        }
        if (n % 2 != 0) {
            System.out.println("Odd number of brackets is always wrong");
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
        
        for (int i = 0; i < n; i++){
        	switch (all[i]){
	        	case '[':
	        		arrl.push("[");
	        		break;
	        	case '(':
	        		arrl.push("(");
	        		break;
	        	case '{':
	        		arrl.push("{");
	        		break;
	        	case ']':
	        		if (arrl.peek() != "["){
	                    System.out.println("Unmatched brackets");
	                    return;
	                }
	        		// Valid closing bracket
	        		arrl.pop();
	        		break;
	        	case ')':
	        		if (arrl.peek() != "("){
	                    System.out.println("Unmatched brackets");
	                    return;
	                }
	        		// Valid closing bracket
	        		arrl.pop();
	        		break;
	        	case '}':
	        		if (arrl.peek() != "{"){
	                    System.out.println("Unmatched brackets");
	                    return;
	                }
	        		// Valid closing bracket
	        		arrl.pop();
	        		break;
	        	default:
	        		//This is not a bracket so error
	                System.out.println("Invalid character");
	                return;
	        }
        	
        }
        if (arrl.isEmpty()){
        	System.out.println("Matched brackets");
        }
        else{
            System.out.println("Unmatched brackets");
        }
    }
}
