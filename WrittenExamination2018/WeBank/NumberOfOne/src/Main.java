import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = 0;
        //the third try, unbelievable result
        if(a==b){
            ans = 1;
        }else{
            ans = 2;
        }
        int max = a;
        int min = b;
        if(a<b){
            max = b;
            min = a;
        }
        if(c==a || c==b){
            ans = 1;
        }else if ( c < min){
            ans = ans + min - c -1;
        }else if( c > max){
            ans = c - ans;
        }

        //the second try
//        Integer temp = (int)(Math.pow(2,a) - Math.pow(2,c) + Math.pow(2,b));
//        char[] array = Integer.toBinaryString(temp).toCharArray();
//        for(int i = 0; i < array.length; i++){
//            if(array[i]=='1'){
//                ans++;
//            }
//        }

        //the first try
//        BigInteger ta = new BigInteger("1");
//        BigInteger tb = new BigInteger("1");
//        BigInteger tc = new BigInteger("1");
//        for(int i = 0; i < a; i++){
//            ta = ta.multiply(new BigInteger("2"));
//        }
//        for(int i = 0; i < b; i++){
//            tb = tb.multiply(new BigInteger("2"));
//        }
//        for(int i = 0; i < c; i++){
//            tc = tc.multiply(new BigInteger("2"));
//        }
//        BigInteger temp = ta.add(tb).subtract(tc);
//        while(temp.compareTo(new BigInteger("0"))>0){
//            if(temp.remainder(new BigInteger("2")).equals(new BigInteger("1"))){
//                ans++;
//            }
//            temp = temp.divide(new BigInteger("2"));
//        }
        System.out.println(ans);
    }
}
