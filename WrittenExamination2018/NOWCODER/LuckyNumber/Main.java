import java.util.Scanner;

public class Main{
	public int judge(int n){
		int result = 0;
		for(int i = 1; i <= n ; i++){
			int fr = 0;
			int gr = 0;
			int num = i;
			while( num > 0){
				fr = fr + num%10;
				num = num / 10;
			}
			num = i;
			while( num > 0){
				gr = gr + num%2;
				num = num / 2;
			}
			if( fr == gr){
				result++;
			}
		}
		// for(int i = 1; i <= n; i++){
		// 	int fr = 0;
		// 	int gr = 0;
		// 	Integer num = (Integer) i;
		// 	char[] f = num.toString().toCharArray();
		// 	for(int j = 0; j < f.length; j++){
		// 		fr = fr + f[j] - 48;
		// 		// System.out.print(c[j] +" ");
		// 	}
		// 	// System.out.print(i +" " + fr);
		// 	char[] g = Integer.toBinaryString(num).toCharArray();
		// 	for(int j = 0; j < g.length; j++){
		// 		gr = gr + g[j] - 48;
		// 	}
		// 	// System.out.println(" " +gr);
		// 	if(fr == gr){
		// 		result ++;
		// 	}
		// }
		return result;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Main test = new Main();
		System.out.println(test.judge(n));
	}
}