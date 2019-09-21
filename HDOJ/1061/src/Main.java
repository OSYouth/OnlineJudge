import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		while( num>0 )
		{
			int n = in.nextInt();
			int single = n%10;
			int loop = n%4;
			if( loop==0 )
			{
				loop = 4;
			}
			int most_right = 1;
			while( loop>0 )
			{
				most_right = most_right * single;
				loop --;
			}
			System.out.println( most_right%10 );
//			Time Limit Exceeded
//			int a = in.nextInt();
//			int temp = a;
//			int res = 1;
//			while( temp>0 )
//			{
//				res = res*a;
//				res = res%10;
//				temp --;
//			}
//			System.out.println( res );
			num --;
		}
	}
}
