import java.util.*;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
    	 
        boolean status = true;
 
        if(a.length() != b.length())
        {
            status = false;
        }
        else
        {
            char[] aArray = a.toLowerCase().toCharArray();
 
            char[] bArray = b.toLowerCase().toCharArray();
 
            Arrays.sort(aArray);
 
            Arrays.sort(bArray);
 
            status = Arrays.equals(aArray, bArray);
        }
 
       return status;

    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}