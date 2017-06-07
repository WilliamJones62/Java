import java.util.*;

public class StringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int total = A.length() + B.length();
        System.out.println(total);

        char a = A.charAt(0);
        char b = B.charAt(0);
        
        if (a > b){
             System.out.println("Yes");
        }
        else{
             System.out.println("No");
        }
 
        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);
        
        System.out.println(A + ' ' + B);

        sc.close();

    }
}

