import java.util.Scanner;
class BigDecimal{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();


        for (int i = 0; i < s.length-2; i++) {
            for (int j = 1; j < (n-i); j++) {
                BigDecimal sj = new BigDecimal(s[j]);
                BigDecimal sj1 = new BigDecimal(s[j-1]);
                if(sj.compareTo(sj1) == 1){
                    String temp = s[j];
                    s[j] = s[j-1];
                    s[j-1] = temp;
                }
            }       
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}