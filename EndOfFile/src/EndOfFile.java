import java.util.ArrayList;
import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);		
        ArrayList<String> al = new ArrayList<String>();
        while (sc.hasNext()){
            al.add(sc.nextLine());
        }
        
        for(int i=0;i<al.size();i++){

            System.out.println((i+1) + " " + al.get(i));
        }
        sc.close();
    }
}