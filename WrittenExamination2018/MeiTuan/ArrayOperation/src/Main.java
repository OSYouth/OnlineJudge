import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] init = new int[n];
        for(int i = 0; i < n; i++){
            init[i] = i + 1;
        }
        int temp = 0;
        int mark = 0;
        for(int j = 0; j < m; j++){
            int t = sc.nextInt();
            for(int i = 0; i < n; i++){
                if(t == init[i]){
                    temp = t;
                    mark = i;
                    break;
                }
            }
            for(int i = mark; i > 0; i--){
                init[i] = init[i-1];
            }
            init[0] = temp;
        }
        for(int i = 0; i < n; i++){
            System.out.println(init[i]);
        }
    }
}
