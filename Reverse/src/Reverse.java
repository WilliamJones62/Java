import java.util.*;

public class Reverse {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String Z = new StringBuilder(A).reverse().toString();
        if (A.compareTo(Z) == 0){
            System.out.println("Yes");                
            }
        else{
            System.out.println("No");                
        }

        sc.close();
    }
}
