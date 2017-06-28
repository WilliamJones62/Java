import java.util.*;

public class ArrayList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int arrayLen = in.nextInt();
        int[][] arr2d = new int[arrayLen][];
        for (int i = 0; i < arrayLen; i++){
            int[] arr = new int[in.nextInt()];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = in.nextInt();
            }
            arr2d[i] = arr;
        }
        
        int query = in.nextInt();
        for (int i = 0; i < query; i++) {
            try {
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
                System.out.println(arr2d[x][y]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        in.close();

    }
}

