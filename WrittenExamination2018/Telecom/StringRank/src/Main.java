import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] temp = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for(int i = 0;i < temp.length; i++){
            list.add(temp[i]);
        }
        Collections.sort(list);
        for(Character c : list){
            System.out.print(c);
        }

    }
}