import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		
		int a, b;
		
		while(in.hasNextInt())
		{
			a = in.nextInt();
			b = in.nextInt();
			System.out.println( a+b );
		}

	}

}
