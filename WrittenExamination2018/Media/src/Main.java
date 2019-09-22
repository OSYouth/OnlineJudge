import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner((System.in));
        while(sc.hasNext()){
            String line = sc.nextLine();
            StringBuilder sb = new StringBuilder(line);
            int ans = 1;
            for(int i = 0; i < line.length()-(sb.length()-1); i++){
                System.out.println(i);
                if(sb.toString().equals(sb.reverse().toString()) && sb.length()>ans){
                    ans = sb.length();
                    break;
                }else{
                    sb = new StringBuilder(sb.substring(i+1));
                }
            }
            System.out.println(ans);
        }

    }
}
