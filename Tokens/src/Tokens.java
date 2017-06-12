import java.util.*;
public class Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String s = str.trim();
        if (s.length() < 1){
            System.out.println(0);

        }else{
            if (s.length() <= 400000){

                String[] tokens = s.split("[ .,?!'_@]+");
                System.out.println(tokens.length);

                int i = 0;
                for (i = 0; i < tokens.length; i++){
                    System.out.println(tokens[i]);           
                }
            }
        }
        scan.close();

    }
}