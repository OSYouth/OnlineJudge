import java.lang.*;
import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Main test = new Main();
		int a, b;
		while(in.hasNextInt()){
			a = in.nextInt();
			b = in.nextInt();
			a = test.rev(a);
			b = test.rev(b);
			System.out.println(test.rev(a+b));
		}

	}

	public int rev(int num){
		int result = 0;
		int[] temp = new int[4];

		if(num>999){
			temp[0] = num/1000;
			temp[1] = (num-temp[0]*1000)/100;
			temp[2] = (num-temp[0]*1000-temp[1]*100)/10;
			temp[3] = num %10;
			result = temp[0] + temp[1]*10 + temp[2]*100 + temp[3]*1000;
		}else if( num > 99){
			temp[0] = num/100;
			temp[1] = (num-temp[0]*100)/10;
			temp[2] = num % 10;
			result = temp[0] + temp[1]*10 + temp[2]*100;
		}else if(num > 9){
			temp[0] = num/10;
			temp[1] = num%10;
			result = temp[0] + temp[1]*10;
		}else{
			result = num;
		}
		
		return result;
	}
}