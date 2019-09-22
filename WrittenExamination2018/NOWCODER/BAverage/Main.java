import java.util.Scanner;

public class Main{
	public int sumOfDif(int num){
		int result = 0;
		for(int i = 2; i < num ; i++){
			int toBeDiv = num;
			while( toBeDiv > 0){
				result = result + toBeDiv%i;
				toBeDiv = toBeDiv / i;
			}
		}
		//more specific code:
		// for(int i = 2; i < num ; i++){
		// 	int toBeDiv = num;
		// 	int temp = 0;
		// 	while( toBeDiv > 0){
		// 		temp = temp + toBeDiv%i;
		// 		toBeDiv = toBeDiv / i;
		// 	}
		// 	result = result + temp;
		// }		
		return result;
	}

	public int gcd(int a, int b){
		while( b != 0){
			int c = a % b;
			a = b;
			b = c;
		}
		int r = a;
		return r;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Main test = new Main();
		int div = test.gcd(test.sumOfDif(n), (n-2));
		// System.out.println(div);
		System.out.println(test.sumOfDif(n)/div + "/" + (n-2)/div);
	}
}