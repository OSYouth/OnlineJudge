// 20170827
// case input:
// 100 120
// 300 380
// output:
// no
// 370 371

import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int begin = in.nextInt();
			int end = in.nextInt();
			ArrayList<Integer> result = new ArrayList<Integer>();
			for(int i = begin; i <= end; i++){
				int sum = 0;
				int temp = i;
				while( temp > 0){
					sum = sum + (int)Math.pow((temp%10),3);
					temp = temp/10;
				}
				if(sum == i){
					result.add(i);
					// System.out.println(i);
				}
			}
			if(result.isEmpty()){
				System.out.println("no");
			}else{
				for(int i = 0; i < result.size() - 1; i++){
					System.out.print(result.get(i) + " ");
				}
				System.out.println(result.get(result.size() - 1));
			}	
		}
	}
}