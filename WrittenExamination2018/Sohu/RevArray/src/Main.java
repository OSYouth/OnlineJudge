
//wrong answer
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
            int[] array = new int[n];
            int ans = 0;
            for(int i = 0; i < n; i++) {
                array[i] = in.nextInt();
                ans = ans + array[i];
            }
            //System.out.println(ans);
            for(int i = 0; i < n/2; i++){
                if(array[i] != array[n-1-i]){
                    ans = ans + array[i] + array[n-1-i];
                }
            }
            System.out.println(ans);
        }
    }
}