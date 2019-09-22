import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 2; i < 6; i++){
            int temp = n;
            while (temp > 0){
                ans = ans + (temp%i);
                temp = temp/i;
            }
        }
        System.out.println(ans);
    }
}
