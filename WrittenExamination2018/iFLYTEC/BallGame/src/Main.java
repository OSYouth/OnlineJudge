import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        String[] cond = new String[n*(n-1)/2];

        Integer[] score = new Integer[2];
        HashMap<Team,String>  teams = new HashMap<Team, String>();
        for(int i = 0; i < n + n*(n-1)/2; i++){
            if(i < 4){
                name[i] = sc.nextLine();
                System.out.println(name[i]);
            }
            else{
                cond[i] = sc.nextLine();
            }
            cond[i] = sc.nextLine();
        }
        for(int i = 0; i < n*(n-1)/2; i++){
            cond[i] = sc.nextLine();
            System.out.println(cond[i] +" " + i);
            String[] queue = cond[i].split(" ");

            System.out.println(queue[0]);
        }
        System.out.println(n*(n-1)/2);
    }
}

class Team{
    Integer point;
    Integer winBalls;
    Integer ballCounts;
}