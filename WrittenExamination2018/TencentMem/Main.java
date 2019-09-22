import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int result = -1;
		int min = A-a +1;
		if(B-b<A-a){
			min = B - b +1;
		}
		int times = (int)Math.pow(A/a,0.5) +1;
		System.out.println(times);
		for(int red = 0; red < min; red++){
			for(int blue = 0; blue<times; blue++){
				// System.out.println(blue);
				for(int plus = 0; plus<min; plus++){
					if(A==(a+red)*(int)Math.pow(2,blue)+plus && B==(b+red)*(int)Math.pow(2,blue)+plus && red+blue+plus<min){
						result = red+blue+plus;
					}
				}
			
			}
		}
		System.out.println(result);
	}
}