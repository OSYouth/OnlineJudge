import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
            int x = in.nextInt();
            int[][] temp = new int[n][6];
            int ans = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < 6; j++){
                    temp[i][j] = j+1;
                }
            }
        }
    }
}