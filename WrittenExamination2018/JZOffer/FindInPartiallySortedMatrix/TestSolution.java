import java.util.Scanner;
public class TestSolution{
	public static void main(String[] args){
		Solution s = new Solution();
		Scanner in = new Scanner(System.in);
		int target = in.nextInt();
		int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};

		System.out.println(s.Find(7,array));
	}
}