import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger in = sc.nextBigInteger();

        int ans = 0;
        for(Integer i = 0; in.compareTo(new BigInteger(i.toString()))>=0 ;i++){
            BigInteger temp = new BigInteger(i.toString());
            StringBuilder str = new StringBuilder();
            while(temp.compareTo(new BigInteger("0"))>0){
                str.append(temp.remainder(new BigInteger("2")).toString());
                temp = temp.divide(new BigInteger("2"));

            }
//            System.out.println(str.toString());
            if(str.toString().equals(str.reverse().toString())){
                ans ++;
            }
        }
        System.out.println(ans);
    }
}
