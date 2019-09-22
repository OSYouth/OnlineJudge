import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {//注意while处理多个case
            String s = in.nextLine();
            int max = 0;
            int mark = 0;
        	char[] c = new char[s.length()];
        	for(int i = 0; i < s.length()-1; i++){
        		if(s.charAt(i)!=s.charAt(i+1))        		{
        			mark++;
        		}
        		else{
        			mark = 0;
        		}
        		if(mark>max){
    				max = mark;
    			}
        	}
            System.out.println(max+1);
        }
    }
}