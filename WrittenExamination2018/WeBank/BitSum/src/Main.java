import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        for(int i = 2; i <= n; i++){
            int sum = 0;
            int temp = n;
            while(temp > 0){
                sum = sum + temp%i;
                temp = temp/i;
            }
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
