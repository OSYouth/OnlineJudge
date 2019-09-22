import java.util.Scanner;

public class Main {
	public static int Factorial(int n){
		int f = 1;
		for(int i = n; i > 1; i--){
			f = f * i;
		}
		return f;
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {//注意while处理多个case
            String s = in.nextLine().replaceAll(" ","");
            char[] c = s.toCharArray();
            int result = 1;
            int mark = 0;
            for(int i = c.length -1; i>0; i--){
            	if(c[i] == ')'){
            		mark ++;
            	}else{
            		
            		if( mark > 0){
            			result = result * Factorial(mark);
            		}
            		mark = 0;
            	}
            }
	        
	        System.out.println(result);
        }
    }
}