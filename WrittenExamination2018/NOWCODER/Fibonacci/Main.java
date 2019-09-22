import java.util.*;
/**
 * 牛客网易笔试题
 * Fibonacci数列：
 * Fibonacci数列是这样定义的：
 * F[0] = 0
 * F[1] = 1
 * for each i ≥ 2: F[i] = F[i-1] + F[i-2]
 * 因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，在Fibonacci数列中的数我们称为Fibonacci数。
 * 给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少需要多少步可以变为Fibonacci数。
 * 输入描述：
 * 输入为一个正整数N(1 ≤ N ≤ 1,000,000)
 * 输出描述：
 * 输出一个最小的步数变为Fibonacci数"
 * 输入示例：
 * 15
 * 输出示例：
 * 2
 */
public class Main{

	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> fibonacci = new Main().Fibonacci(n);
		// for(int i =0; i < fibonacci.size(); i++){
		// 	System.out.println(fibonacci.get(i));
		// }
		int min = (int) Math.abs(n - fibonacci.get(fibonacci.size()-1));
		int compareToBefore = (int)Math.abs(fibonacci.get(fibonacci.size()-2) - n );
		if( compareToBefore < min){
			min = compareToBefore;
		}
		System.out.println(min);
	}
	//return a fibonacci query which the largest number of it is smaller than n
	public ArrayList<Integer> Fibonacci(int input){
		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(1);
		temp.add(1);
		for(int i = 1; temp.get(i) < input; i++){
			int next = temp.get(i-1) + temp.get(i);
			temp.add(next);
		}
		return temp;
	}
}