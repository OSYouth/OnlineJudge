import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] before = new int[n];
		for(int i = 0; i < n; i++){
			before[i] = in.nextInt();
			int mark = 0;
			for(int j = 0; j < i; j++){
				if( before[i] < before[j]){
					mark ++;
				}
			}
			System.out.print(mark);
			if(i < n-1){
				System.out.print(" ");
			}else{
				System.out.println();
			}
		}
	}
}