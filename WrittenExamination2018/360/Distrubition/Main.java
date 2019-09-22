//it could be a DP problem, I didn't solve it

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		int profit = 0;
		int max = 0;
		for(int ia = 0; ia <= a; ia++){
			for(int id = 0; ia+id <=n; id ++){
				for(int ib = 0; ib <= b; ib++){
					for(int ic = 0; ic+ib <= m; ic++){
						int numx = 0;
						int numy = 0;
						int numz = 0;
						if(ia==0 || ib==0){
							numx = 0;
						}else if((n/ia) > (m/ib)){
							numx = m/ib;
						}else{
							numx = n/ia;
						}
						if(ic==0 ){
							numy = 0;
						}else{
							numy = n/ic;
						}
						if(id==0){
							numz = 0;
						}else{
							numz = n/id;
						}
						profit = x*numx + y*numy + z*numz;
						if(profit > max){
							max = profit;
						}
					}
				}
			}
		}
		System.out.println(max);
	}
}