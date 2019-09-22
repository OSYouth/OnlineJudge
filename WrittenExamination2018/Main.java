import java.lang.*;
import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a, b;
		while(in.hasNextInt()){
			a = in.nextInt();
			b = in.nextInt();
			a = rev(a);
			b = rev(b);
			System.out.println(rev(a+b));
		}

	}

	public int rev(int num){
		int result = 0;
		int[] temp = new int[4];
		int count = 0;	//count how many byte of the number
		for(int i = 0; i < 4; i++){
			temp[i] = num % 10;
			num = num / 10;
			count ++;
		}
		c = count - 1;
		for(int i = 0; i < count; i++){
			result = result + Math.pow(temp[i], c);
			c --;
		}
		return result;
	}
}