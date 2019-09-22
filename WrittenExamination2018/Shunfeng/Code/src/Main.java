import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int[] solve(int[] a) {
        int ans_length = a.length;
        int[] ans = new int[ans_length];
        ArrayList<Integer> temp = new ArrayList<Integer>();
//        for(int i = ans_length-1; i>=0; i--){
            for(int j = ans_length-1; j>=0; j--){
                int tmp = a[j];
                int flag = 1;
                for(int k=0; k<ans_length-j-1; k++){
                    tmp = tmp + flag*temp.get(temp.size()-1-k);
                    flag = -1*flag;
                }
//                System.out.println(tmp);
                temp.add(tmp);
            }
//        }
        for(int i =0; i<ans_length; i++){
            ans[i] = temp.get(ans_length-1-i);
        }
        return  ans;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;

        int _a_size = 0;
        _a_size = Integer.parseInt(in.nextLine().trim());
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(in.nextLine().trim());
            _a[_a_i] = _a_item;
        }

        res = solve(_a);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
