import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
	        // int a = 1;
	        // int b = 1;
	        // int c = 1;
	        // int d = 1;
	        int result = 0;
	        for(int a = 1; a <= n; a++){
	        	for(int b = 1; b <= n; b++){
	        		for(int c = 1; c <= n; c++){
	        			for(int d = 1; d <= n; d++){
	        				if(Math.pow(a,b) == Math.pow(c,d)){
	        					result++;
	        				}
	        				result = result % 1000000007;
	        			}
	        		}
	        	}
	        }
	        System.out.println(result);
        }
    }
}