import java.util.Arrays;
import java.util.Scanner;

/**
 * n个骰子和出现可能值得概率
 * 使用一个长度为n的数组存放n个骰子的取值，递归n次即可
 * @author yj
 *
 */
public class Touzi {
    static int count = 0;
    static int possible = 0;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int detph = sc.nextInt();
        int mark = sc.nextInt();
        int [] data = new int[detph];
//        System.out.println("begin...");
        //fun1(1, detph, sum, data);
        for(int i=1; i<=6; i++){
            data[detph-1] = i;
            fun1(i, detph, sum, data, mark);
        }
        /**/
//        System.out.println(possible);
//        System.out.println(count-2);

        count = count - 2;
        int gcd = GCD(possible,count);
        if(possible == 0){
            System.out.println(possible);
        }else if(possible > 0 && possible==count-2){
            System.out.println(1);
        }else {
            System.out.println(possible/gcd + "/" + count/gcd);
        }
//        System.out.println("end");
    }
    public static int GCD(int a,int b) {
        return b==0?a:GCD(b,a%b);
    }
    /**
     * 只能求出点数和的可能
     * @param k 当前骰子点数
     * @param detph 常量，骰子个数，亦即递归深度
     * @param sum 当前所有骰子点数和
     * @param data 存放n个骰子的数组
     */
    public static void fun1(int k, int detph,int sum,int[] data, int mark){
        sum+=k;
        --detph;
        if(detph<=0){
//            System.out.print(sum+"#");
//            System.out.println(Arrays.toString(data));
            count++;
            if(sum >= mark) {
                possible++;
            }
            return;
        }
        for(int i=k; i<=6; i++){
            data[detph-1] = i;
            fun1(i, detph, sum, data, mark);
        }
    }
}
