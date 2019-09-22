import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ca = sc.nextLine().toCharArray();
        boolean[] flag = new boolean[ca.length];
        ArrayList<Integer> ans = new ArrayList<>();
        int temp = 0;
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < ca.length; i++) {
            if(ca[i]<='9' && ca[i]>='0'){
                flag[i] = true;
            }else {
                flag[i] = false;
            }
        }
        for(int i = 0; i < ca.length; i++){
//            System.out.print(flag[i] + " ");
            if(flag[i]){
                temp = temp * 10 + (ca[i]-48);
            }
            if(i-1>0 && !flag[i] && flag[i-1]){
                ans.add(temp);
                temp = 0;
            }
            if(i==ca.length-1 && flag[i]){
                ans.add(temp);
            }
        }
        for(int i = 0; i < ans.size(); i++){
            res.append(ans.get(i));
            res.append(" ");
        }
        System.out.println(res.toString().trim());
    }
}