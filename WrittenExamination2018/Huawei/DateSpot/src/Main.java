/*
* [编程|200分] 约会的站点
时间限制：C/C++ 3秒，其他语言 6秒
空间限制：C/C++ 65536K，其他语言 131072K
题目描述
"简要描述：小丽是小明的女朋友，今天小明约小丽出来，约会地点在郊外，需要搭乘地铁去， 他们选择的两条地铁线，会在某个站点，合并为一条线，而约会地点在终点站。 他们约定好在地铁合并站点碰面，碰面后一起乘地铁去约会地点；
要求：
输出碰面站点，和一共乘坐了多少个地铁站
例如：
输入两条地铁的线路图：
A-B-C-D-E-F-G-H-I-J-K
T-Y-U-H-I-J-K
输出：
H 3 "
输入描述:
输入两条地铁的线路图，从起点到终点
输出描述:
输出碰面的站点名称和一起乘坐的地铁站数（不包含碰面站点）
如果找不到，请输出0 0
示例1
输入

A-B-C-D-E-F-G-H-I-J-K
T-Y-U-H-I-J-K
输出

H 3**/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String[] l1 = sc.nextLine().split("-");
            String[] l2 = sc.nextLine().split("-");
            String spot = "0";
            Integer num = 0;
            boolean flag = false;
            for(int i = 0; i < l1.length; i++){
                for(int j = 0; j < l2.length; j++){
                    if(l1[i].equals(l2[j])){
                        spot = l1[i];
                        num = l1.length - 1 - i;
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            System.out.println(spot + " " + num);
        }
    }
}
