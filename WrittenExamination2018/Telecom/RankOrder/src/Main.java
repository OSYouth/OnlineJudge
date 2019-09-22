import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] temp = new Integer[n];
        ArrayList<Integer> rank = new ArrayList<>();

        for(int i = 0; i < n; i++){
            temp[i] = sc.nextInt();
//            System.out.println(temp[i]);
        }
        HashMap<String, String> map = new HashMap<>();
        System.out.println(map.put("5","   d"));
        for(int i = 0; i < n; i++){
//            System.out.println(temp[i] + "," + map.put(temp[i],7));
//            map.put(temp[i],temp[i]);
        }
        for(int i = 0; i < map.size(); i++){
           System.out.println(map.get(i));
        }

    }
}