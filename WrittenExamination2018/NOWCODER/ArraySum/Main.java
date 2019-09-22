// 20170827
// input:
// 81 4
// 2 2
// output:
// 94.73
// 3.41

import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner in = new Scanner (System.in);
		while(in.hasNext()){
			int num = in.nextInt();
			int count = in.nextInt();
			double result = 0;
			double temp = (double)num;
			for(int i = 0; i < count; i++){
				result = result + temp;
				temp = Math.sqrt(temp);
			}
			System.out.println(String.format("%.2f",result));
		}
	}
}