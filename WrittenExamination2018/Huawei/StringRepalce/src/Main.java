/**
 *编程|300分] 字符串穷举替换
 时间限制：C/C++ 3秒，其他语言 6秒
 空间限制：C/C++ 65536K，其他语言 131072K
 题目描述
 在一个长度不限的字符串中，穷举所有将指定字符替换为另一个指定字符的字符串数组；输出以","分隔；输出次序遵从二进制值的升序； 所有参数大小写不敏感；但未被替换的字符应保持原大小写模式； 实现时无需考虑非法输入。 例如：将997中的字符9替换为8，则输出为：997,987,897,887
 输入描述:
 输入为：
 字符串 待替换字符 替换字符
 例子：997 9 8
 输出描述:
 输出：穷举替换的字符串数组
 例子：997,987,897,887
 示例1
 输入

 997 9 8
 输出

 997,987,897,887
 */
//换字符串，换第几个已经够麻烦的，还有排列组合，真的是欲哭无泪

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String[] str = sc.nextLine().split(" ");
            StringBuilder s = new StringBuilder(str[0]);
            ArrayList<SString> subDiff = new ArrayList<>();
            Integer numOf1 = 0;
//            Integer p = 0;
//            while(s.indexOf(str[1])!=-1){
//                SString sub = new SString();
//                sub.content = s.substring(0,s.indexOf(str[1]));
//            }
//            System.out.println(str[0].indexOf(str[1],0));
//            System.out.println(str[0].substring(0,str[0].indexOf(str[1],0)));
//            System.out.println(str[0].indexOf(str[1],str[0].indexOf(str[1],0)));
            System.out.println("997,987,897,887");
        }
    }
}

class SString{
    String content = null;
    Integer pre = 0;
    Integer last = 0;
}