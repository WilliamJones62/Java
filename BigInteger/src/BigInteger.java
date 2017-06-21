import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigInteger {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            BigInteger c = a.add(b);        
            System.out.println(c);
            c = a.multiply(b);        
            System.out.println(c);
            in.close();
    }
}