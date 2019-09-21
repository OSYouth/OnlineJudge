import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		while( num>0 )
		{
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println( a+b );
			num --;
		}
	}

}
