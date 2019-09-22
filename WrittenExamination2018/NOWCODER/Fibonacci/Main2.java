import java.util.*;

public class Main2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		// boolean[] temp = new boolean[1000000];
		// for(int i = 0; i < 4; i++){
		// 	temp[i] = true;
		// }
		int m = 1;
		int m1 = 2;
		int compareToNext = 0;
		int min = 0;
		while( m1 < n){
			 int mark = m1;
			 m1 = m1 + m;
			 m = mark;
			 // temp[m1] = true;
		}
		// System.out.println(m + " " +m1);
		min = n - m;
		if(m1 - n < min){
			min = m1 - n;
		}
		System.out.println(min);

	}
}