import java.util.*;

public class StringCompare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int start = scanner.nextInt();
        String max = S.substring(0,start);
        String min = S.substring(0,start);
        int i = 0;

        for (i = 1; i < (S.length() - (start-1)); i++){
            if (S.substring(i, (i+start)).compareTo(min) < 0){
                min = S.substring(i, i+start);
            }
            else {
                if (S.substring(i, (i+start)).compareTo(max) > 0){
                    max = S.substring(i, i+start);
                }
            }
        }
        System.out.println(min);
        System.out.println(max);

        scanner.close();
    }
}

