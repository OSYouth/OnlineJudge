import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> init = new ArrayList<>();
        for (int i = 0; i < n; i++){
            init.add(i+1);
        }
        int[] temp = new int[m];
        for(int i = 0; i < m; i++){
            temp[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = m-1; i >= 0; i--){
            if(init.contains(temp[i])){
                ans.add(temp[i]);
                init.remove(temp[i]);
            }
        }
        for(Integer i:init){
            ans.add(i);
        }
        for(Integer i:init){
            System.out.println(i);
        }
    }
}
