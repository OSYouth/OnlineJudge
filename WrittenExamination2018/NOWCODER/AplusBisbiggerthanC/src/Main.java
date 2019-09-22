import java.math.BigInteger;
import java.util.Scanner;
public class Main{
    public static  void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < 4; i++){
            boolean isBigger = false;
            String ain = in.next();
            String bin = in.next();
            String cin = in.next();
            BigInteger a = new BigInteger(ain);
            BigInteger b = new BigInteger(bin);
            BigInteger c = new BigInteger(cin);
            if(a.add(b).compareTo(c)>0){
                isBigger = true;
            }
            System.out.println("Case #" + (i+1) + ": " + isBigger);
        }
    }

}