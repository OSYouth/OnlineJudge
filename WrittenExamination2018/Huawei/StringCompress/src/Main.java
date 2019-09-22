/*
* [编程|100分] 字符串压缩
时间限制：C/C++ 3秒，其他语言 6秒
空间限制：C/C++ 65536K，其他语言 131072K
题目描述
将一串由单个空格分割的数字字符串按要求进行处理： - 按从小到大排序 - 去掉重复的 - 出现的数字后面紧跟其出现次数（单个空格分开） 其中所有数字均为正整数，数值最大不超过4000；且单个数字出现的次数不超过200 举例： 输入: "5 5 1 1 1"，输出: "1 3 5 2"，表示1出现3次，5出现2次
输入描述:
合法C字符串，只包含'0'-'9'字符以及空格' '；字符串长度不超过511.
输出描述:
合法C字符串，只包含'0'-'9'字符以及空格' '
示例1
输入

5 5 1 1 1
输出

1 3 5 2*/
//不知道是那个测试用例错了，但是自己测试的时候如果第一个是空格或者回车就会有异常，空格用trim()处理了，但是回车不知道怎么处理，不知道是不是相应这这个测试用例没过

//后期加了判断是不是数字，但是好像没什么效果，把key的类型改成了String，结果00000输出不是0，而是00000，所以后期不知道是不是错的更多还是都对了


import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.nextLine().trim();
            String[] str = line.split(" ");
            HashMap<String,Integer> ans = new HashMap<>();
            Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
//            Pattern pattern = Pattern.compile("[0-9]*");
            for (String s:str) {
                if(pattern.matcher(s).matches()){
                    if(ans.containsKey(s)){
                        int tmp = ans.get(s);
                        tmp++;
                        ans.put(s,tmp);
                    }else{
                        if(s!="" || s!=" ") {
                            ans.put(s, 1);
                        }
                    }
                }
            }
            Set<String> key = ans.keySet();
            StringBuilder res = new StringBuilder();
            for(String k: key) {
                res.append(k);
                res.append(" ");
                res.append(ans.get(k));
                res.append(" ");
            }
            System.out.println(res.toString().trim());
        }
    }
}
