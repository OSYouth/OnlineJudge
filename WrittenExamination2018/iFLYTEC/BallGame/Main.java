import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] name = new String[n];
        String[] cond = new String[n*(n-1)/2];
        HashMap<String, Team>  teams = new HashMap<>();
        for(int i = 0; i < n; i++){
        	name[i] = sc.nextLine();
        	// System.out.println(name[i]);
        }
        for(int i = 0; i < n*(n-1)/2; i++){
        	cond[i] = sc.nextLine();
        	// System.out.println(cond[i] + i);
        	String[] queue = cond[i].split(" ");
        	// System.out.println(queue[0]);
        	String[] t = queue[0].split("-");
        	// System.out.println(t[1]);
            String[] score = queue[1].split(":");
            // System.out.println(score[0] + " " + score[1]);
            teams.put(queue[0], new Team() );
            teams.put(queue[1], new Team() );
            if(Integer.parseInt(score[0]) > Integer.parseInt(score[1])){
            	teams.get(queue[0]).point = teams.get(queue[0]).point + 3;
            	teams.get(queue[1]).point = teams.get(queue[1]).point;
            	teams.get(queue[0]).winBalls = teams.get(queue[0]).winBalls + Integer.parseInt(score[0]) - Integer.parseInt(score[1]);
            	teams.get(queue[1]).winBalls = teams.get(queue[1]).winBalls;
            	teams.get(queue[0]).ballCounts = teams.get(queue[0]).ballCounts + Integer.parseInt(score[0]);
            	teams.get(queue[1]).ballCounts = teams.get(queue[1]).ballCounts + Integer.parseInt(score[1]);
            }
            if(Integer.parseInt(score[0]) == Integer.parseInt(score[1])){
            	teams.get(queue[0]).point = teams.get(queue[0]).point + 1;
            	teams.get(queue[1]).point = teams.get(queue[1]).point + 1;
            	teams.get(queue[0]).winBalls = teams.get(queue[0]).winBalls + Integer.parseInt(score[0]) - Integer.parseInt(score[1]);
            	teams.get(queue[1]).winBalls = teams.get(queue[1]).winBalls;
            	teams.get(queue[0]).ballCounts = teams.get(queue[0]).ballCounts + Integer.parseInt(score[0]);
            	teams.get(queue[1]).ballCounts = teams.get(queue[1]).ballCounts + Integer.parseInt(score[1]);
            }
             if(Integer.parseInt(score[0]) < Integer.parseInt(score[1])){
            	teams.get(queue[0]).point = teams.get(queue[0]).point + 0;
            	teams.get(queue[1]).point = teams.get(queue[1]).point + 3;
            	teams.get(queue[0]).winBalls = teams.get(queue[0]).winBalls + Integer.parseInt(score[1]) - Integer.parseInt(score[0]);
            	teams.get(queue[1]).winBalls = teams.get(queue[1]).winBalls;
            	teams.get(queue[0]).ballCounts = teams.get(queue[0]).ballCounts + Integer.parseInt(score[0]);
            	teams.get(queue[1]).ballCounts = teams.get(queue[1]).ballCounts + Integer.parseInt(score[1]);
            }
        }
        Iterator iter = teams.entrySet().iterator();  
        while (iter.hasNext()) {  
            Map.Entry entry = (Map.Entry) iter.next();  
            Object key = entry.getKey();  
            Integer value = ((Team)entry.getValue()).point;  
            System.out.println(key + ":" + value);  
  
        }  
        System.out.println(n*(n-1)/2);
    }
}

class Team{
	Integer point = 0;
	Integer winBalls = 0;
	Integer ballCounts = 0;
}