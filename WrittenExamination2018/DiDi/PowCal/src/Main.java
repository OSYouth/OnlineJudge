import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigDecimal r = in.nextBigDecimal();
        int n = in.nextInt();
        BigDecimal ans = new BigDecimal("1");
        for(Integer i = 0; i < n; i++){
            ans = ans.multiply(r);
        }
        System.out.println(ans.toString());
    }
}