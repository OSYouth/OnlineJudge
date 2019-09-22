/*
* 【题目】
Given an absolute path for a file (Unix-style), simplify it.
For example,
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"
click to show corner cases.
Corner Cases:
Did you consider the case where path = "/../"?
In this case, you should return "/".
Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
In this case, you should ignore redundant slashes and return "/home/foo".
【解析】
题意：简化Unix下的文件路径，包括多余斜杠的去除，当前目录（./）的去除，以及父目录（../）的替代。

题目给的Tags是栈，但我觉得用个队列更方便些，这样简化后的目录就不用倒着生成了。
* */
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        String ans = simplifyPath(path);
        System.out.println(ans);
    }
    public static String simplifyPath(String path) {
        LinkedList<String> queue = new LinkedList<String>();
        String[] names = path.split("/");
        for (int i = 0; i < names.length; i++) {
            if ("".equals(names[i]) || ".".equals(names[i])){
                continue;
            }
            if ("..".equals(names[i])) {
                if (!queue.isEmpty()) {
                    queue.pollLast();
                }
            } else {
                queue.add(names[i]);
            }
        }
        StringBuilder newPath = new StringBuilder();
        while (!queue.isEmpty()) {
            newPath.append("/");
            newPath.append(queue.pollFirst());
        }
        if (newPath.length() == 0){
            return "/";
        }
        return newPath.toString();
    }
}