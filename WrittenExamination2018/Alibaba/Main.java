import java.util.*;
public class Main {

    static int pick(int[] peaches) {
        int max = 0;
        for(int i = 0; i < peaches.length; i++){
            int mark = 0;
            for(int j = i+1; j < peaches.length; j++){
                if( peaches[i] < peaches[j]){
                    mark ++;
                }
            }
            if(mark > max){
                max = mark;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int trees = Integer.parseInt(in.nextLine().trim());
        int[] peaches = new int[trees];
        for (int i = 0; i < peaches.length; i++) {
            peaches[i] = Integer.parseInt(in.nextLine().trim());
        }
        System.out.println(pick(peaches));
    }
}