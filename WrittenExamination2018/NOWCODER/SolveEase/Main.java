import java.util.*;
//家具

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0; i < n; i++){
			x[i] = in.nextInt();
		}
		for(int i = 0; i < n; i++){
			y[i] = in.nextInt();
		}
		int min = x[0] - 2 + y[0];
		for(int i = 1; i < n; i++){
			if(min > x[i] - 2 + y[i]){
				min = x[i] - 2 + y[i];
			}
		}
		System.out.println(min);
	}
}