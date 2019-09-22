import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger ans = new BigInteger("1");
        for(int i = 1; i < n+1; i++){
            ans = ans.multiply(new BigInteger("2"));
//            System.out.println(ans);
        }
        System.out.println(ans);
    }
}
