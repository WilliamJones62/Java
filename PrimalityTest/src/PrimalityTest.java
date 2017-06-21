import java.util.*;
import java.math.*;

public class PrimalityTest {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      Boolean b;
      b = n.isProbablePrime(1);
      if (b){
        System.out.println("prime");
      } else {
         System.out.println("not prime");         
      }
   }
}