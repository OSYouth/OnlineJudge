import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] sea = new int[m][n];
        int res = 0;
        for(int si = 0; si < m; si++){
            for(int sj = 0; sj < n; sj++){
                sea[si][sj] = 0;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < k; i++){
            int row = sc.nextInt();
            int col = sc.nextInt();
            sea[row][col] = 1;

            boolean[] mark = new boolean[4]; //四个方向0123东南西北
            for(int mi = 0; mi <4; mi++){
                mark[mi] = false;
            }
            for(int si = 0; si < m; si++){
//                System.out.println();
                for(int sj = 0; sj < n; sj++){
//                    System.out.print(sea[si][sj] + " ");
                    if(row+1<m && sea[row+1][col]==1){
                        mark[0] = true;
                    }
                    if(col+1<n && sea[row][col+1]==1){
                        mark[1] = true;
                    }
                    if(row-1>=0 && sea[row-1][col]==1){
                        mark[2] = true;
                    }
                    if(col-1>=0 && sea[row][col-1]==1){
                        mark[3] = true;
                    }
                }
            }
            int add = 0;
            for(int mi = 0; mi < 4; mi++){
//                System.out.print(mark[mi] + " ");
                if(mark[mi]){
                    add = add + 1;
                }
            }
            if(add==0){
                add = 1;
            }else{
                add = add - 1;
            }
            res  = res +add;
//            System.out.println(add);
            ans.append(res);
            ans.append(" ");
        }
        System.out.println(ans.toString().trim());
    }
}