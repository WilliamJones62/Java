import java.util.*;

public class LoopsI {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i = 0;
        for (i = 1; i < 11; i++){
            int P = N * i;
            System.out.printf("%d x %d = %d%n", N, i, P);           
        }
        in.close();
    }
}