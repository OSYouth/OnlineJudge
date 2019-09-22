//wrong answer
//my idea: quick sort(however I do not know how to implement
//			odd:  mid:max/loop:left:max-1/right:max-2
//			even:  loop:midleft:max/midright:max-2
//			for loop the array and count the difference of neighborhood element
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		int[] dis = new int[n/2];
		int[] q = new int[n];
		for(int i = 0; i < n; i++){
			q[i] = in.nextInt();
		}
		//need to sort q[]
		for(int i = 0; i< n/2; i++){
			dis[i] = q[n-1-i] + q[n-2-i];
		}
		for(int i = 0; i< n/2; i++){
			sum = dis[i] +sum;
		}
		System.out.println(sum);
	}
}
