import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;

        for(int i = 1; i <= n; i++){
            int ans = 0;
            int num = i;
            while( num>0 ){
                int temp = num % 10;
                if(temp == 0){
                    break;
                }
                num = num / 10;
                if((num%10)==temp){
                    break;
                }
                ans = ans + temp;
            }
            if(ans > max){
                max = ans;
            }
        }
        System.out.println(max);
    }
}
